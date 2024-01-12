package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyndai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	//아래 두개 경로명 2개써준건 같은 클래스이름이 2개 있어서 주소를 써줌 컨+쉽+o하면 임포트
}
