package com.chainsys.classandmethods;

public class Book {
      private String bookname;
      private String author;
      private final int bookSerialNo;
      private int price;
    public Book(int bookno) {
    	bookSerialNo=bookno;
    }
	public String prithivi() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBookSerialNo() {
		return bookSerialNo;
	} 
}
