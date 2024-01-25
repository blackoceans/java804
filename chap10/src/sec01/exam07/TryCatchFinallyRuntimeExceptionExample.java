package sec01.exam07;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
/*		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
			return;
		}
*/	
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} finally {
			System.out.println("다시 실행하세요");
		} //finally는 무조건 실행하라는 뜻, 위에껀 catch를 끝내면 return 강제 종료 시켜버림, return은 finally엔 쓸 수 없다
			//try 2개를 순서를 바꾸면 전부 출력됨
	}

}
