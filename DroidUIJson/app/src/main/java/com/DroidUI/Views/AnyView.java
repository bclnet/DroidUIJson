package com.DroidUI;

public class AnyView implements View {
	public AnyViewStorageBase _storage;

	public <V extends View> AnyView(V view) {
		_storage = new AnyViewStorage<V>(view);
	}

	public AnyView(Object value) {
		System.exit(0);
	}

	public View getBody() {
		System.exit(0);
		return null;
	}
}
