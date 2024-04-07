package class_MethodStd;

public class Car_this {
	String model;
	int speed;
	
	Car_this(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run(){
		this.setSpeed(100);
		System.out.println(model + "가 달립니다 / 시속 " + speed +"km/h");
		
	}
}
