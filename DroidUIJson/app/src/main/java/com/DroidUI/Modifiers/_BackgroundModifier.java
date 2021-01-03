package com.DroidUI;

public class _BackgroundModifier<Background extends View> implements ViewModifier {
	public Background background;
	public Alignment alignment;

	_BackgroundModifier(Background background, Alignment alignment) {
		this.background = background;
		this.alignment = alignment;
	}

	public static _ViewOutputs _makeView(_GraphValue<_BackgroundModifier> modifier, _ViewInputs inputs,
			Func2<_Graph, _ViewInputs, _ViewOutputs> body) {
		System.exit(0);
		return null;
	}
}
