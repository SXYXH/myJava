package class_MethodStd;

public class MainMethodStd {
	public static void main(String[] args) {
		/* Calculator.java 실행 
		Calculator cal = new Calculator();
		System.out.println(cal.divide(15, 5));
		System.out.println(cal.plus(15, 5));
		cal.CalculatorOn();
		*/
		
		/* Computer.java 실행
		Computer com = new Computer();
		// 변수 reslut에 Computer클래스의 참조변수인 com . sum 메소드를 호출하는데
		// sum메소드의 매개변수 개수를 정해지지 않게 선언했으므로 여기서 매개변수값을 여러개 넣어서 호출해도 정상적으로 실행된다
		int result = com.sum(1,2,3);
		System.out.println(result);
		
		int result1 = com.sum(1,2,3,4,5);
		System.out.println(result1);
		
		//배열을 먼저 선언하고 매개변수에 배열 넣기
		int[] values = {1,2,3};
		int result3 = com.sum(values);
		System.out.println(result3);
		
		// 매개변수에서 배열선언
		int result4 = com.sum(new int[] {1,2,3,4,5});
		System.out.println(result4);
		*/
		
		/* return 문 
		Car car = new Car();
		car.setGas(6);
		*/
		
		/* 메소드 오버로딩
		Mothod_overloading mo = new Mothod_overloading();
		
		System.out.println(mo.areaRectangle(10)); //정사각형의 넓이
		System.out.println(mo.areaRectangle(10,15)); //직사각형의 넓이
		*/
		
		
		/* this 연산자
		Car_this myCar = new Car_this("벤츠");
		Car_this yourCar = new Car_this("포르쉐");
		
		myCar.run();
		yourCar.run();
		*/
	}
}
