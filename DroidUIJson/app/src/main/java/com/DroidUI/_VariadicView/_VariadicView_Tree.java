package com.DroidUI;

public class _VariadicView_Tree<Root extends _VariadicView_Root, Content extends View> implements View {
	public Root root;
	public Content content;

	_VariadicView_Tree(Root root, Content content) {
		this.root = root;
		this.content = content;
	}

	public _VariadicView_Tree(Root root, Func<Content> content) {
		this.root = root;
		this.content = content.v();
	}

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<_VariadicView_Tree> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}

	public static _ViewListOutputs _makeViewList(_GraphValue<_VariadicView_Tree> view, _ViewListInputs inputs) {
		System.exit(0);
		return null;
	}
}
