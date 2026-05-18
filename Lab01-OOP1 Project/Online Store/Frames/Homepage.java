package Frames;


import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener
{
	JLabel imgLabel, userN, userN1, userN2, userN3, c0, c01, c1name, c2name, c3name;
	JButton logoutBtn, c1, c2, c3;
	ImageIcon imgset, imgcart, img, img1, img2, img3;
	Color myColor;
	JMenuItem set1,cart;
	Font myFont1=new Font("Segoe UI",Font.ITALIC,20);
	Font myFont2=new Font("Cambria",Font.PLAIN,30);
	JPanel panel;
	String UserH;
	
	
	public Homepage(String s1)
	{
		super("Online Store-Homepage");
		this.UserH=s1;
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		
		
		
		userN=new JLabel("User: "+s1);
		userN.setBounds(60,40,200,30);
		userN.setFont(new Font("Cambria",Font.PLAIN,30));
		userN.setOpaque(false);
		panel.add(userN);
		
		userN1=new JLabel("Make Your");
		userN1.setBounds(415,40,200,30);
		userN1.setFont(new Font("Cambria",Font.PLAIN,35));
		userN1.setOpaque(false);
		panel.add(userN1);
		
		userN2=new JLabel("~DREAM~");
		userN2.setBounds(425,80,200,30);
		userN2.setFont(new Font("Cambria",Font.PLAIN,30));
		userN2.setOpaque(false);
		panel.add(userN2);
		
		userN3=new JLabel("Room Decor!!");
		userN3.setBounds(400,120,250,30);
		userN3.setFont(new Font("Cambria",Font.PLAIN,35));
		userN3.setOpaque(false);
		panel.add(userN3);
		
		logoutBtn = new JButton("Log Out");
		logoutBtn.setBounds(830,40,100,50);
		logoutBtn.setBackground(Color.ORANGE);
		logoutBtn.setForeground(Color.BLACK);
		logoutBtn.setFocusPainted(false);
		//logoutBtn.setFont(myFont1);
		//logoutBtn.addMouseListener(this);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		c0=new JLabel("Catagory");
		c0.setBounds(435,180,200,40);
		c0.setFont(new Font("Cambria",Font.BOLD,26));
		c0.setOpaque(false);
		panel.add(c0);
		
		c01=new JLabel("___________");
		c01.setBounds(435,190,200,40);
		c01.setFont(new Font("Cambria",Font.BOLD,26));
		c01.setOpaque(false);
		panel.add(c01);
		
		c1name=new JLabel("Wall Pictures");
		c1name.setBounds(110,490,150,40);
		//c1name.setFocusPainted(false);
		c1name.setBackground(Color.GRAY);
		c1name.setForeground(Color.BLACK);
		c1name.setFont(myFont1);
		c1name.setOpaque(false);
		panel.add(c1name);
		
		img1=new ImageIcon("Images/wallframe1.jpg");		
		c1 = new JButton(img1);
		c1.setBounds(50,240,250,250);
		//c1.addMouseListener(this);
		c1.addActionListener(this);
		panel.add(c1);
		
		c2name=new JLabel("Bed Frames");
		c2name.setBounds(435,490,150,40);
		c2name.setBackground(Color.GRAY);
		c2name.setForeground(Color.BLACK);
		//c2name.setFocusPainted(false);
		c2name.setFont(myFont1);
		c2name.setOpaque(false);
		panel.add(c2name);
		
		img2=new ImageIcon("Images/bedframe1.jpg");
		c2 = new JButton(img2);
		c2.setBounds(365,240,250,250);
		//c2.addMouseListener(this);
		c2.addActionListener(this);
		panel.add(c2);
		
		c3name=new JLabel("Furnitures");
		c3name.setBounds(760,490,150,40);
		c3name.setBackground(Color.GRAY);
		c3name.setForeground(Color.BLACK);
		//c3name.setFocusPainted(false);
		c3name.setFont(myFont1);
		c3name.setOpaque(false);
		panel.add(c3name);
		
		img3=new ImageIcon("Images/furniturename1.jpg");
		c3 = new JButton(img3);
		c3.setBounds(680,240,250,250);
		//c3.addMouseListener(this);
		c3.addActionListener(this);
		panel.add(c3);
		
		imgset=new ImageIcon("Images/settings1.jpg");
		set1 = new JMenuItem(imgset);
		set1.setBounds(830,115,100,100);
		set1.addActionListener(this);
		panel.add(set1);
		
		imgcart=new ImageIcon("Images/carticon1.jpg");
		cart = new JMenuItem(imgcart);
		cart.setBounds(50,115,100,100);
		cart.addActionListener(this);
		panel.add(cart);
		
		img=new ImageIcon("Images/asr.jpg");
		imgLabel =new JLabel(img);
		imgLabel.setBounds(0,0,1000,600);
		panel.add(imgLabel);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==logoutBtn)
		{
			this.setVisible(false);
			Login f1=new Login();
			f1.setVisible(true);
		}
		
        else if (ae.getSource()==set1 )
		{
			this.setVisible(false);
			Settings se=new Settings(UserH);
			se.setVisible(true);
		}
    
		else if(ae.getSource()==cart)
		{
			this.setVisible(false);
			Cart1 c1=new Cart1(UserH);
			c1.setVisible(true);
		}
		else if(ae.getSource()==c1)
		{
			this.setVisible(false);
			Catagory1 c11=new Catagory1();
			c11.setVisible(true);
		}
		else if(ae.getSource()==c2)
		{
			this.setVisible(false);
			Catagory2 c22=new Catagory2();
			c22.setVisible(true);
		}
		else if(ae.getSource()==c3)
		{
			this.setVisible(false);
			Catagory3 c33=new Catagory3();
			c33.setVisible(true);
		}
		
	}
}