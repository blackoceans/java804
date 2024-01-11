package sec03.exam07;

public class PremitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		//parse가 문자를 숫자로 바꿈??
		int value4 = Integer.parseInt("50");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true"); 
		
		System.out.println("value1: " + value1);
		//System.out.println("value1+4: " + value1 + value4);<< ""때문에 뒤가 문자화
		System.out.println(value1 + value4); // 이건 그냥 숫자로 계산
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str4 = String.valueOf(50);
		//valueof<<문자화??
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println(str1 + str4);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

	}

}
