package com.xjh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Vector;

import com.sun.org.apache.bcel.internal.generic.RETURN;
public class BookDAO{
	String author;
	public Vector<String> xjhBook(String name){
	    Vector<String> v=new Vector<String>();
		String drv="com.mysql.jdbc.Driver";
		    Connection con=null;
		    String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_xujiahuan";
		    String username="xnj01m5mon";
		    String password="4zh1xkhkh5xhjh5x5mi4whhzz4lhi2zmw2zz1i43";
		    Statement stmt=null;
		    ResultSet rs=null;
		    ResultSet rst=null;
		    String sql="select*from author";
		    try{
		    	Class.forName(drv);
		    	con=DriverManager.getConnection(url,username,password);
		    	stmt=con.createStatement();
		    	rs=stmt.executeQuery(sql);
		    	while(rs.next()){
		    		if(rs.getString("Name").equals(name)){
		    			author=rs.getString("AuthorID");
		    			break;
		    		}
		    	}
		    }catch(ClassNotFoundException e){
		    	e.printStackTrace();
		        System.out.println("空指针异常!数据库驱动类没找到!");
		    }catch(SQLException se){
			    se.printStackTrace();
			    System.out.println("数据库连接失败!");
		    }finally{
		    	try{
		    		rs.close();
		    		stmt.close();
		    		con.close();
		    	}catch(SQLException e){
		    		e.printStackTrace();
		    		System.out.println("SQL关闭出现错误!");
		    	}
		    }
	String sql1="select*from book";
	try{
    	Class.forName(drv);
    	con=DriverManager.getConnection(url,username,password);
    	stmt=con.createStatement();
    	rst=stmt.executeQuery(sql1);
    	while(rst.next()){
    		String str=null;
    		if(rst.getString("AuthorID").equals(author)){
    			str=rst.getString("Title");
    			v.addElement(str);
    		}
    		
    	}
    }catch(ClassNotFoundException e){
    	e.printStackTrace();
        System.out.println("空指针异常!数据库驱动类没找到!");
    }catch(SQLException se){
	    se.printStackTrace();
	    System.out.println("数据库连接失败!");
    }finally{
    	try{
    		rst.close();
    		stmt.close();
    		con.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    		System.out.println("SQL关闭出现错误!");
    	}
    }
    return v;
}
	
	
	
	public Vector<String> xjhBookList(String name){
	    Vector<String> v=new Vector<String>();
		String drv="com.mysql.jdbc.Driver";
		    Connection con=null;
		    String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_xujiahuan";
		    String username="xnj01m5mon";
		    String password="4zh1xkhkh5xhjh5x5mi4whhzz4lhi2zmw2zz1i43";
		    Statement stmt=null;
		    ResultSet rs=null;
		    ResultSet rst=null;
		    String sql="select*from book";
		    try{
		    	Class.forName(drv);
		    	con=DriverManager.getConnection(url,username,password);
		    	stmt=con.createStatement();
		    	rs=stmt.executeQuery(sql);
		    	while(rs.next()){
		    		if(rs.getString("Title").equals(name)){
		    			author=rs.getString("AuthorID");
		    			v.addElement(rs.getString("ISBN"));
		    			v.addElement(rs.getString("Title"));
		    			v.addElement(rs.getString("AuthorID"));
		    			v.addElement(rs.getString("Publisher"));
		    			v.addElement(rs.getString("PublishDate"));
		    			v.addElement(rs.getString("Price"));
		    			break;
		    		}
		    	}	
		    }catch(ClassNotFoundException e){
		    	e.printStackTrace();
		        System.out.println("空指针异常!数据库驱动类没找到!");
		    }catch(SQLException se){
			    se.printStackTrace();
			    System.out.println("数据库连接失败!");
		    }finally{
		    	try{
		    		rs.close();
		    		stmt.close();
		    		con.close();
		    	}catch(SQLException e){
		    		e.printStackTrace();
		    		System.out.println("SQL关闭出现错误!");
		    	}
		    }
	String sql1="select*from author";
	try{
    	Class.forName(drv);
    	con=DriverManager.getConnection(url,username,password);
    	stmt=con.createStatement();
    	rst=stmt.executeQuery(sql1);
    	while(rst.next()){
    		if(rst.getString("AuthorID").equals(author)){
    			v.addElement(rst.getString("Name"));
    			v.addElement(rst.getString("Age"));
    			v.addElement(rst.getString("Country"));
    			break;
    		}
    	}	
    }catch(ClassNotFoundException e){
    	e.printStackTrace();
        System.out.println("空指针异常!数据库驱动类没找到!");
    }catch(SQLException se){
	    se.printStackTrace();
	    System.out.println("数据库连接失败!");
    }finally{
    	try{
    		rst.close();
    		stmt.close();
    		con.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    		System.out.println("SQL关闭出现错误!");
    	}
    }
    return v;
}
	
	
	
	public Vector<String> delete(String name){
		Vector<String> v=new Vector<String>();
		String drv="com.mysql.jdbc.Driver";
		Connection con=null;
	    String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_xujiahuan";
	    String username="xnj01m5mon";
	    String password="4zh1xkhkh5xhjh5x5mi4whhzz4lhi2zmw2zz1i43";
	    Statement stmt=null;
	    ResultSet rs=null;
	    ResultSet rst=null;
	    ResultSet rus=null;
	    String sql="select*from book";
		
		  try{
			  Class.forName(drv);
		    	con=DriverManager.getConnection(url,username,password);
		    	stmt=con.createStatement();
		    	rs=stmt.executeQuery(sql);
		    	while(rs.next()){
		    		if(rs.getString("Title").equals(name)){
		    			author=rs.getString("AuthorID");
		    			break;
		    		}
		    	}
		    }catch(ClassNotFoundException e){
		    	e.printStackTrace();
		        System.out.println("空指针异常!数据库驱动类没找到!");
		    }catch(SQLException se){
			    se.printStackTrace();
			    System.out.println("数据库连接失败!");
		    }finally{
		    	try{
		    		rs.close();
		    		stmt.close();
		    		con.close();
		    	}catch(SQLException e){
		    		e.printStackTrace();
		    		System.out.println("SQL关闭出现错误!");
		    	}
		    }
	String sql1 = "delete from book where Title='"+name+"'"; 
      
	 try{
		   Class.forName(drv);
	    	con=DriverManager.getConnection(url,username,password);
	    	stmt=con.createStatement();
	    	stmt.execute(sql1);
		  }catch(ClassNotFoundException e){
		    	e.printStackTrace();
		        System.out.println("空指针异常!数据库驱动类没找到!");
		    }catch(SQLException se){
			    se.printStackTrace();
			    System.out.println("数据库连接失败!");
		    }finally{
		    	try{
		    		stmt.close();
		    		con.close();
		    	}catch(SQLException e){
		    		e.printStackTrace();
		    		System.out.println("SQL关闭出现错误!");
		    	}
		    }
	
	 
	 String sql2="select*from book";
		try{
	    	Class.forName(drv);
	    	con=DriverManager.getConnection(url,username,password);
	    	stmt=con.createStatement();
	    	rus=stmt.executeQuery(sql2);
	    	while(rus.next()){
	    		String str=null;
	    		if(rus.getString("AuthorID").equals(author)){System.out.println("mygod");
	    			str=rus.getString("Title");
	    			v.addElement(str);
	    		}
	    		
	    	}
	    }catch(ClassNotFoundException e){
	    	e.printStackTrace();
	        System.out.println("空指针异常!数据库驱动类没找到!");
	    }catch(SQLException se){
		    se.printStackTrace();
		    System.out.println("数据库连接失败!");
	    }finally{
	    	try{
	    		rus.close();
	    		stmt.close();
	    		con.close();
	    	}catch(SQLException e){
	    		e.printStackTrace();
	    		System.out.println("SQL关闭出现错误!");
	    	}
	    }
	    return v;
	}
		 
}
