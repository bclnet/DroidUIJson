package com.DroidUI;

public interface ShapeStyle {
	static <S extends Shape> _ViewOutputs _makeView(_GraphValue<_ShapeView<S, ShapeStyle>> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}
}

/*
extension ShapeStyle where Self: View, Self.Body == _ShapeView<Rectangle, Self> {
    public var body: _ShapeView<Rectangle, Self> {
        get {
            fatalError()
        }
    }
}
*/