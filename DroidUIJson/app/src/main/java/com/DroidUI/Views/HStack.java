package com.DroidUI;

public class HStack<Content extends View> implements View {
	public _VariadicView_Tree<_HStackLayout, Content> _tree;

	public HStack(Func<Content> content) {
		this(VerticalAlignment.center, null, content);
	}

	public HStack(VerticalAlignment alignment, Func<Content> content) {
		this(alignment, null, content);
	}

	public HStack(Float spacing, Func<Content> content) {
		this(VerticalAlignment.center, spacing, content);
	}

	public HStack(VerticalAlignment alignment, Float spacing, Func<Content> content) {
		_tree = new _VariadicView_Tree(new _HStackLayout(alignment, spacing), content.v());
	}

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<HStack> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}
}
