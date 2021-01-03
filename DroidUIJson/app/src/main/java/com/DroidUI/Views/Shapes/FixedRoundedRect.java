package com.DroidUI;

import android.graphics.Rect;
import android.util.SizeF;

public class FixedRoundedRect {
	Rect rect;
	SizeF cornerSize;
	RoundedCornerStyle style;

	public FixedRoundedRect(Rect rect, SizeF cornerSize, RoundedCornerStyle style) {
		this.rect = rect;
		this.cornerSize = cornerSize;
		this.style= style;
	}
}
