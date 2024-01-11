package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //i<3등등 대신 i<scores.length;로 쓰면 수치가 바뀌어도 바꾸지 않아서 편함
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

	}

}
