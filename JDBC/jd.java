import java.util.*;
import java.sql.*;

class  jd
{
	public static void main(String[] args) 
	{
try
   {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Enumeration d=DriverManager.getDrivers();
	System.out.println("Available Drivers are:");
	while(d.hasMoreElements())
	{
	Driver driver=(Driver)d.nextElement();
	System.out.println("Driver:"+driver.getClass().getName());
  	System.out.println("Major version"+driver.getMajorVersion());
    System.out.println("Minor version"+driver.getMinorVersion());
	}
   }catch(Exception e)
		{
			System.out.println(e);
	
			System.out.println("Class cannot found");
		}
	}
}


   
