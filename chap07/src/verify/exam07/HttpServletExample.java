package verify.exam07;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
		//윗줄 2개 쓰는게 문제였음

	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
