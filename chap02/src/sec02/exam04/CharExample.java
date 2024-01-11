package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		// " 아니고 '로 써야함, A는 65임
		char c2 = 65;
		char c3 = '\u0041';
		// \는 16진수로 표현한 말
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);


	}

}
