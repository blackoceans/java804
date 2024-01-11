package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter:
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
					//브레이크 outter를 써서 위에있는 outter이하 즉, 전체가 종료됨 
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
