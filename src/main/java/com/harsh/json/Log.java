package com.harsh.json;

public class Log {

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	private int mileage;

	private int speed;

	@Override
	public String toString() {
		return "Log [mileage=" + mileage + ", speed=" + speed + ", fuel=" + fuel + "]";
	}

	private int fuel;

	public Log() {

	}
}
