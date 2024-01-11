package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		//""가 있으면 문자화되서 출력, 10+2부분은 산수로 계산하고 뒤에 문자 8를 붙임
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		//""가 있어서 앞뒤를 전부 문자화시킴, 10과 더할게 ""이기떄문에 전부 문자
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		//처음부터 ""라서 전부 문자화
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);
		//괄호부터 산수하고 다시 앞 ""에의해 문자화
	}

}
