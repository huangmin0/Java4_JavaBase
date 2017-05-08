package com.javaweb.bean;

public class BookBean
{
private String bookName;
private int bookNum;
public BookBean()
{
	super();
}
public BookBean(String bookName, int bookNum)
{
	super();
	this.bookName = bookName;
	this.bookNum = bookNum;
}
public String getBookName()
{
	return bookName;
}
public void setBookName(String bookName)
{
	this.bookName = bookName;
}
public int getBookNum()
{
	return bookNum;
}
public void setBookNum(int bookNum)
{
	this.bookNum = bookNum;
}

}
