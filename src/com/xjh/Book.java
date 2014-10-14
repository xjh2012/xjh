package com.xjh;

public class Book {
	String ISBN;
	String Title;
	String AuthorID;
	String Publisher;
	String PublishDate;
	String Price;
	String Name;
	String Age;
	
	public String getISBN(){
		return ISBN;
	}
	public void setISBN(String isbn){
		ISBN=isbn;
	}
	public String getTitle(){
		return Title;
	}
	public void setTitle(String title){
		Title=title;
	}
	public String getAuthor(){
		return AuthorID;
	}
	public void setAuthor(String authorid){
		AuthorID=authorid;
	}
	public String getPublisher(){
		return Publisher;
	}
	public void setPublisher(String publisher){
		Publisher=publisher;
	}
	
	
	public String getPublishDate(){
		return PublishDate;
	}
	public void setPublishDate(String publishDate){
		PublishDate=publishDate;
	}
	public String getPrice(){
		return Price;
	}
	public void setPrice(String price){
		Price=price;
	}
	public String getName(){
		return Name;
	}
	public void setName(String name){
		Name=name;
	}
	public String getAge(){
		return Age;
	}
	public void setAge(String age){
		Age=age;
	}
	
}
