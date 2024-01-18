package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		Animal animal = null; //new 못씀
		animal = new Dog(); 
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog()); //위에 "new 못씀" 써있는 곳이랑 똑같이 작동
		animalSound(new Cat());
	}	
	
	public static void animalSound(Animal animal) {
		animal.sound();
		}
}
