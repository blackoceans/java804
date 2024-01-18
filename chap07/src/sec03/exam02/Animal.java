package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
		
	}
	
	public abstract void sound(); //메소드지만 중괄호가 없음. 추상이라서 못씀, 쓰면 안됨
}
