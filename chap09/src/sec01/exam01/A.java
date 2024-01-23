package sec01.exam01;

public class A {
	A(){
		System.out.println("A 객체가 생성됨");
	}
	//인스턴스 멤버 클래스
	public class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		//static int field2; 불가능
		void method1() {}
		//static void method2() {} 불가능
	}
	//정적 멤버 클래스
	static class C {
		C() { System.out.println("C 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	//로컬 클래스
	void method() {
		class D { //로컬변수
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
