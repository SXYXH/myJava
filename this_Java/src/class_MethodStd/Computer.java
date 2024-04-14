package class_MethodStd;

public class Computer {
	int sum(int ... values) {
		
		//합을 담을 변수 sum 0으로 초기화
		int sum = 0;
		
		//for문으로 values의 길이만큼 반복실행
		//반복내용 : sum에 values의 값을 처음부터 끝까지(배열 길이) 누적해서 더한다.
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		//int 타입 메소드이기 때문에 리턴값이 있다 (sum)
		return sum;
	}
}
