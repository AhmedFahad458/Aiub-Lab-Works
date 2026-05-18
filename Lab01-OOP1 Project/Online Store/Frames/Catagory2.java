package Frames;

import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;


public class Catagory2 extends JFrame implements ActionListener
{
	
	JLabel imgLabel,l1,l2,l3,l4,l5,l6,l7,l8;// small letter L1 not 12
	JLabel p1,p2,p3,p4,p5,p6,p7,p8;
	JButton b1,b2,b3,b4,b5,b6,b7,b8, Backbtn;
	ImageIcon img, img1;
	Font myfont1;
	JPanel panel;
	
	public Catagory2()
	{
		super("Bed Section");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		b2=new JButton(new ImageIcon("Images/kids-bed1.jpg"));
		b2.setBounds(100,30,200,200);
		b2.addActionListener(this);
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.BLACK);
		panel.add(b2);
		
		l2=new JLabel("Kids bed");
		l2.setBounds(160,230,100,30);
		l2.setFont(new Font("Cambria",Font.PLAIN,16));
		l2.setOpaque(false);
		panel.add(l2);
		
		p2=new JLabel("5000TK");
		p2.setBounds(160,250,100,30);
		p2.setFont(new Font("Cambria",Font.PLAIN,16));
		p2.setOpaque(false);
		panel.add(p2);
		
		b3=new JButton(new ImageIcon("Images/NormalSize1.jpg"));
		b3.setBounds(390,30,200,200);
		b3.addActionListener(this);
		b3.setBackground(Color.GRAY);
		b3.setForeground(Color.BLACK);
		panel.add(b3);
	
		l3=new JLabel("Images/NormalSize bed 1");
		l3.setBounds(430,230,200,30);
		l3.setFont(new Font("Cambria",Font.PLAIN,16));
		l3.setOpaque(false);
		panel.add(l3);
		
		p3=new JLabel("10000TK");
		p3.setBounds(460,250,200,30);
		p3.setFont(new Font("Cambria",Font.PLAIN,16));
		p3.setOpaque(false);
		panel.add(p3);
		
		b4=new JButton(new ImageIcon("Images/NormalSize22.jpg"));
		b4.setBounds(680,30,200,200);
		b4.addActionListener(this);
		b4.setBackground(Color.GRAY);
		b4.setForeground(Color.BLACK);
		panel.add(b4);
		
		l4=new JLabel("Images/NormalSize bed 2");
		l4.setBounds(720,230,200,30);
		l4.setFont(new Font("Cambria",Font.PLAIN,16));
		l4.setOpaque(false);
		panel.add(l4);
		
		p4=new JLabel("12000TK");
		p4.setBounds(750,250,200,30);
		p4.setFont(new Font("Cambria",Font.PLAIN,16));
		p4.setOpaque(false);
		panel.add(p4);
		
		b6=new JButton(new ImageIcon("Images/KingSize1.jpg"));
		b6.setBounds(50,300,300,200);
		b6.addActionListener(this);
		b6.setBackground(Color.GRAY);
		b6.setForeground(Color.BLACK);
		panel.add(b6);
		
		l6=new JLabel("Images/KingSize bed");
		l6.setBounds(145,500,200,30);
		l6.setFont(new Font("Cambria",Font.PLAIN,16));
		l6.setOpaque(false);
		panel.add(l6);
		
		p6=new JLabel("25000TK");
		p6.setBounds(155,520,200,30);
		p6.setFont(new Font("Cambria",Font.PLAIN,16));
		p6.setOpaque(false);
		panel.add(p6);
		
		b7=new JButton(new ImageIcon("Images/QueenSize1.jpg"));
		b7.setBounds(390,300,200,200);
		b7.addActionListener(this);
		b7.setBackground(Color.GRAY);
		b7.setForeground(Color.BLACK);
		panel.add(b7);
		
		l7=new JLabel("QueenSize bed 1");
		l7.setBounds(430,500,200,30);
		l7.setFont(new Font("Cambria",Font.PLAIN,16));
		l7.setOpaque(false);
		panel.add(l7);
		
		p7=new JLabel("30000TK");
		p7.setBounds(450,520,200,30);
		p7.setFont(new Font("Cambria",Font.PLAIN,16));
		p7.setOpaque(false);
		panel.add(p7);
		
		b8=new JButton(new ImageIcon("Images/queensize2.jpg"));
		b8.setBounds(680,300,200,200);
		b8.addActionListener(this);
		b8.setBackground(Color.GRAY);
		b8.setForeground(Color.BLACK);
		panel.add(b8);
		
		l8=new JLabel("QueenSize bed 2");
		l8.setBounds(720,500,200,30);
		l8.setFont(new Font("Cambria",Font.PLAIN,16));
		l8.setOpaque(false);
		panel.add(l8);
		
		p8=new JLabel("34000TK");
		p8.setBounds(740,520,200,30);
		p8.setFont(new Font("Cambria",Font.PLAIN,16));
		p8.setOpaque(false);
		panel.add(p8);
		
		img=new ImageIcon("Images/backbutton1.jpg");
		Backbtn=new JButton(img);
		Backbtn.setBounds(10,10,50,50);
		Backbtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		//Backbtn.addMouseListener(this);
		Backbtn.addActionListener(this);
		Backbtn.setBackground(Color.GRAY);
		Backbtn.setForeground(Color.BLACK);
		panel.add(Backbtn);
		
		img=new ImageIcon("Images/abstract11.jpg");
		imgLabel =new JLabel(img);
		imgLabel.setBounds(0,0,1200,600);
		panel.add(imgLabel);
		
		this.add(panel);
	}
	
	String s1=UserN();
	public String UserN()
			{
				String word="";
				try
				{
				BufferedReader reader=new BufferedReader(new FileReader("Data/Data.txt"));
				String line=reader.readLine();
				if(line!=null)
				{
					String words[]=line.split("\t");
					word=words[3];
				}
				reader.close();
				}
				catch(IOException e)
				{
					System.out.println("Error: "+e.getMessage());
					word="default name";
				}
				return word;	
			}
					
			
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if (ae.getSource()==Backbtn )
		{
			
			this.setVisible(false);
			Homepage h1=new Homepage(s1);
			h1.setVisible(true);
				
		}
		else if(ae.getSource()==b2)
		{
			this.setVisible(false);
			Product21 p1=new Product21();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			this.setVisible(false);
			Product22 p1=new Product22();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b4)
		{
			this.setVisible(false);
			Product23 p1=new Product23();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b6)
		{
			this.setVisible(false);
			Product24 p1=new Product24();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b7)
		{
			this.setVisible(false);
			Product25 p1=new Product25();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b8)
		{
			this.setVisible(false);
			Product26 p1=new Product26();
			p1.setVisible(true);
		}
	}
	
}