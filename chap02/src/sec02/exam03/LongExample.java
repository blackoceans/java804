package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;수가 작을 땐 L을 안 붙혀도 되지만 수가 커지면 붙여야됨. 에러남
		long var4 = 1000000000000L;
		long var5 = 2147483647; //안 붙혀도 되는 한계점
		//long var6 = 2147483648; // 이건 오류남
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
