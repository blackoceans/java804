package test.test05;
	
public class Anonymous {
    //익명 객체 필드 사용
    Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거를 달립니다");			
		}
    	
    };
           
    void method1(){
        //익명 객체 로컬변수 사용
        Vehicle localVar = new Vehicle() {

    		@Override
    		public void run() {
    			System.out.println("자동차를 달립니다");			
    		}
        	
        };
                             
        localVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
