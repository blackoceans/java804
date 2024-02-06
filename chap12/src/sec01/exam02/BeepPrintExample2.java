package sec01.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //안기다리고 스타트에 도달하는 순간 아래도 같이 실행함
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
