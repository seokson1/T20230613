package com.yedam;

import java.io.Serializable;

public class Board implements Serializable {
	
	private int number;
	private String title;
	private  String contents;
	private String user;
	
	public void Borad() {};
	
	public Board(int number, String title, String contents, String user) {
		this.number = number;
		this.title = title;
		this.contents = contents;
		this.user = user;
	}
	public Board(int number, String contents) {
		this.number = number;
		this.contents = contents;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "게시글번호: " +  number + " 제목: " + title  +
	" 내용: " +  contents + " " + " 작성자: " + " " +user;
	}
	
}
