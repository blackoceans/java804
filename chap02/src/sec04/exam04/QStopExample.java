package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception { //throws~ 넣어야함
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("Keycode: " + KeyCode);
			if(KeyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
