package com.yedam;

import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		// 추가 - 4개 항목 넣기. / 수정 - 글 번호 기존 글 내용 변경 / 조회 - 글번호 -> 상세보기.(전체확인) / 삭제-> 번호 ->
		// 삭제 / 목록-> 글번호 -> 제목, 작성자 | 등록 유형 - ArrayList. 담기 자료
		boolean run = true;
		BoardManager app = new BoardList();
		app.readList();
		Scanner scn = new Scanner(System.in);
		int cho = 0;

		while (run) {
				System.out.println("1.추가 | 2.수정 | 3.조회 | 4.삭제 | 5.목록 | 6. 종료");
				cho = scn.nextInt();
				scn.nextLine();
			switch (cho) {
			case MENU.REGISTER:
				System.out.print("게시글 번호> ");
				int no = scn.nextInt();
				scn.nextLine();
				System.out.print("제목> ");
				String title = scn.nextLine();
				System.out.print("내용> ");
				String contents = scn.nextLine();
				System.out.print("작성자> ");
				String user = scn.nextLine();
				app.register(new Board(no, title, contents, user));
				break;
			case MENU.MODIFY:
				System.out.println("게시글 번호> ");
				no = scn.nextInt();
				scn.nextLine();
				System.out.print("수정할 내용> ");
				contents = scn.nextLine();
				app.modify(new Board(no, contents));
				break;
			case MENU.SEARCH:
				System.out.print("게시글 번호> ");
				no = scn.nextInt();
				scn.nextLine();
				app.search(no);
				break;
			case MENU.REMOVE:
				System.out.print("게시글 번호> ");
				no = scn.nextInt();
				scn.nextLine();
				app.remove(no);
				break;
			case MENU.LIST:
				app.list();
				break;
			case 6:
				app.exit();
				System.out.println("프로그램 종료");
				run = false;
			}
		}

		// boarMain
		// - 종료 시점 c:/temp/boardList.dat 저장
		// 프로그램 시작
	}
}
