package sec02.exam02;

public class PrintThread extends Thread {
	//stop = false
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}