package com.DroidUI;

public class Button<Label extends View> implements View {
	public Label _label;
	public Action _action;

	public Label getBody() {
		return _label;
	}

	public Button(Action action, Func<Label> label) {
		this._action = action;
		this._label = label.v();
	}

	/*
	where Label == Text
	public Button(String title, Action action) {
	    this._action = action.v();
	    this._label = new Text(title);
	}
	*/
}
