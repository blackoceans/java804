package sec01.exam06;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
//트라이는 블록 안을 검사하고 오류가 있으면 케치를 실행함
	}

}
