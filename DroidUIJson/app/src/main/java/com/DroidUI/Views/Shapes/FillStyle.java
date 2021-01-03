package com.DroidUI;

public class FillStyle {
	public boolean isEOFilled;
	public boolean isAntialiased;

	public FillStyle() {
		this(true, true);
	}

	public FillStyle(boolean eoFill) {
		this(eoFill, true);
	}

	public FillStyle(boolean eoFill, boolean antialiased) {
		this.isEOFilled = eoFill;
		this.isAntialiased = antialiased;
	}
}