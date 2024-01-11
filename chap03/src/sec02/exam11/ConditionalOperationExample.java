package sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		//85가 90보다커? 틀림. 그러면 A무시하고 다음 score부분으로 넘어감, 80보다 커? 맞음. 그럼 B로 실행 틀리면 다음 C
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
