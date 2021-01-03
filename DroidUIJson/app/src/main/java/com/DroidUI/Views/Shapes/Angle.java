package com.DroidUI;

public class Angle {
	public double radians;

	public double getDegrees() {
		return radians * (180.0 / Math.PI);
	}

	public void setDegrees(double newValue) {
		radians = newValue * (Math.PI / 180.0);
	}

	public Angle() {
		this(0.0);
	}

	public static Angle FromDegrees(double degrees) {
		return new Angle(degrees * (Math.PI / 180.0));
	}

	public Angle(double radians) {
		this.radians = radians;
	}

	public static Angle radians(double radians) {
		return new Angle(radians);
	}

	public static Angle degrees(double degrees) {
		return new Angle(degrees * (Math.PI / 180.0));
	}
}
