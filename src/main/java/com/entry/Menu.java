package com.entry;

import java.util.Date;
import javax.persistence.*;

public class Menu {
    @Id
    @Column(name = "menu_id")
    private String menuId;

    @Column(name = "menu_name")
    private String menuName;

    /**
     * 资源类型，菜单或都按钮(menu,button)
     */
    @Column(name = "menu_type")
    private String menuType;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "menu_code")
    private String menuCode;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "parent_ids")
    private String parentIds;

    @Column(name = "child_num")
    private Integer childNum;

    private Integer listorder;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * @return menu_id
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取资源类型，菜单或都按钮(menu,button)
     *
     * @return menu_type - 资源类型，菜单或都按钮(menu,button)
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 设置资源类型，菜单或都按钮(menu,button)
     *
     * @param menuType 资源类型，菜单或都按钮(menu,button)
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    /**
     * @return menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return menu_code
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * @param menuCode
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * @return parent_id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * @param parentIds
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * @return child_num
     */
    public Integer getChildNum() {
        return childNum;
    }

    /**
     * @param childNum
     */
    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    /**
     * @return listorder
     */
    public Integer getListorder() {
        return listorder;
    }

    /**
     * @param listorder
     */
    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}