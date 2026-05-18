package Frames;


import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class Settings extends JFrame implements MouseListener, ActionListener 
{
	 
	 JLabel imgLabel;
	 JButton Userbtn,Polbtn,Backbtn,Helpbtn,Accbtn;
	 JPanel panel;
	 ImageIcon img;
	 Font myFont;
	 String UserS;
	 
	 
	 public Settings(String s1){
		super("Settings");
		this.UserS=s1;
		this.setSize(900,500);
		this.setLocationRelativeTo(null);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		myFont=new Font("Cambria",Font.BOLD,20);

		
		Accbtn=new JButton("Account");
		Accbtn.setBounds(280,50,400,100);
		Accbtn.addMouseListener(this);
		Accbtn.addActionListener(this);
		Accbtn.setBackground(Color.GRAY);
		Accbtn.setForeground(Color.BLACK);
		Accbtn.setFont(myFont);
		panel.add(Accbtn);
		
		Polbtn=new JButton("Policy");
		Polbtn.setBounds(280,180,400,100);
		Polbtn.addMouseListener(this);
		Polbtn.addActionListener(this);
		Polbtn.setBackground(Color.GRAY);
		Polbtn.setForeground(Color.BLACK);
		Polbtn.setFont(myFont);
		panel.add(Polbtn);
		
		Helpbtn=new JButton("Customer Service");
		Helpbtn.setBounds(280,310,400,100);
		Helpbtn.addMouseListener(this);
		Helpbtn.addActionListener(this);
		Helpbtn.setBackground(Color.GRAY);
		Helpbtn.setForeground(Color.BLACK);
		Helpbtn.setFont(myFont);
		panel.add(Helpbtn);
		
	
		//Backbtn=new JButton("Back");
		img=new ImageIcon("Images/backbutton1.jpg");
		Backbtn=new JButton(img);
		Backbtn.setBounds(10,10,50,50);
		Backbtn.addActionListener(this);
		Backbtn.setBackground(Color.GRAY);
		Backbtn.setForeground(Color.BLACK);
		panel.add(Backbtn);
		
		
		img=new ImageIcon("Images/settingB.jpg");
		imgLabel =new JLabel(img);
		imgLabel.setBounds(0,0,900,500);
		panel.add(imgLabel); 
		
		this.add(panel);
	 }
	 public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==Accbtn)
		{
			Accbtn.setBackground(Color.WHITE);
			Accbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==Backbtn)
		{
			Backbtn.setBackground(Color.WHITE);
			Backbtn.setForeground(Color.BLACK);
		}
			else if(me.getSource()==Polbtn)
		{
			Polbtn.setBackground(Color.WHITE);
			Polbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==Helpbtn)
		{
			Helpbtn.setBackground(Color.WHITE);
			Helpbtn.setForeground(Color.BLACK);
		}




	}
	
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==Accbtn){Accbtn.setBackground(Color.GRAY);}
		else if(me.getSource()==Backbtn){Backbtn.setBackground(Color.GRAY);}
		else if(me.getSource()==Polbtn){Polbtn.setBackground(Color.GRAY);}
		else if(me.getSource()==Helpbtn){Helpbtn.setBackground(Color.GRAY);}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Accbtn)
		{
			JOptionPane.showMessageDialog(null,"Under Development");
		}
		else if(ae.getSource()==Polbtn)
		{
			JOptionPane.showMessageDialog(null,"Not Available");
		}
		else if(ae.getSource()==Helpbtn)
		{
			JOptionPane.showMessageDialog(null,"Not Available");
		}
		else  if (ae.getSource()==Backbtn )
		{
			
			this.setVisible(false);
			Homepage h1=new Homepage(UserS);
			h1.setVisible(true);
				
		}
	}
            
}
