package sec02.exam02;

public class Exam01 {

	public static void main(String[] args) {
		int[][] array = {{95, 86}, {83,92,96}, {78, 83, 93, 87, 88} };
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
			
		avg = (double) sum / count; //카운트 대신 10개라서 10으로 나눠도됨
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
