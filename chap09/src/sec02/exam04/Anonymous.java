package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg2 = 20; arg2는 fianl없어도 있는 것이라 못 바꿈
		//var2도 못 바꿈 빨간줄 안 그려도 실행이 안 됨
		
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 +var2;
				return result;
			}
			
		};
		System.out.println(calc.sum());
	}
}
