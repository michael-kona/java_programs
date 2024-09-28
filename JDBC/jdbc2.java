import java.util.*;
import java.sql.*;
class  jdbc2
{
	public static void main(String args[])
	{
		try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:rajiv1","scott","tiger");
	DatabaseMetaData dm=c.getMetaData();
	System.out.println("Database Name:"+dm.getDatabaseProductName());
    System.out.println("Database version :"+dm.getDatabaseProductVersion());
	System.out.println("Database URL:"+dm.getURL());
	System.out.println("user name:"+dm.getUserName());
	System.out.println("Database Driver"+dm.getDriverName());
	System.out.println("Database Driver Version:"+dm.getDriverVersion());
	System.out.println("Major Version :"+dm.getDriverMajorVersion());
    System.out.println("Major Version :"+dm.getDriverMinorVersion());
	ResultSet rs=dm.getTables(null,null,null,null);
	while(rs.next())
	{
		System.out.println(rs.getString(3));
	}
	c.close();
	}
	catch(Exception e)
		{
         System.out.println(e);
         System.out.println("Cannot find the class");
		}
}
}



