package com.DroidUI;

class ForegroundColorEnvironmentKey implements EnvironmentKey {
    static String getKey() { return "foregroundColor"; }
    static Object getDefaultValue() { return (Color)null; }
}
