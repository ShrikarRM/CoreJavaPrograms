package com.account.collectionfw.assignment30th;

public class  BookPQueue implements Comparable<BookPQueue> {
	private String name;
	private int pages;
	private String author;

	public BookPQueue(String name, int pages, String author) {
		super();
		this.name = name;
		this.pages = pages;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookPQueue [name=" + name + ", pages=" + pages + ", author=" + author + "]";
	}

	@Override
	public int compareTo(BookPQueue o) {
		// TODO Auto-generated method stub
		return (int) (this.pages - o.pages);
	}
}
