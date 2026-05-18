package Frames;


import java.lang.*;
import javax.swing.*;
import java.awt.event.*;


public class Register extends JFrame implements ActionListener {
	
	JLabel namlbl, namlbl2, namlbl3,namlbl4, passlbl, passlbl2;
	JTextField namfld, namfld2, namfld3,namfld4 ;
	JPasswordField passfld, passfld2 ;
	JButton signupBtn,backBtn;
	JPanel panel;
	
	public Register() {
	
		super("Registration");
		this.setSize(900,500);
		this.setLocationRelativeTo(null);
	
		panel=new JPanel();
		panel.setLayout(null);
		
		namlbl=new JLabel("First Name");
		namlbl.setBounds (150,50,110,50);
		panel.add(namlbl);
		
		namfld= new JTextField();
		namfld.setBounds(150,90,200,40);
		panel.add(namfld);
		
		namlbl2=new JLabel("Last Name");
		namlbl2.setBounds (150,130,110,50);
		panel.add(namlbl2);
		
		namfld2= new JTextField();
		namfld2.setBounds(150,170,200,40);
		panel.add(namfld2);
		
		namlbl3=new JLabel("Email");
		namlbl3.setBounds (500,50,110,50);
		panel.add(namlbl3);
		
		namfld3= new JTextField();
		namfld3.setBounds(500,90,200,40);
		panel.add(namfld3);
		
		namlbl4=new JLabel("User Name");
		namlbl4.setBounds (150,210,110,50);
		panel.add(namlbl4);
		
		namfld4= new JTextField();
		namfld4.setBounds(150,250,200,40);
		panel.add(namfld4);
		
		passlbl=new JLabel("Password");
		passlbl.setBounds(500,130,110,50);
		panel.add(passlbl);
		
		passfld= new JPasswordField();
		passfld.setBounds(500,170,200,40);
		panel.add(passfld);
		
		passlbl2=new JLabel("Re-Type Password");
		passlbl2.setBounds(500,210,110,50);
		panel.add(passlbl2);
		
		passfld2= new JPasswordField();
		passfld2.setBounds(500,250,200,40);
		panel.add(passfld2);
		
		signupBtn = new JButton("SignUp");
		signupBtn.setBounds(330,350,100,50);
		signupBtn.addActionListener(this);
		panel.add(signupBtn);
		
		backBtn=new JButton("Back");
		backBtn.setBounds(450,350,100,50);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		this.add(panel);
	}
	  
	  
	   public void actionPerformed(ActionEvent ae)
	   {
		   String s1=namfld.getText();
		   String ss1=namfld2.getText();
		   String sss1=namfld3.getText();
		   String ssss1=namfld4.getText();
		   String s2=passfld.getText();
		   String ss2=passfld2.getText();
		   
		   if(ae.getSource()==signupBtn)
		   {
			   if(s1.isEmpty()||ss1.isEmpty()||sss1.isEmpty()||sss1.isEmpty()||ssss1.isEmpty() ||s2.isEmpty()||ss2.isEmpty())
			   {
					JOptionPane.showMessageDialog(null,"Fill Up All");
				}
				else if(!s2.equals(ss2))
				{
					JOptionPane.showMessageDialog(null,"Different Passwords");
				}
		  else
		  {
				Account a1=new Account (s1,ss1,sss1,ssss1,s2);
				a1.addAccount();
			  
				this.setVisible(false);
				Login L1=new Login();
				L1.setVisible(true);
		  }
		   }
		   else if(ae.getSource()==backBtn)
		   {
			   this.setVisible(false);
			   Login L1= new Login();
			   L1.setVisible(true);
		   }
	   }
}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		