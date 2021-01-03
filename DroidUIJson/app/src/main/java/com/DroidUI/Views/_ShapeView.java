package com.DroidUI;

public class _ShapeView<Content extends Shape, Style extends ShapeStyle> implements View {
	public Content shape;
	public Style style;
	public FillStyle fillStyle;

	public _ShapeView(Content shape, Style style) {
		this(shape, style, new FillStyle());
	}

	public _ShapeView(Content shape, Style style, FillStyle fillStyle) {
		this.shape = shape;
		this.style = style;
		this.fillStyle = fillStyle;
	}

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<_ShapeView> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}
}
