package class_MethodStd;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	void powerOn() {
		System.out.println("전원 켜기");
		// 리턴값 없음
	}
	void powerOff() {
		System.out.println("전원 끄기");
		// 리턴값 없음
	}
	
	
	//int형값을 리턴해주는 메소드이므로 int 값 리턴해줘야함
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	int divide(int x, int y) {
		int result = x - y;
		return result;
		
	}
	
	// plus 메소드와 divde 메소드를 호출해서 입력받은 값을 계산해주는 CalculatorOn 메소드
	void CalculatorOn() {
		Calculator cal = new Calculator();
		cal.powerOn();
		System.out.print("덧셈 두수를 입력하세요 : ");
		System.out.println(cal.plus(sc.nextInt(), sc.nextInt()));
		System.out.print("뺄셈 두수를 입력하세요 : ");
		System.out.println(cal.divide(sc.nextInt(), sc.nextInt()));
		cal.powerOff();
	}
}
