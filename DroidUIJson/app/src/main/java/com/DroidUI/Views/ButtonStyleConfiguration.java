package com.DroidUI;

public class ButtonStyleConfiguration {
	public Label label;
	public boolean isPressed;

	public class Label implements View {
		public Object _storage;

		Label(Object storage) {
			this._storage = storage;
		}

		public Never getBody() {
			System.exit(0);
			return null;
		}
	}
}
