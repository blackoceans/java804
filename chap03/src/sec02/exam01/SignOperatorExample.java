package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		byte b = 100;
		//byte result3 = -b; , -를 붙혀서 값을 넣어도 수학계산이 일어나는것 = int로 바뀜
		int result3 = -b;
		System.out.println("result3="+result3);
	}

}
