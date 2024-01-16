package sec01.exam04;

public class SupersonicAirpalneExample {

	public static void main(String[] args) {
		SupersonicAirpalne sa = new SupersonicAirpalne();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirpalne.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirpalne.NORMAL;
		sa.fly();
		sa.land();

	}

}
