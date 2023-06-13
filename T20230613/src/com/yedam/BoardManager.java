package com.yedam;

public interface BoardManager {

	void register(Board board);

	void modify(Board board);

	void search(int no);

	void remove(int no);

	void list();
	
	void exit();
	
	void readList();
}
