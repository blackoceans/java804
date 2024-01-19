package sec01.exam04;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10; //static final가 생략되어 있는 것, 대문자로씀
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume); //public abstract가 생략되어 있는 것
}
