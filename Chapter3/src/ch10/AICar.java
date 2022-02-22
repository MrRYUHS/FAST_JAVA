package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
	}
	
	@Override
	public void wiper() {
		System.out.println("비가오면 자동으로 와이퍼가 켜집니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("자동세차를 합니다.");
	}
}
