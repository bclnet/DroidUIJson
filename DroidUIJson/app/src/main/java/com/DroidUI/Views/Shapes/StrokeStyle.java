package com.DroidUI;

public class StrokeStyle {
	public float lineWidth;
	public LineCap lineCap;
	public LineJoin lineJoin;
	public float miterLimit;
	public float[] dash;
	public float dashPhase;

	//public StrokeStyle(lineWidth: CGFloat = 1, lineCap: CGLineCap = .butt, lineJoin: CGLineJoin = .miter, miterLimit: CGFloat = 10, dash: [CGFloat] = [CGFloat](), dashPhase: CGFloat = 0) {
	public StrokeStyle(float lineWidth, LineCap lineCap, LineJoin lineJoin, float miterLimit, float[] dash,
			float dashPhase) {
		this.lineWidth = lineWidth;
		this.lineCap = lineCap;
		this.lineJoin = lineJoin;
		this.miterLimit = miterLimit;
		this.dash = dash;
		this.dashPhase = dashPhase;
	}

	public enum LineCap

	{
        butt,
        round,
        square,
    }

	public enum LineJoin

	{
        miter,
        round,
        bevel,
    }
}
