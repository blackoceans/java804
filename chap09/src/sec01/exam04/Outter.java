package sec01.exam04;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; 앞에 final붙여야 오류안남
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(final int arg) {
		final int localVariable = 1;
		//arg = 100; 앞에 final붙여도 됨(자바가 자동으로 인식함) 변수를 변경하면 오류남
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
