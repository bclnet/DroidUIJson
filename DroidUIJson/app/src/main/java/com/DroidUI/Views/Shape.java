package com.DroidUI;

import android.graphics.Rect;

public interface Shape extends Animatable, View {
	Path path(Rect rect);

	public default _ShapeView<Shape, ForegroundStyle> getBody() {
		System.exit(0);
		return null;
	}
}
