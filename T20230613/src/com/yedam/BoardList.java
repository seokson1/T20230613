package com.yedam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardList  implements BoardManager {

	Scanner scn = new Scanner(System.in);
	List<Board> arr = new ArrayList<Board>();

	@Override
	public void register(Board board) {
		arr.add(board);
	}

	@Override
	public void modify(Board board) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getNumber() == board.getNumber()) {
				arr.get(i).setContents(board.getContents());
				System.out.println("게시물이 수정되었습니다.");
			}
		}
	}

	@Override
	public void search(int no) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getNumber() == no) {
				System.out.println(arr.get(i).toString());
			}
		}
	}

	@Override
	public void remove(int no) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getNumber() == no) {
				arr.remove(i);
				System.out.println("게시물이 삭제되었습니다.");
			}
		}
	}

	@Override
	public void list() {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("제목: " + arr.get(i).getTitle() + " " + "작성자: " + arr.get(i).getUser());
		}
	}

	@Override
	public void exit() {
		try {
			FileOutputStream fw = new FileOutputStream("c:/temp/boardList.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fw);

			oos.writeObject(arr);

			oos.flush();
			oos.close();
			fw.flush();
			fw.close();
			System.out.println("저장완료.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void readList() {
		FileInputStream fs;
		try {
			fs = new FileInputStream("c:/temp/boardList.dat");
			ObjectInputStream ois = new ObjectInputStream(fs);
			
			arr = (List<Board>) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
