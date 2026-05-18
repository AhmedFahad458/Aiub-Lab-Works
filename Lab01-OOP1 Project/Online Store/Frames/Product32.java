package Frames;


import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class Product32 extends JFrame implements MouseListener,ActionListener
{
	JLabel b2,l2,p2,q1;
	JButton Backbtn,cartBtn;
	JComboBox cb1;
	ImageIcon img;
	JPanel panel;
	
	public Product32()
	{
		super("");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		b2=new JLabel(new ImageIcon("./Images/Chair2.jpg"));
		b2.setBounds(100,30,500,500);
		b2.setBackground(Color.BLACK);
		panel.add(b2);
		
		l2=new JLabel("Chair 2");
		l2.setBounds(550,140,300,100);
		l2.setFont(new Font("Cambria",Font.BOLD,30));
		l2.setOpaque(false);
		panel.add(l2);
		
		p2=new JLabel("1400TK");
		p2.setBounds(550,180,200,100);
		p2.setFont(new Font("Cambria",Font.BOLD,25));
		p2.setOpaque(false);
		panel.add(p2);
		
		img=new ImageIcon("./Images/backbutton1.jpg");
		Backbtn=new JButton(img);
		Backbtn.setBounds(10,10,50,50);
		Backbtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		Backbtn.setBackground(Color.GRAY);
		Backbtn.setForeground(Color.BLACK);
		Backbtn.addActionListener(this);
		panel.add(Backbtn);
		
		cartBtn=new JButton("Add To Cart");
		cartBtn.setBounds(510, 300, 240, 40);
		cartBtn.setBackground(Color.ORANGE);
		cartBtn.setForeground(Color.BLACK);
		cartBtn.setFocusPainted(false);
		cartBtn.addMouseListener(this);
		cartBtn.addActionListener(this);
		panel.add(cartBtn);
	
	
		q1 = new JLabel("Quantity");
        q1.setBounds(530, 250, 240, 40);//80,10
        q1.setFont(new Font("Serif", Font.BOLD, 18));
		panel.add(q1);
	
		String quantity[] = {"0", "1", "2", "3", "4", "5" };
        cb1 = new JComboBox(quantity);
        cb1.setBounds(620, 260, 60, 20);
		panel.add(cb1);
		
	this.add(panel);	
	}	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==cartBtn)
		{
			cartBtn.setBackground(Color.WHITE);
			cartBtn.setForeground(Color.BLACK);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==cartBtn){cartBtn.setBackground(Color.ORANGE);}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if (ae.getSource()==Backbtn )
		{
			
			this.setVisible(false);
			Catagory3 c1=new Catagory3();
			c1.setVisible(true);
				
		}
		else if(ae.getSource()==cartBtn)
		{
			int selectedIndex=cb1.getSelectedIndex();
			Cart1.setn32(selectedIndex);
			JOptionPane.showMessageDialog(null,"ADDED TO CART!");
		}
	}
}