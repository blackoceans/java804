package sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		
		//슈퍼는 본인꺼 보다 위쪽에 써야함
	}
}
