package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new phone(); 불가능 추상클래스라서, 상속받은 자식을 통해서만 가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
