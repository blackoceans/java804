package exam07.test02;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance; //외부에서 balance 필드를 마음대로 변경하지 못하도록 하고

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) { //set은 리턴을 안 쓴다
		if(balance<MIN_BALANCE | balance>MAX_BALANCE) {
			return;
		}
		this.balance += balance; 
		
	}
	
}
