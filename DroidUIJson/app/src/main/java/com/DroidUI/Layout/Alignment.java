package com.DroidUI;

public class Alignment {
	public HorizontalAlignment horizontal;
	public VerticalAlignment vertical;

	public Alignment(HorizontalAlignment horizontal, VerticalAlignment vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}

	public static Alignment center = new Alignment(HorizontalAlignment.center, VerticalAlignment.center);
	public static Alignment leading = new Alignment(HorizontalAlignment.leading, VerticalAlignment.center);
	public static Alignment trailing = new Alignment(HorizontalAlignment.trailing, VerticalAlignment.center);
	public static Alignment top = new Alignment(HorizontalAlignment.center, VerticalAlignment.top);
	public static Alignment bottom = new Alignment(HorizontalAlignment.center, VerticalAlignment.bottom);
	public static Alignment topLeading = new Alignment(HorizontalAlignment.leading, VerticalAlignment.top);
	public static Alignment topTrailing = new Alignment(HorizontalAlignment.trailing, VerticalAlignment.top);
	public static Alignment bottomLeading = new Alignment(HorizontalAlignment.leading, VerticalAlignment.bottom);
	public static Alignment bottomTrailing = new Alignment(HorizontalAlignment.trailing, VerticalAlignment.bottom);
}

/*
public interface AlignmentID {
    static float defaultValue(ViewDimensions in);
}

class  AlignmentKey {
    private int bits;
}
*/
