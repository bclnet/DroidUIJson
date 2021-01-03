package com.DroidUI;

import java.util.EnumSet;

public class PaddingModifier implements ViewModifier {
	static float defaultPadding = 8;

	public EdgeInsets value;

	PaddingModifier(EdgeInsets insets) {
		this.value = insets;
	}

	PaddingModifier() {
		this(Edge.Set.all, defaultPadding);
	}

	PaddingModifier(EnumSet<Edge> edges) {
		this(edges, defaultPadding);
	}

	//PaddingModifier(float length) { this(Edge.Set.all, length); }
	PaddingModifier(EnumSet<Edge> edges, float length) {
		this.value = new EdgeInsets(edges.contains(Edge.top) ? length : 0, edges.contains(Edge.leading) ? length : 0,
				edges.contains(Edge.bottom) ? length : 0, edges.contains(Edge.trailing) ? length : 0);
	}

	PaddingModifier(float length) {
		this.value = new EdgeInsets(length, length, length, length);
	}

	@Override
	public String toString() {
		return String.format("PaddingModifier {padding: %f}", value);
	}
}
