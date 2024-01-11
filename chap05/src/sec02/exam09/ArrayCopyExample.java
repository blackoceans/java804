package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//oldStrArry에, 0번째부터, newStrArray로, 0위치부터, 총 길이 넣기
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}

	}

}
