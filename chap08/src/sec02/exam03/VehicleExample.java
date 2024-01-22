package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare(); 불가능
		
		Bus bus = (Bus) vehicle; //강제형변환 Bus에만 있는 CheckFare사용하기 위해서
		
		bus.run();
		bus.checkFare();
	}

}
