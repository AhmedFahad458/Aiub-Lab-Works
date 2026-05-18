package Frames;


import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.awt.*;
import java.awt.event.*;




import Interfaces.*;

public class Account implements AccOperation
{
	 
	private String name, name2, name3,name4;
	private String pass;
	File myfile;
	FileWriter fwrite;
	Scanner sc;
	 
	public Account(){}
	 
	public Account(String name ,String name2 ,String name3,String name4 ,String pass)
	{
		this.name=name;
		this.name2=name2;
		this.name3=name3;
		this.name4=name4;
		this.pass=pass;
	}
	 
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	public void setName2(String name2){this.name2=name2;}
	public String getName2(){return name2;}
	public void setName3(String name3){this.name3=name3;}
	public String getName3(){return name3;}
	public void setName4(String name4){this.name4=name4;}
	public String getName4(){return name4;}
	
	
	public void setPass(String pass){this.pass=pass;}
	public String getPass(){return pass;}
	
	public void addAccount()
	 {
		  try
		  { 
				myfile=new File("Data/Data.txt");
				myfile.createNewFile();
			  
				fwrite=new FileWriter(myfile,true);
			  
				fwrite.write(getName()+"\t");
				fwrite.write(getName2()+"\t");
				fwrite.write(getName3()+"\t");
				fwrite.write(getName4()+"\t");
				fwrite.write(getPass()+"\n");
				fwrite.flush();
				fwrite.close();
		  }
		  catch (IOException ioe )
		  { 
				ioe.printStackTrace();
		  }
	 }
	public boolean getAccount (String uname ,String upass )
	{
		try(BufferedReader reader=Files.newBufferedReader(Paths.get("Data/Data.txt")))
		{
			String Line; 
			while((Line=reader.readLine())!=null)
			{
				String value[]= Line.split("\t");
				if(value.length==5)
				{
					if(value[3].equals(uname)&&value[4].equals(upass))
					{
						return true;
					}
				}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		return false;
	}	
	
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 