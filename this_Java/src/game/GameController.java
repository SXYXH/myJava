package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
	Scanner sc = new Scanner(System.in);
	QuizListUpdate quizlist = new QuizListUpdate();
	public void game() {
		
		while(true) {
			System.out.println("메뉴선택");
			System.out.println("1. 게임시작    2.종료");
			if(sc.nextInt() == 1) {
				System.out.println("게임을 시작합니다");
				quizlist.musicGame();
			}else {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}

		
	public void GameStart() {
		List<String> list = new ArrayList<>();
		System.out.print("이름을 입력해주세요 : ");
		list.add(sc.next());	
		System.out.println(list.get(0) + "님 게임을 시작합니다");
				
		GameController gc = new GameController();
		gc.game();				
	}
}

