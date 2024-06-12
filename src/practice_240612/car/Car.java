package practice_240612.car;

public class Car {
	//protected String company = "weniv";

	private int speed;
	private int gear;
	private String wheel;
	private int cc;
	private String logo;
	private String engine;

	public int getGear() {
		return gear;
	}

	public String getWheel() {
		return wheel;
	}

	public int getCc() {
		return cc;
	}

	public String getLogo() {
		return logo;
	}

	public String getEngine() {
		return engine;
	}

	public double getSpeed() {
		return this.speed * 1.6;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Car(int gear) {
		this.gear = gear;
	}

	public void setSpeed(int speed, int gear) {
		this.speed = speed < 0 ? 0 : speed;
		this.speed = speed;

		if (speed <= 30) {
			this.gear = 1;
		} else if (speed <= 70) {
			this.gear = 2;
		} else {
			this.gear = 3;
		}
	}



	public void checkSpeed() {
		System.out.println(this.speed);
	}
}
