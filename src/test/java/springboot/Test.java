package springboot;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Test {

	public static void main(String[] args) {
		Connection con=null;
	        try
	        {
	            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shiro?useSSL=false&useUnicode=true&characterEncoding=UTF-8","root","root123");
	            //Class.forName("oracle.jdbc.driver.OracleDriver");
	            //con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	            PreparedStatement statement= (PreparedStatement) con.prepareStatement("select * from admin where admin.username='admin'");
	            ResultSet  result=statement.executeQuery();
	            System.out.println(result.toString());
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	  
	}
}
