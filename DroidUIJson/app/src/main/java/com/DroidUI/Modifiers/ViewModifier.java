package com.DroidUI;

public interface ViewModifier {
	default View body(_ViewModifier_Content<ViewModifier> content) {
		System.exit(0);
		return null;
	}

	public static <T extends ViewModifier> ModifiedContent<ViewModifier, T> concat(ViewModifier self, T modifier) {
		return new ModifiedContent<ViewModifier, T>(self, modifier);
	}

	static _ViewOutputs _makeView(_GraphValue<ViewModifier> modifier, _ViewInputs inputs,
			Func2<_Graph, _ViewInputs, _ViewOutputs> body) {
		System.exit(0);
		return null;
	}

	static _ViewListOutputs _makeViewList(_GraphValue<ViewModifier> modifier, _ViewListInputs inputs,
			Func2<_Graph, _ViewListInputs, _ViewListOutputs> body) {
		System.exit(0);
		return null;
	}
}
