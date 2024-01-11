package sec02.exam08;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		//더블이랑 플룻은 소수점 아래로 많이 내려가면 미세하게 오차가 있음, 그래서 다르다고 나옴
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
	}

}
