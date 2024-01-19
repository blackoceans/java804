package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
		
		rc = new Audio();
		
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
	
	}

}
