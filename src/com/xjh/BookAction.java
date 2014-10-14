package com.xjh;

import java.io.IOException;
import java.util.Vector;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
public class BookAction extends ActionSupport {
	 
	 private String name;
		//static{System.out.println("haha");}
	 private Vector<String> v=new Vector<String>();
	 private Vector<String> ve=new Vector<String>();
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String find() throws Exception {
		BookDAO bd=new BookDAO();
	    v=bd.xjhBook(name);
	    HttpServletRequest request=ServletActionContext.getRequest();
	    request.setAttribute("allbooks", v);
		return SUCCESS;
	    
	}
	public String Serach() throws Exception {
		BookDAO bd=new BookDAO();
	    ve=bd.xjhBookList(name);
	    HttpServletRequest request=ServletActionContext.getRequest();
	    request.setAttribute("information", ve);
		return SUCCESS;
	    
	}
	public String delete() throws Exception {
		BookDAO bd=new BookDAO();
	    v=bd.delete(name);
	    System.out.println("------>" + name);
	    for(int i=0;i<v.size();i++){
	    	 System.out.println(v.elementAt(i));
	    }
	    HttpServletRequest request=ServletActionContext.getRequest();
	    request.setAttribute("allbooks", v);
		return SUCCESS;
	    
	}
}
