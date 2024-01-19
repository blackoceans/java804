package verify.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		//controller.setService(new Service()); 안됨
		//controller.service.login();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService()); //자동형변환
		controller.service.login();

	}

}
