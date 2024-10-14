package oops;

public class InterfaceDemo  implements Genericfunctions {

	@Override
	public void TurnOnorOff(boolean flag) {
		if (flag) {
			turnOn();
		} else {
			turnOff();
		}

	}

	private void turnOff() {
		System.out.println("turn off");
	}

	private void turnOn() {
		System.out.println("turn on");

	}

	@Override
	public void changeSpeed(int newSpeed) {
		int snewSpeed = newSpeed;
		System.out.println("Speed  " + snewSpeed);
	}

	@Override
	public void startedPlay(String value) {
		System.out.println("Started playing  " + value);

	}

}
