// importing necessary libraries  
import javax.swing.*;
import java.awt.*;    
import java.awt.event.*;    
public class ButtonExample implements ActionListener
 {    
	JLabel l;
	JFrame f;
	public ButtonExample()
		{
		   // create instance of frame with the label   
		    f = new JFrame("Button Example");    

		    l=new JLabel();    
		    l.setBounds(50,50, 150,20);  
		
		    // create instance of button with label  
		    JButton b=new JButton("Click Here");   
 
		    // set the position for the button in frame   
		    b.setBounds(50,100,160,30);  
 
		    b.addActionListener(this);

		// adding button the frame  
		    f.add(b);  
		// adding Label the frame  
		    f.add(l);    
		// setting size, layout and visibility   
		    f.setSize(400,400);    
		    f.setLayout(null);  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		    f.setVisible(true);  
		}
	public static void main(String[] args) 
		{    
		     ButtonExample be=new ButtonExample();  
		  }
	  public void actionPerformed (ActionEvent e) 
		{    
		   l.setText("Welcome to Swings/AWT in java");    
        	}    
    }
