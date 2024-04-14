package game;

import java.util.Scanner;

public class QuizListUpdate{
    private Scanner sc = new Scanner(System.in);
    private int score = 0;

    public void musicGame() {
        String[][] quizzes = {
            {"소주한잔", "ㅅㅈㅎㅈ", "임창정", "거기 잘지내니"},
            {"런투유", "ㄹㅌㅇ", "DJ DOC", "외로울땐 나를 불러"},
            {"첫눈처럼너에게가겠다", "ㅊㄴㅊㄹㄴㅇㄱㄱㄱㄷ", "에일리", "햇살처럼 니가 내렸다."}
        };

        for (int i = 0; i < quizzes.length; i++) {
            Quiz(quizzes[i][0], quizzes[i][1], quizzes[i][2], quizzes[i][3], "문제 " + (i + 1));
        }
        System.out.println("점수 : " + score);
    }

    private void Quiz(String answer, String hint, String singer, String firstHint, String quizNumber) {
        System.out.println(quizNumber + " : " + hint);
        int hintCount = 0;
        while (true) {
            System.out.print("정답을 입력해주세요 : ");
            String input = sc.next();
            if (input.equals(answer)) {
                System.out.println("정답!");
                score += 10;
                break;
            } else {
                hintCount++;
                if (hintCount == 1) {
                    System.out.println("첫번째 힌트 : " + firstHint);
                } else if (hintCount == 2) {
                    System.out.println("두번째 힌트 : " + singer);
                } else {
                    System.out.println("세번째 힌트 : " + answer);
                    System.out.println("실패");
                    return;
                }
            }
        }
    }
    public int getScore() {
        return score;
    }
}