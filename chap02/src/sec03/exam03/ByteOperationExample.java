package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		//변수지정을 안해놔서 그냥 숫자면 자동으로 int로 지정됨. 그래서 강제변환이 일어난 것 
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);

	}

}
