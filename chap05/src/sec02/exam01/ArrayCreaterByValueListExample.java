package sec02.exam01;

public class ArrayCreaterByValueListExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87 };
		
//		변수를 나중에 지정하려면     int[] scores2;
//							scores2 = new int[]{ 83, 90, 87}; 이렇게 new를 넣어야함
//							int[] scores2;
//							scores2 = {83, 90, 87}; 이건 틀림		
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :" + avg);

	}

}
