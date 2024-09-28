import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.sql.*;
import java.sql.CallableStatement;

/*
<applet code="SignIn"
height=100 width=200>
</applet>
*/
public class SignIn extends Applet implements ActionListener
{
TextField t1,t2,t3,t4;
Button b;

	public void init()
	{
		setLayout(new GridLayout(3,2));
		add(new Label("SName:"));
		t1=new TextField();
		add(t1);
		add(new Label("RegNo:"));	
		t2=new TextField();		
		add(t2);
		add(new Label("Date:"));
		t3=new TextField();
		add(t3);
		add(new Label("Address:"));	
		t4=new TextField();		
		add(t4);
		b=new Button("Insert");
		b.addActionListener(this);
		add(b);		
		try{
				}catch(Exception e){}
	}
  
	public void actionPerformed(ActionEvent ae)
     		{
		PreparedStatement pstmt;
		String s1,s2;
		
		  try{
			  System.out.println("Connection created");
		    
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	 
		    Connection c=DriverManager.getConnection("jdbc:odbc:friends");
			
		    pstmt=c.prepareStatement("insert into student values sname=?,regno=?,date=?,address=?");
		    System.out.println("Executing SQL:");
			pstmt.setString(1,t1.getText());
			pstmt.setString(2,t2.getText());
			pstmt.setString(3,t3.getText());
			pstmt.setString(4,t4.getText());
            ResultSet rs=pstmt.executeQuery();
			c.close();
			}
	
	catch(Exception e)
		{
         System.out.println("Inside:"+e);
		}
		
}
}



