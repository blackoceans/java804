package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); //재정의한게 실행됨
		//parent.method3(); 형변환되서 불가능
		
		Child child2 = (Child)parent;
		child2.method3(); //다시 형변환해서 이거있으면 위에 3가능
	}

}
