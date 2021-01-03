package com.DroidUI;

public class _HStackLayout implements _VariadicView_UnaryViewRoot {
	public VerticalAlignment alignment;
	public Float spacing;

	public _HStackLayout() {
		this(VerticalAlignment.center, null);
	}

	public _HStackLayout(VerticalAlignment alignment) {
		this(alignment, null);
	}

	public _HStackLayout(Float spacing) {
		this(VerticalAlignment.center, spacing);
	}

	public _HStackLayout(VerticalAlignment alignment, Float spacing) {
		this.alignment = alignment;
		this.spacing = spacing;
	}
}
