package Frames;


import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class Login extends JFrame implements MouseListener,ActionListener
{
	JLabel userLabel,passLabel,imgLabel,nameLabel,nameLabel2,nameLabel3;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn, signupBtn;
	JPanel panel;
	ImageIcon img;
	
	public Login()
	{
		super("Online Store");
		this.setSize(900,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Color myColor=new Color(44,255,255);
		Font myFont=new Font("Segoe UI",Font.BOLD,17);
		Font myFont1=new Font("Segoe UI",Font.BOLD,15);
		Font myFont2=new Font("Segoe UI",Font.PLAIN,29);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		userLabel = new JLabel("Log In");
		userLabel.setBounds(150,10,100,50);
		userLabel.setBackground(Color.RED);
		userLabel.setOpaque(false);
		userLabel.setForeground(Color.BLACK);
		userLabel.setFont(myFont2);
		panel.add(userLabel);
		
		userLabel = new JLabel("User : ");
		userLabel.setBounds(30,70,110,50);
		userLabel.setBackground(Color.RED);
		userLabel.setOpaque(false);
		userLabel.setForeground(Color.BLACK);
		userLabel.setFont(myFont);
		panel.add(userLabel);
		
		userTF =new JTextField();
		userTF.setBounds(120,80,200,40);
		userTF.setBackground(Color.WHITE);
		panel.add(userTF);
		
		
		passLabel = new JLabel("Password: ");
		passLabel.setBounds(30,130,110,50);
		passLabel.setBackground(Color.RED);
		passLabel.setOpaque(false);
		passLabel.setForeground(Color.BLACK);
		passLabel.setFont(myFont);
		panel.add(passLabel);
		
		passPF =new JPasswordField();
		passPF.setBounds(120,140,200,40);
		passPF.setBackground(Color.WHITE);
		passPF.setEchoChar('*');
		panel.add(passPF);
		
		nameLabel = new JLabel("Created by");
		nameLabel.setBounds(130,350,110,40);
		nameLabel.setBackground(Color.RED);
		nameLabel.setForeground(Color.GRAY);
		nameLabel.setOpaque(false);
		nameLabel.setFont(myFont1);
		panel.add(nameLabel);
		
		nameLabel2 = new JLabel("Tanvir Zaman(25-63277-3)");
		nameLabel2.setBounds(75,380,200,40);
		nameLabel2.setBackground(Color.RED);
		nameLabel2.setForeground(Color.GRAY);
		nameLabel2.setOpaque(false);
		nameLabel2.setFont(myFont1);
		panel.add(nameLabel2);
		
		nameLabel3 = new JLabel("Ahmed Fahad(25-63242-3)");
		nameLabel3.setBounds(75,410,200,40);
		nameLabel3.setBackground(Color.RED);
		nameLabel3.setForeground(Color.GRAY);
		nameLabel3.setOpaque(false);
		nameLabel3.setFont(myFont1);
		panel.add(nameLabel3);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(50,210,100,50);
		loginBtn.setBackground(Color.GRAY);
		loginBtn.setForeground(Color.BLACK);
		loginBtn.setFocusPainted(false);
		//loginBtn.setFont(myFont1);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(200,210,100,50);
		exitBtn.setBackground(Color.GRAY);
		exitBtn.setForeground(Color.BLACK);
		exitBtn.setFocusPainted(false);
		//exitBtn.setFont(myFont1);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		signupBtn=new JButton("SignUp");
		signupBtn.setBounds(120,280,100,50);
		signupBtn.setBackground(Color.GRAY);
		signupBtn.setForeground(Color.BLACK);
		//signupBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		//signupBtn.setContentAreaFilled(false);
		signupBtn.setFocusPainted(false);
		//signupBtn.setFont(myFont1);
		signupBtn.addMouseListener(this);
		signupBtn.addActionListener(this);
		panel.add(signupBtn);
		
		img=new ImageIcon("Images/new.jpg");
		imgLabel =new JLabel(img);
		imgLabel.setBounds(0,0,1200,500);
		panel.add(imgLabel); 
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==loginBtn)
		{
			loginBtn.setBackground(Color.WHITE);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==signupBtn)
		{
			signupBtn.setBackground(Color.WHITE);
			signupBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==exitBtn)
		{
			exitBtn.setBackground(Color.WHITE);
			exitBtn.setForeground(Color.BLACK);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==loginBtn){loginBtn.setBackground(Color.GRAY);}
		else if(me.getSource()==signupBtn){signupBtn.setBackground(Color.GRAY);}
		else if(me.getSource()==exitBtn){exitBtn.setBackground(Color.GRAY);}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==signupBtn)
		{
			this.setVisible(false);
			Register r1=new Register();
			r1.setVisible(true);
		}
		
		if(ae.getSource()==exitBtn)
		{
			this.setVisible(false);
		}
		
		if(ae.getSource()==loginBtn)
		{
			String s1=userTF.getText();
			String s2=passPF.getText();
			
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			
			else
			{
				Account a1=new Account();
				if(a1.getAccount(s1,s2)==true)
				{
					this.setVisible(false);
					Homepage h1=new Homepage(s1);
					h1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Not ok");
				}
				
			}
			
		}
	
	
	
	}
}