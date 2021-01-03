package com.DroidUI;

class ColorSchemeEnvironmentKey implements EnvironmentKey {
	static String getKey() {
		return "colorScheme";
	}

	static Object getDefaultValue() {
		return ColorScheme.dark;
	}
}
