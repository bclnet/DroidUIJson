package com.DroidUI;

public class _EnvironmentKeyWritingModifier<Value> implements ViewModifier {
	public WritableKeyPath<EnvironmentValues, Value> keyPath;
	public Value value;

	public _EnvironmentKeyWritingModifier(WritableKeyPath<EnvironmentValues, Value> keyPath, Value value) {
		this.keyPath = keyPath;
		this.value = value;
	}
}
