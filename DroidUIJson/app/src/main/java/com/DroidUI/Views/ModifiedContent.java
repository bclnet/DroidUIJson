package com.DroidUI;

public class ModifiedContent<Content, Modifier extends ViewModifier> implements View {
    public Content content;
    public Modifier modifier;

    public ModifiedContent(Content content, Modifier modifier) {
        this.content = content;
        this.modifier = modifier;
    }

	public View getBody() {
		System.exit(0);
		return null;
	}

    public static _ViewOutputs _makeView(_GraphValue<ModifiedContent> view, _ViewInputs inputs) {
        System.exit(0);
        return null;
    }

    public static _ViewListOutputs _makeViewList(_GraphValue<ModifiedContent> view, _ViewListInputs inputs) {
        System.exit(0);
        return null;
    }

    /*
    public static _ViewOutputs _makeView(_GraphValue<ModifiedContent> modifier, _ViewInputs inputs, Func2<_Graph, _ViewInputs, _ViewOutputs> body) {
        System.exit(0);
        return null;
    }

    public static _ViewListOutputs _makeViewList(_GraphValue<ModifiedContent> modifier, _ViewListInputs inputs, Func2<_Graph, _ViewListInputs, _ViewListOutputs> body) {
        System.exit(0);
        return null;
    }
    */
}
