/**
 * 
 */
package com.nitin.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

/**
 * @author Nitin Gudle
 *Feb 16, 2012 1:41:26 PM
 *Project:-SessionPwd
 *Package:-com.nitin.util
 *File:-GetImages.java
 */
public class GetImages
{
	public static Vector getImages(String id)
	{
		Vector v=new Vector();
		try
		{					
					v.add("a.jpg");
					v.add("b.jpg");
					v.add("c.jpg");
					v.add("d.jpg");
					v.add("e.jpg");
					v.add("f.jpg");
					v.add("g.jpg");
					v.add("h.jpg");
					v.add("i.jpg");
					v.add("j.jpg");
					v.add("k.jpg");
					v.add("l.jpg");
					v.add("m.jpg");
					v.add("n.jpg");
					v.add("o.jpg");
					v.add("p.jpg");
					v.add("q.jpg");
					v.add("r.jpg");
					v.add("s.jpg");
					v.add("t.jpg");
					v.add("u.jpg");
					v.add("v.jpg");
					v.add("w.jpg");
					v.add("x.jpg");
					v.add("y.jpg");
					v.add("z.jpg");
					v.add("1.jpg");
					v.add("2.jpg");
					v.add("3.jpg");
					v.add("4.jpg");
					v.add("5.jpg");
					v.add("6.jpg");
					v.add("7.jpg");
					v.add("8.jpg");
					v.add("9.jpg");
					v.add("0.jpg");
					Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);
					Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);
					Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return v;
	}
	
	public static Vector getImages()
	{
		Vector v=new Vector();
		try
		{	
			v.add("rr.jpg");
			v.add("gg.jpg");
			v.add("bb.jpg");
			v.add("yy.jpg");
			v.add("bl.jpg");
			v.add("oo.jpg");
			v.add("pp.jpg");
			v.add("gr.jpg");
			Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);
			Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);
			Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);Collections.shuffle(v);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return v;
	}
	public static String getString(Vector v)
	{
		String str="";
		try
		{
			for(int i=0;i<v.size();i++)
			{
				if(v.get(i).equals("a.jpg"))
					str+="a";
				if(v.get(i).equals("b.jpg"))
					str+="b";
				if(v.get(i).equals("c.jpg"))
					str+="c";
				if(v.get(i).equals("d.jpg"))
					str+="d";
				if(v.get(i).equals("e.jpg"))
					str+="e";
				if(v.get(i).equals("f.jpg"))
					str+="f";
				if(v.get(i).equals("g.jpg"))
					str+="g";
				if(v.get(i).equals("h.jpg"))
					str+="h";
				if(v.get(i).equals("i.jpg"))
					str+="i";
				if(v.get(i).equals("j.jpg"))
					str+="j";
				if(v.get(i).equals("k.jpg"))
					str+="k";
				if(v.get(i).equals("l.jpg"))
					str+="l";
				if(v.get(i).equals("m.jpg"))
					str+="m";
				if(v.get(i).equals("n.jpg"))
					str+="n";
				if(v.get(i).equals("o.jpg"))
					str+="o";
				if(v.get(i).equals("p.jpg"))
					str+="p";
				if(v.get(i).equals("q.jpg"))
					str+="q";
				if(v.get(i).equals("r.jpg"))
					str+="r";
				if(v.get(i).equals("s.jpg"))
					str+="s";
				if(v.get(i).equals("t.jpg"))
					str+="t";
				if(v.get(i).equals("u.jpg"))
					str+="u";
				if(v.get(i).equals("v.jpg"))
					str+="v";
				if(v.get(i).equals("w.jpg"))
					str+="w";
				if(v.get(i).equals("x.jpg"))
					str+="x";
				if(v.get(i).equals("y.jpg"))
					str+="y";
				if(v.get(i).equals("z.jpg"))
					str+="z";


				if(v.get(i).equals("1.jpg"))
					str+="1";
				if(v.get(i).equals("2.jpg"))
					str+="2";
				if(v.get(i).equals("3.jpg"))
					str+="3";
				if(v.get(i).equals("4.jpg"))
					str+="4";
				if(v.get(i).equals("5.jpg"))
					str+="5";
				if(v.get(i).equals("6.jpg"))
					str+="6";
				if(v.get(i).equals("7.jpg"))
					str+="7";
				if(v.get(i).equals("8.jpg"))
					str+="8";
				if(v.get(i).equals("9.jpg"))
					str+="9";
				if(v.get(i).equals("0.jpg"))
					str+="0";
				
			}
		}
		catch(Exception e)
		{
			
		}
		return str;
	}
	public static boolean createPro(String path,String id, Vector v,String no)
	{
		boolean flag=false;
		try
		{
			Properties prop = new Properties();
			for(int i=0;i<v.size();i++)
			{
				prop.put(v.get(i),new Character(no.charAt(i)).toString());
			}
    		//save properties to project root folder
    		prop.store(new FileOutputStream(path+"\\Files\\Properties\\"+id+".properties"), null);
    		System.out.println("Property File Created Successfully......");
    		flag=true;
 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	public static boolean deletePro(String path,String id)
	{
		boolean flag=false;
		try
		{
			File f=new File(path+"\\Files\\Properties\\"+id+".properties");
			boolean result=f.delete();
			if(result)
				flag=true;
			System.out.println("Property File Delete Status(T/F)......"+flag);
    	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	public static Vector getImageNames(String path,String id)
	{
		Vector v=new Vector();
		try
		{
			Properties prop = new Properties();
			FileInputStream in=null;
			in = new FileInputStream(path+"\\Files\\Properties\\"+id+".properties");
			prop.load(in);
			Enumeration e=prop.keys();
			while(e.hasMoreElements())
				v.add(e.nextElement());
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return v;
	}
	public static Vector getImageValues(String path,String id)
	{
		Vector v=new Vector();
		try
		{
			Properties prop = new Properties();
			FileInputStream in=null;
			in = new FileInputStream(path+"\\Files\\Properties\\"+id+".properties");
			prop.load(in);
			Enumeration e=prop.elements();
			while(e.hasMoreElements())
				v.add(e.nextElement());
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return v;
	}
	
	public static void main(String as[])
	{
		Vector v=new Vector();
		Vector v1=new Vector();
		v=GetImages.getImageNames("","nitin");
		v1=GetImages.getImageValues("","nitin");
		System.out.println(v);
		System.out.println(v1);
	}
}
