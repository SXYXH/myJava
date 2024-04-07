package class_MethodStd;

public class Car {
	int gas;
	
	// 리턴타입이 없는 메소드로 매개값을 받아서 필드에있는 gas 값 변경
	void setGas(int gas) {
		// 이객체의 gas 에  매개변수 gas에서 받아온 값을 넣어라. 
		this.gas = gas;
		// 실행 클래스에 더작성하기 싫어서 책과 다르게 작성했다.
		if(this.gas > 0 ) {
			System.out.println("출발");
			run();
		}
	}
	
	// 매개변수를 정해주지 않았다면 필드에있는 gas를 사용
	boolean checkGas() {
		if(gas == 0) {
			System.out.println("연료가 없습니다.");
			return false;
		}
		System.out.println("연료가" + this.gas + " 만큼 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. 가스 잔량 : " + gas);
				gas -= 1;
			} else {
			System.out.println("멈춥니다. 가스 잔량 : " + gas);
			return; // 메소드 종료  추가로 작성하고 싶다면 break; 를 사용해야함
			}
		}
	}
}
	
	


