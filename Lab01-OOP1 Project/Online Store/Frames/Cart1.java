package Frames;

import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Cart1 extends JFrame implements MouseListener,ActionListener
{
	public static int n11;
	public static int n12;
	public static int n13;
	public static int n14;
	public static int n15;
	public static int n16;
	
	public static int n21;
	public static int n22;
	public static int n23;
	public static int n24;
	public static int n25;
	public static int n26;
	
	public static int n31;
	public static int n32;
	public static int n33;
	public static int n34;
	public static int n35;
	public static int n36;
	
	public static void setn11(int a){n11=a;}
	public static void setn12(int b){n12=b;}
	public static void setn13(int c){n13=c;}
	public static void setn14(int d){n14=d;}
	public static void setn15(int e){n15=e;}
	public static void setn16(int f){n16=f;}
	
	public static void setn21(int g){n21=g;}
	public static void setn22(int h){n22=h;}
	public static void setn23(int i){n23=i;}
	public static void setn24(int j){n24=j;}
	public static void setn25(int k){n25=k;}
	public static void setn26(int l){n26=l;}
	
	public static void setn31(int m){n31=m;}
	public static void setn32(int n){n32=n;}
	public static void setn33(int o){n33=o;}
	public static void setn34(int p){n34=p;}
	public static void setn35(int q){n35=q;}
	public static void setn36(int r){n36=r;}
	
	JLabel imgLabel,phN,locaT,userN,v01,v0,v1,v2,v3,v4,v11,v12,v13,v14,v15,v16 ,v21,v22,v23,v24,v25,v26 ,v31,v32,v33,v34,v35,v36,vTT;
	JTextField phNO,locaTion;
	JButton button11,button12,button13,button14,button15,button16,button21,button22,button23,button24,button25,button26,button31,button32,button33,button34,button35,button36,checkOut, Backbtn;
	JRadioButton cashDelivery, cashDigital;
	JTextArea note;
	Font myFont1,myFont;
	ImageIcon img;
	JPanel panel;
	String UserC;
	
	public Cart1(String s1)
	{
		super("Checkout");
		this.setSize(1200,850);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.WHITE);
		this.UserC=s1;
		
		panel=new JPanel();
		panel.setLayout(null);
		
		myFont=new Font("Cambria",Font.PLAIN,15);
		myFont1=new Font("Cambria",Font.BOLD,10);
		
		
		
		note=new JTextArea("**To Remove A Product, Click the Remove Button and then Go Back And Come Back To This Page**");
		note.setBounds(70,750,800,100);
		note.setBackground(Color.WHITE);
		note.setForeground(Color.RED);
		note.setOpaque(false);
		note.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panel.add(note);
		
		userN=new JLabel("User: "+s1);
		userN.setBounds(880,40,200,30);
		userN.setFont(new Font("Cambria",Font.PLAIN,30));
		userN.setOpaque(false);
		panel.add(userN);
		
		phN=new JLabel("Phone Number");
		phN.setBounds(940,90,200,30);
		phN.setFont(new Font("Cambria",Font.PLAIN,18));
		phN.setOpaque(false);
		panel.add(phN);
		
		phNO=new JTextField();
		phNO.setBounds(900,120,200,30);
		phNO.setBackground(Color.WHITE);
		phNO.setFont(new Font("Cambria",Font.PLAIN,15));
		phNO.setOpaque(true);
		panel.add(phNO);
		
		locaT=new JLabel("Location");
		locaT.setBounds(960,180,200,30);
		locaT.setFont(new Font("Cambria",Font.PLAIN,18));
		locaT.setOpaque(false);
		panel.add(locaT);
		
		locaTion=new JTextField();
		locaTion.setBounds(900,210,200,30);
		locaTion.setBackground(Color.WHITE);
		locaTion.setFont(new Font("Cambria",Font.PLAIN,15));
		locaTion.setOpaque(true);
		panel.add(locaTion);
		
		
		int getT11=7000*n11;
		int getT12=10000*n12;
		int getT13=3000*n13;
		int getT14=4000*n14;
		int getT15=4000*n15;
		int getT16=5000*n16;
		
		int getT21=5000*n21;
		int getT22=10000*n22;
		int getT23=12000*n23;
		int getT24=25000*n24;
		int getT25=30000*n25;
		int getT26=34000*n26;
		
		int getT31=1000*n31;
		int getT32=1400*n32;
		int getT33=10000*n33;
		int getT34=18000*n34;
		int getT35=20000*n35;
		int getT36=15000*n36;
		
		int getTT=getT11+getT12+getT13+getT14+getT15+getT16+getT21+getT22+getT23+getT24+getT25+getT26+getT31+getT32+getT33+getT34+getT35+getT36;
		
		v1=new JLabel("NAME");
		v1.setBounds(70,20,60,30);
		v1.setBackground(Color.GRAY);
		v1.setOpaque(false);
		v1.setFont(new Font("Cambria",Font.BOLD,20));
		panel.add(v1);
		
		v01=new JLabel("------------------------------------------------------------------------------------------------------------------------------------");
		v01.setBounds(70,30,700,50);
		v01.setBackground(Color.BLACK);
		v01.setFont(myFont);
		panel.add(v01);
		
		v2=new JLabel("PRICE");
		v2.setBounds(255,20,70,30);
		v2.setBackground(Color.GRAY);
		v2.setOpaque(false);
		v2.setFont(new Font("Cambria",Font.BOLD,20));
		panel.add(v2);
		
		v3=new JLabel("QUANTITY");
		v3.setBounds(440,20,110,30);
		v3.setBackground(Color.GRAY);
		v3.setOpaque(false);
		v3.setFont(new Font("Cambria",Font.BOLD,20));
		panel.add(v3);
		
		v4=new JLabel("TOTAL");
		v4.setBounds(650,20,70,30);
		v4.setBackground(Color.GRAY);
		v4.setOpaque(false);
		v4.setFont(new Font("Cambria",Font.BOLD,20));
		panel.add(v4);
		
		v11=new JLabel("Naruto Frame:      "+"                   "+"        7000        "+"                 "+"       X       "+"                   "+n11+"                   "+"         :           "+"                    "+getT11);
		v11.setBounds(70,50,700,50);
		v11.setBackground(Color.GRAY);
		v11.setFont(myFont);
		panel.add(v11);
		
		v12=new JLabel("Naruto-Sasuke:  "+"                   "+"         10000      "+"                 "+" "+"      X       "+"                   "+n12+"                   "+"         :           "+"                     "+getT12);
		v12.setBounds(70,80,700,50);
		v12.setBackground(Color.BLACK);
		v12.setFont(myFont);
		panel.add(v12);
		
		v13=new JLabel("Wall Tree Frame:"+"                   "+"        3000      "+"                 "+"        X       "+"                   "+n13+"                   "+"         :           "+"                     "+getT13);
		v13.setBounds(70,110,700,50);
		v13.setBackground(Color.BLACK);
		v13.setFont(myFont);
		panel.add(v13);
		
		v14=new JLabel("Forest Frame:         "+"                   "+"        4000      "+"                 "+"       X       "+"                   "+n14+"                   "+"         :           "+"                     "+getT14);
		v14.setBounds(70,140,700,50);
		v14.setBackground(Color.BLACK);
		v14.setFont(myFont);
		panel.add(v14);
		
		v15=new JLabel("Autumn Forest:     "+"                   "+"        4000      "+"                 "+"       X       "+"                   "+n15+"                   "+"         :           "+"                     "+getT15);
		v15.setBounds(70,170,700,50);
		v15.setBackground(Color.BLACK);
		v15.setFont(myFont);
		panel.add(v15);
		
		v16=new JLabel("Forest Art:                "+"                   "+"        5000      "+"                 "+"       X       "+"                   "+n16+"                   "+"         :           "+"                     "+getT16);
		v16.setBounds(70,200,700,50);
		v16.setBackground(Color.BLACK);
		v16.setFont(myFont);
		panel.add(v16);
		
		v21=new JLabel("Kids Bed:                  "+"                   "+"        5000      "+"                 "+"       X       "+"                   "+n21+"                   "+"         :           "+"                     "+getT21);
		v21.setBounds(70,280,700,50);
		v21.setBackground(Color.BLACK);
		v21.setFont(myFont);
		panel.add(v21);
		
		v22=new JLabel("NormalSize Bed 1:"+"                   "+"    10000      "+"                 "+"       X       "+"                   "+n22+"                   "+"         :           "+"                     "+getT22);
		v22.setBounds(70,310,700,50);
		v22.setBackground(Color.BLACK);
		v22.setFont(myFont);
		panel.add(v22);
		
		v23=new JLabel("NormalSize Bed 2:"+"                   "+"    12000      "+"                 "+"       X       "+"                   "+n23+"                   "+"         :           "+"                     "+getT23);
		v23.setBounds(70,340,700,50);
		v23.setBackground(Color.BLACK);
		v23.setFont(myFont);
		panel.add(v23);
		
		v24=new JLabel("KingSize Bed:       "+"                   "+"        25000      "+"                 "+"      X       "+"                   "+n24+"                   "+"         :           "+"                     "+getT24);
		v24.setBounds(70,370,700,50);
		v24.setBackground(Color.BLACK);
		v24.setFont(myFont);
		panel.add(v24);
		
		v25=new JLabel("QueenSize Bed 1:"+"                   "+"       30000      "+"                 "+"       X       "+"                   "+n25+"                   "+"         :           "+"                     "+getT25);
		v25.setBounds(70,400,700,50);
		v25.setBackground(Color.BLACK);
		v25.setFont(myFont);
		panel.add(v25);
		
		v26=new JLabel("QueenSize Bed 2:"+"                   "+"       34000      "+"                 "+"       X       "+"                   "+n26+"                   "+"         :           "+"                     "+getT26);
		v26.setBounds(70,430,700,50);
		v26.setBackground(Color.BLACK);
		v26.setFont(myFont);
		panel.add(v26);
		
		v31=new JLabel("Chair 1:                    "+"                   "+"        1000      "+"                 "+"       X        "+"                   "+n31+"                   "+"         :           "+"                     "+getT31);
		v31.setBounds(70,500,700,50);
		v31.setBackground(Color.BLACK);
		v31.setFont(myFont);
		panel.add(v31);
		
		v32=new JLabel("Chair 2:                    "+"                   "+"        1400      "+"                 "+"       X        "+"                   "+n32+"                   "+"         :           "+"                     "+getT32);
		v32.setBounds(70,530,700,50);
		v32.setBackground(Color.BLACK);
		v32.setFont(myFont);
		panel.add(v32);
		
		v33=new JLabel("Closet 1:                 "+"                   "+"        10000      "+"                 "+"      X        "+"                   "+n33+"                   "+"         :           "+"                     "+getT33);
		v33.setBounds(70,560,700,50);
		v33.setBackground(Color.BLACK);
		v33.setFont(myFont);
		panel.add(v33);
		
		v34=new JLabel("Closet 2:                 "+"                   "+"        18000      "+"                 "+"      X        "+"                   "+n34+"                   "+"         :           "+"                     "+getT34);
		v34.setBounds(70,590,700,50);
		v34.setBackground(Color.BLACK);
		v34.setFont(myFont);
		panel.add(v34);
		
		v35=new JLabel("Shelf:                        "+"                   "+"       20000      "+"                 "+"       X        "+"                   "+n35+"                   "+"         :           "+"                     "+getT35);
		v35.setBounds(70,620,700,50);
		v35.setBackground(Color.BLACK);
		v35.setFont(myFont);
		panel.add(v35);
		
		v36=new JLabel("Dressing Table:  "+"                    "+"       15000      "+"                 "+"       X        "+"                   "+n36+"                   "+"         :           "+"                     "+getT36);
		v36.setBounds(70,650,700,50);
		v36.setBackground(Color.BLACK);
		v36.setFont(myFont);
		panel.add(v36);
		
		v0=new JLabel("------------------------------------------------------------------------------------------------------------------------------------");
		v0.setBounds(70,680,700,50);
		v0.setBackground(Color.BLACK);
		v0.setFont(myFont);
		panel.add(v0);
		
		
		vTT=new JLabel("Grand Total                                          "+"                                                     "+"                                               :           "+"                     "+getTT);
		vTT.setBounds(70,700,700,50);
		vTT.setBackground(Color.BLACK);
		vTT.setFont(myFont);
		panel.add(vTT);
		
		button11=new JButton("Remove");
		button11.setBounds(750,63,80,20);
		button11.setBackground(Color.YELLOW);
		button11.setOpaque(true);
		button11.setFont(myFont1);
		button11.setFocusPainted(false);
		button11.addActionListener(this);
		panel.add(button11);
		
		button12=new JButton("Remove");
		button12.setBounds(750,93,80,20);
		button12.setBackground(Color.YELLOW);
		button12.setOpaque(true);
		button12.setFont(myFont1);
		button12.setFocusPainted(false);
		button12.addActionListener(this);
		panel.add(button12);
		
		button13=new JButton("Remove");
		button13.setBounds(750,123,80,20);
		button13.setBackground(Color.YELLOW);
		button13.setOpaque(true);
		button13.setFont(myFont1);
		button13.setFocusPainted(false);
		button13.addActionListener(this);
		panel.add(button13);
		
		button14=new JButton("Remove");
		button14.setBounds(750,153,80,20);
		button14.setBackground(Color.YELLOW);
		button14.setOpaque(true);
		button14.setFont(myFont1);
		button14.setFocusPainted(false);
		button14.addActionListener(this);
		panel.add(button14);
		
		button15=new JButton("Remove");
		button15.setBounds(750,183,80,20);
		button15.setBackground(Color.YELLOW);
		button15.setOpaque(true);
		button15.setFont(myFont1);
		button15.setFocusPainted(false);
		button15.addActionListener(this);
		panel.add(button15);
		
		button16=new JButton("Remove");
		button16.setBounds(750,213,80,20);
		button16.setBackground(Color.YELLOW);
		button16.setOpaque(true);
		button16.setFont(myFont1);
		button16.setFocusPainted(false);
		button16.addActionListener(this);
		panel.add(button16);
		
		button21=new JButton("Remove");
		button21.setBounds(750,293,80,20);
		button21.setBackground(Color.YELLOW);
		button21.setOpaque(true);
		button21.setFont(myFont1);
		button21.setFocusPainted(false);
		button21.addActionListener(this);
		panel.add(button21);
		
		button22=new JButton("Remove");
		button22.setBounds(750,323,80,20);
		button22.setBackground(Color.YELLOW);
		button22.setOpaque(true);
		button22.setFont(myFont1);
		button22.setFocusPainted(false);
		button22.addActionListener(this);
		panel.add(button22);
		
		button23=new JButton("Remove");
		button23.setBounds(750,353,80,20);
		button23.setBackground(Color.YELLOW);
		button23.setOpaque(true);
		button23.setFont(myFont1);
		button23.setFocusPainted(false);
		button23.addActionListener(this);
		panel.add(button23);
		
		button24=new JButton("Remove");
		button24.setBounds(750,383,80,20);
		button24.setBackground(Color.YELLOW);
		button24.setOpaque(true);
		button24.setFont(myFont1);
		button24.setFocusPainted(false);
		button24.addActionListener(this);
		panel.add(button24);
		
		button25=new JButton("Remove");
		button25.setBounds(750,413,80,20);
		button25.setBackground(Color.YELLOW);
		button25.setOpaque(true);
		button25.setFont(myFont1);
		button25.setFocusPainted(false);
		button25.addActionListener(this);
		panel.add(button25);
		
		button26=new JButton("Remove");
		button26.setBounds(750,443,80,20);
		button26.setBackground(Color.YELLOW);
		button26.setOpaque(true);
		button26.setFont(myFont1);
		button26.setFocusPainted(false);
		button26.addActionListener(this);
		panel.add(button26);
		
		button31=new JButton("Remove");
		button31.setBounds(750,513,80,20);
		button31.setBackground(Color.YELLOW);
		button31.setOpaque(true);
		button31.setFont(myFont1);
		button31.setFocusPainted(false);
		button31.addActionListener(this);
		panel.add(button31);
		
		button32=new JButton("Remove");
		button32.setBounds(750,543,80,20);
		button32.setBackground(Color.YELLOW);
		button32.setOpaque(true);
		button32.setFont(myFont1);
		button32.setFocusPainted(false);
		button32.addActionListener(this);
		panel.add(button32);
		
		button33=new JButton("Remove");
		button33.setBounds(750,573,80,20);
		button33.setBackground(Color.YELLOW);
		button33.setOpaque(true);
		button33.setFont(myFont1);
		button33.setFocusPainted(false);
		button33.addActionListener(this);
		panel.add(button33);
		
		button34=new JButton("Remove");
		button34.setBounds(750,603,80,20);
		button34.setBackground(Color.YELLOW);
		button34.setOpaque(true);
		button34.setFont(myFont1);
		button34.setFocusPainted(false);
		button34.addActionListener(this);
		panel.add(button34);
		
		button35=new JButton("Remove");
		button35.setBounds(750,633,80,20);
		button35.setBackground(Color.YELLOW);
		button35.setOpaque(true);
		button35.setFont(myFont1);
		button35.setFocusPainted(false);
		button35.addActionListener(this);
		panel.add(button35);
		
		button36=new JButton("Remove");
		button36.setBounds(750,663,80,20);
		button36.setBackground(Color.YELLOW);
		button36.setOpaque(true);
		button36.setFont(myFont1);
		button36.setFocusPainted(false);
		button36.addActionListener(this);
		panel.add(button36);
		
		checkOut=new JButton("Checkout");
		checkOut.setBounds(900,300,200,50);
		checkOut.setFont(new Font("Cambria",Font.BOLD,20));
		checkOut.setFocusPainted(false);
		checkOut.setBackground(Color.ORANGE);
		checkOut.setForeground(Color.BLACK);
		checkOut.addMouseListener(this);
		checkOut.addActionListener(this);
		panel.add(checkOut);
		
		img=new ImageIcon("Images/backbutton1.jpg");
		Backbtn=new JButton(img);
		Backbtn.setBounds(10,10,50,50);
		Backbtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		Backbtn.addActionListener(this);
		Backbtn.setBackground(Color.GRAY);
		Backbtn.setForeground(Color.BLACK);
		panel.add(Backbtn);
		
		img=new ImageIcon("Images/cart1.jpg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(0,0,1200,850);
		panel.add(imgLabel);
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==checkOut)
		{
			checkOut.setBackground(Color.WHITE);
			checkOut.setForeground(Color.GRAY);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==checkOut)
		{
			checkOut.setBackground(Color.ORANGE);
			checkOut.setForeground(Color.BLACK);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Backbtn)
		{
			this.setVisible(false);
			Homepage h1=new Homepage(UserC);
			h1.setVisible(true);
			
		}
		
		else if(ae.getSource()==button11)
		{
			n11=0;
		}
		else if(ae.getSource()==button12)
		{
			n12=0;
		}
		else if(ae.getSource()==button13)
		{
			n13=0;
		}
		else if(ae.getSource()==button14)
		{
			n14=0;
		}
		else if(ae.getSource()==button15)
		{
			n15=0;
		}
		else if(ae.getSource()==button16)
		{
			n16=0;
		}
		else if(ae.getSource()==button21)
		{
			n21=0;
		}
		else if(ae.getSource()==button22)
		{
			n22=0;
		}
		else if(ae.getSource()==button23)
		{
			n23=0;
		}
		else if(ae.getSource()==button24)
		{
			n24=0;
		}
		else if(ae.getSource()==button25)
		{
			n25=0;
		}
		else if(ae.getSource()==button26)
		{
			n26=0;
		}
		else if(ae.getSource()==button31)
		{
			n31=0;
		}
		else if(ae.getSource()==button32)
		{
			n32=0;
		}
		else if(ae.getSource()==button33)
		{
			n33=0;
		}
		else if(ae.getSource()==button34)
		{
			n34=0;
		}
		else if(ae.getSource()==button35)
		{
			n35=0;
		}
		else if(ae.getSource()==button36)
		{
			n36=0;
		}
		else
		{
			if(ae.getSource()==checkOut)
			{
				String textF1=phNO.getText();
				String textF2=locaTion.getText();
				
				if(textF1.isEmpty()||textF2.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Fill All");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Thanks for Shopping!");
				}
			}	
			
		}
	}
	
	
	
	
}

/*		private void uQD(int button,int value)
		{
			switch(button)
			{
				case 11:
				q11.setText(String.valueOf(value));
				getT11.setText("0");
				break;
				
				case 12:
				q12.setText(String.valueOf(value));
				getT12.setText("0");
				break;
			}
		}*/