package com.DroidUI;

import android.graphics.Rect;
import android.graphics.Point;
import android.graphics.Matrix;
import android.util.SizeF;

public class Path implements Shape {
	Storage storage;

	public Path() {
		System.exit(0);
	}

	public Path(android.graphics.Path path) {
		this.storage = new Storage(Storage.Type.path);
		this.storage.path = new PathBox(path);
	}

	public Path(Rect rect) {
		this.storage = new Storage(Storage.Type.rect);
		this.storage.rect = rect;
	}

	public Path(Rect roundedRect, SizeF cornerSize) {
		this(roundedRect, cornerSize, RoundedCornerStyle.circular);
	}

	public Path(Rect roundedRect, SizeF cornerSize, RoundedCornerStyle style) {
		this.storage = new Storage(Storage.Type.roundedRect);
		this.storage.roundedRect = new FixedRoundedRect(roundedRect, cornerSize, style);
	}

	public Path(Rect roundedRect, float cornerSize) {
		this(roundedRect, cornerSize, RoundedCornerStyle.circular);
	}

	public Path(Rect roundedRect, float cornerRadius, RoundedCornerStyle style) {
		SizeF cornerSize = new SizeF(cornerRadius, cornerRadius);
		this.storage = new Storage(Storage.Type.roundedRect);
		this.storage.roundedRect = new FixedRoundedRect(roundedRect, cornerSize, style);
	}

	//public Path(Rect ellipse) {
	//	this.storage = new Storage(Storage.Type.ellipse);
	//	this.storage.ellipse = ellipse;
	//}

	public Path(Action1<Path> callback) {
		System.exit(0);
	}

	public Path(String string) {
		System.exit(0);
	}

	class PathBox {
		android.graphics.Path cgPath;

		PathBox(android.graphics.Path cgPath) {
			this.cgPath = cgPath;
		}
	}

	static class Storage {
		enum Type

		{ empty, rect, ellipse, roundedRect, stroked, trimmed, path }

		Type value;

		Storage(Type value) {
			this.value = value;
		}

		Rect rect;
		Rect ellipse;
		FixedRoundedRect roundedRect;
		StrokedPath stroked;
		TrimmedPath trimmed;
		PathBox path;
	}

	public static class Element {
		enum Type

		{ move, line, quadCurve, curve }

		Type value;

		Element(Type value) {
			this.value = value;
		}

		Point to;
		Point control;
		Point control2;
	}

	public Path path(Rect in) {
		System.exit(0);
		return null;
	}

	public android.graphics.Path getCgPath() {
		System.exit(0);
		return null;
	}

	public boolean getIsEmpty() {
		System.exit(0);
		return false;
	}

	public Rect getBoundingRect() {
		System.exit(0);
		return null;
	}

	public boolean contains(Point p) {
		return contains(p, false);
	}

	public boolean contains(Point p, boolean eoFill) {
		System.exit(0);
		return false;
	}

	public void forEach(Action1<Element> body) {
		System.exit(0);
	}

	public Path strokedPath(StrokeStyle style) {
		System.exit(0);
		return null;
	}

	public Path trimmedPath(float from, float to) {
		System.exit(0);
		return null;
	}

	// MUTATING

	public void move(Point to) {
	}

	public void addLine(Point to) {
	}

	public void addQuadCurve(Point to, Point control) {
	}

	public void addCurve(Point to, Point control1, Point control2) {
	}

	public void closeSubpath() {
	}

	public void addRect(Rect in) {
		addRect(in, null);
	}

	public void addRect(Rect in, Matrix transform) {
	}

	public void addRoundedRect(Rect in, SizeF cornerSize) {
		addRoundedRect(in, cornerSize, RoundedCornerStyle.circular, null);
	}

	public void addRoundedRect(Rect in, SizeF cornerSize, RoundedCornerStyle style) {
		addRoundedRect(in, cornerSize, style, null);
	}

	public void addRoundedRect(Rect in, SizeF cornerSize, Matrix transform) {
		addRoundedRect(in, cornerSize, RoundedCornerStyle.circular, transform);
	}

	public void addRoundedRect(Rect in, SizeF cornerSize, RoundedCornerStyle style, Matrix transform) {
	}

	public void addEllipse(Rect in) {
		addEllipse(in, null);
	}

	public void addEllipse(Rect in, Matrix transform) {
	}

	public void addRects(Rect[] rects) {
		addRects(rects, null);
	}

	public void addRects(Rect[] rects, Matrix transform) {
	}

	public void addLines(Point[] lines) {
	}

	public void addRelativeArc(Point center, float radius, Angle startAngle, Angle delta) {
		addRelativeArc(center, radius, startAngle, delta, null);
	}

	public void addRelativeArc(Point center, float radius, Angle startAngle, Angle delta, Matrix transform) {
	}

	public void addArc(Point center, float radius, Angle startAngle, Angle endAngle, boolean clockwise) {
		addArc(center, radius, startAngle, endAngle, clockwise, null);
	}

	public void addArc(Point center, float radius, Angle startAngle, Angle endAngle, boolean clockwise,
			Matrix transform) {
	}

	public void addArc(Point tangent1End, Point tangent2End, float radius) {
		addArc(tangent1End, tangent2End, radius, null);
	}

	public void addArc(Point tangent1End, Point tangent2End, float radius, Matrix transform) {
	}

	public void addPath(Path path) {
		addPath(path, null);
	}

	public void addPath(Path path, Matrix transform) {
	}

	public Point getCurrentPoint() {
		System.exit(0);
		return null;
	}

	public Path applying(Matrix transform) {
        System.exit(0);
        return null;
    }

	public Path offsetBy(float dx, float dy) {
		System.exit(0);
		return null;
	}
}
