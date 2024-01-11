package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 101;
		
		if(score>100) {
			System.out.println("점수는 100점 이상을 입력할 수 없습니다.");
		} else if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다 입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다 입니다.");
		} else {
			System.out.println("점수가 60~69 입니다.");
			System.out.println("등급은 D 입니다 입니다.");
		}
	} //if는 if(~~~){~~~}형식임, 맨 위부터 if실행, 진실이면 결과값, 틀렸으면 두번 째 else if로 감, 거기서 다시 진실이면 결과, 틀렸으면 다음 else if
		// 마지막은 보통 else를 넣음. 나머지 남는 것들을 뺴먹지 않기 위해서, 필수는 x

}
