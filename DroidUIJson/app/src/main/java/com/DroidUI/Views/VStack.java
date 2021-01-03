package com.DroidUI;

public class VStack<Content extends View> implements View {
	public _VariadicView_Tree<_VStackLayout, Content> _tree;

	public VStack(Func<Content> content) {
		this(HorizontalAlignment.center, null, content);
	}

	public VStack(HorizontalAlignment alignment, Func<Content> content) {
		this(alignment, null, content);
	}

	public VStack(Float spacing, Func<Content> content) {
		this(HorizontalAlignment.center, spacing, content);
	}

	public VStack(HorizontalAlignment alignment, Float spacing, Func<Content> content) {
		_tree = new _VariadicView_Tree(new _VStackLayout(alignment, spacing), content.v());
	}

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<VStack> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}
}
