package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		//작은 것을 큰 것에 넣어서 큰 걸로 결과값을 내서 이상없음
		System.out.println(result);
	}

}
