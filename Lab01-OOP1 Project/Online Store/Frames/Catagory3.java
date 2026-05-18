
package Frames;

import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class Catagory3 extends JFrame implements ActionListener
{
	
	JLabel imgLabel,l2,l3,l4,l6,l7,l8;// small letter L1 not 12
	JLabel p2,p3,p4,p6,p7,p8;
	JButton b2,b3,b4,b6,b7,b8, Backbtn;
	ImageIcon img, img1;
	Font myfont1;
	JPanel panel;
	
	public Catagory3()
	{
		super("Furniture Section");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		b2=new JButton(new ImageIcon("Images/Chair1.jpg"));
		b2.setBounds(100,30,200,200);
		b2.addActionListener(this);
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.BLACK);
		panel.add(b2);
		
		l2=new JLabel("Chair 1");
		l2.setBounds(165,230,100,30);
		l2.setFont(new Font("Cambria",Font.PLAIN,16));
		l2.setOpaque(false);
		panel.add(l2);
		
		p2=new JLabel("1000TK");
		p2.setBounds(165,250,100,30);
		p2.setFont(new Font("Cambria",Font.PLAIN,16));
		p2.setOpaque(false);
		panel.add(p2);
		
		b3=new JButton(new ImageIcon("Images/Chair2.jpg"));
		b3.setBounds(390,30,200,200);
		b3.addActionListener(this);
		b3.setBackground(Color.GRAY);
		b3.setForeground(Color.BLACK);
		panel.add(b3);
		
		l3=new JLabel("Chair 2");
		l3.setBounds(465,230,200,30);
		l3.setFont(new Font("Cambria",Font.PLAIN,16));
		l3.setOpaque(false);
		panel.add(l3);
		
		p3=new JLabel("1400TK");
		p3.setBounds(460,250,200,30);
		p3.setFont(new Font("Cambria",Font.PLAIN,16));
		p3.setOpaque(false);
		panel.add(p3);
		
		b4=new JButton(new ImageIcon("Images/Closet1.jpg"));
		b4.setBounds(680,30,200,200);
		b4.addActionListener(this);
		b4.setBackground(Color.GRAY);
		b4.setForeground(Color.BLACK);
		panel.add(b4);
		
		l4=new JLabel("Closet 1");
		l4.setBounds(755,230,200,30);
		l4.setFont(new Font("Cambria",Font.PLAIN,16));
		l4.setOpaque(false);
		panel.add(l4);
		
		p4=new JLabel("10000TK");
		p4.setBounds(750,250,200,30);
		p4.setFont(new Font("Cambria",Font.PLAIN,16));
		p4.setOpaque(false);
		panel.add(p4);
		
		b6=new JButton(new ImageIcon("Images/Closet2.jpg"));
		b6.setBounds(100,300,200,200);
		b6.addActionListener(this);
		b6.setBackground(Color.GRAY);
		b6.setForeground(Color.BLACK);
		panel.add(b6);
		
		l6=new JLabel("Closet 2");
		l6.setBounds(165,500,200,30);
		l6.setFont(new Font("Cambria",Font.PLAIN,16));
		l6.setOpaque(false);
		panel.add(l6);
		
		p6=new JLabel("18000TK");
		p6.setBounds(160,520,200,30);
		p6.setFont(new Font("Cambria",Font.PLAIN,16));
		p6.setOpaque(false);
		panel.add(p6);
		
		b7=new JButton(new ImageIcon("Images/Shelf1.jpg"));
		b7.setBounds(390,300,200,200);
		b7.addActionListener(this);
		b7.setBackground(Color.GRAY);
		b7.setForeground(Color.BLACK);
		panel.add(b7);
		
		l7=new JLabel("Shelf");
		l7.setBounds(465,500,200,30);
		l7.setFont(new Font("Cambria",Font.PLAIN,16));
		l7.setOpaque(false);
		panel.add(l7);
		
		p7=new JLabel("20000TK");
		p7.setBounds(450,520,200,30);
		p7.setFont(new Font("Cambria",Font.PLAIN,16));
		p7.setOpaque(false);
		panel.add(p7);
		
		b8=new JButton(new ImageIcon("Images/Dressingtable1.jpg"));
		b8.setBounds(680,300,200,200);
		b8.addActionListener(this);
		b8.setBackground(Color.GRAY);
		b8.setForeground(Color.BLACK);
		panel.add(b8);
		
		l8=new JLabel("Dressing Table");
		l8.setBounds(720,500,200,30);
		l8.setFont(new Font("Cambria",Font.PLAIN,16));
		l8.setOpaque(false);
		panel.add(l8);
		
		p8=new JLabel("15000TK");
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
			Product31 p1=new Product31();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			this.setVisible(false);
			Product32 p1=new Product32();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b4)
		{
			this.setVisible(false);
			Product33 p1=new Product33();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b6)
		{
			this.setVisible(false);
			Product34 p1=new Product34();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b7)
		{
			this.setVisible(false);
			Product35 p1=new Product35();
			p1.setVisible(true);
		}
		else if(ae.getSource()==b8)
		{
			this.setVisible(false);
			Product36 p1=new Product36();
			p1.setVisible(true);
		}
		
	}
	
}