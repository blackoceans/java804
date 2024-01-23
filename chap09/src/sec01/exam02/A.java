package sec01.exam02;

public class A {
	//인스턴스 필드
	B field1 = new B(); //인스턴스인 B(다수)를 B에 넣으니 문제x
	C field2 = new C(); //정적 C (1개)를 C 인스턴트 필드에 넣으니 가능?
	
	//인스턴스 메소드
	void method() {
		B var1 = new B();
		C var2 = new C();
	}
	//static B field3 = new B(); new B();는 여러개 생성하는 생성자를 static인 1개에 넣을 수 없다
	static C field4 = new C(); // new C를 아래에 보면 스테틱 클래스임, 1개를 static에 넣을 수 있음
	//바깥쪽 정적 필드나 메소드에서는 객체 생성 없이 접근이 가능하지만 안쪽 인스턴스 객체(실제 내용물)은 그렇지 않기 때문
	//or 멤버 클래스가 인스턴스면 객체 생성이 전제 조건인데 바깥 필드나 메소드가 정적이라면 객체 생성이 안되어 있을 수 있기 때문
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B {} //
	//정적 멤버 클래스
	static class C {}
}
