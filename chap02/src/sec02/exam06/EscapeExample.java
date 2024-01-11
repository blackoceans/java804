package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");
		//ln은 줄바꿈을 의미
		System.out.print("행 단위 출력\n");
		//프린트뒤에 안 쓰고 안에 \n으로도 표현가능
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		//출력에 "를 넣고싶으면 \"를 넣으면 나옴
		System.out.print("봄\\여름\\가을\\겨울");

	}

}
