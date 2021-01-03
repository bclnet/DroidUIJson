package com.DroidUI;

public class Group<Content extends View> implements View {
    public Content _content;

    public Group(Func<Content> content) {
        this._content = content.v();
    }
 
	public View getBody() {
		System.exit(0);
		return null;
	}

    public static _ViewListOutputs _makeViewList(_GraphValue<Group> view, _ViewListInputs inputs) {
        System.exit(0);
        return null;
    }
}
