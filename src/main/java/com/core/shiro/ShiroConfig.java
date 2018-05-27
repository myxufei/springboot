package com.core.shiro;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ShiroConfig {
	Logger logger= LoggerFactory.getLogger(this.getClass());
    @Bean
	public DefaultWebSecurityManager securityManager() {
    	DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
		securityManager.setRealm(createRealm());
		return securityManager;
	}
    @Bean
    public Realm createRealm() {
    	UserRealm realm=new UserRealm();
    	return realm;
    }
    @Bean
    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager) {
    	ShiroFilterFactoryBean filter=new ShiroFilterFactoryBean();
    	filter.setSecurityManager(securityManager);
    	Map<String,String> map=new HashMap<String,String>();
//    	map.put("/assets/*/**", "anon");
//    	map.put("/**/login", "anon");
//    	map.put("/**/logout", "logout");
//    	map.put("/**/reg", "anon");
//    	map.put("/member/**", "user");
    	filter.setFilterChainDefinitionMap(map);
    	return filter;
    }
    /**
     * 注入LifecycleBeanPostProcessor
     * @return
     */
    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        logger.debug("ShiroConfiguration.lifecycleBeanPostProcessor()");
        return new LifecycleBeanPostProcessor();
    }
    /**
     * 凭证匹配器
     * （由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了
     *  所以我们需要修改下doGetAuthenticationInfo中的代码;
     * ）
     * @return
     */
    @Bean(name = "adminHashedCredentialsMatcher")
    public HashedCredentialsMatcher adminHashedCredentialsMatcher(){
        logger.debug("ShiroConfiguration.adminHashedCredentialsMatcher()");
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列算法:这里使用MD5算法;
        hashedCredentialsMatcher.setHashIterations(2);//散列的次数，当于 m比如散列两次，相d5(md5(""));
        return hashedCredentialsMatcher;
    }
    @ConditionalOnMissingBean
    @Bean(name = "defaultAdvisorAutoProxyCreator")
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        logger.debug("ShiroConfiguration.getDefaultAdvisorAutoProxyCreator()");
        DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
        daap.setProxyTargetClass(true);
        return daap;
    }
} 
