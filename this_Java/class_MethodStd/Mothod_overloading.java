package class_MethodStd;

public class Mothod_overloading {
	//직사각형 정사각형의 넓이 구하기 ( 메소드 오버로딩)
	double areaRectangle(double width) {
		double square = width* width;
		return square;
	}
	double areaRectangle(double height,double width) {
		double Rectangle = height* width;
		return Rectangle;
	}
}
