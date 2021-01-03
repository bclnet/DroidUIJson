package com.DroidUI;

public class _VStackLayout implements _VariadicView_UnaryViewRoot {
	public HorizontalAlignment alignment;
	public Float spacing;

	public _VStackLayout() {
		this(HorizontalAlignment.center, null);
	}

	public _VStackLayout(HorizontalAlignment alignment) {
		this(alignment, null);
	}

	public _VStackLayout(Float spacing) {
		this(HorizontalAlignment.center, spacing);
	}

	public _VStackLayout(HorizontalAlignment alignment, Float spacing) {
		this.alignment = alignment;
		this.spacing = spacing;
	}
}
