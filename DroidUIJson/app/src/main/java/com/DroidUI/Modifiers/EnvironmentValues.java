package com.DroidUI;

import java.util.HashMap;

public class EnvironmentValues {
    HashMap<String, Object> values;

    public EnvironmentValues() {
        values = new HashMap<String, Object>();
    }

    <K extends EnvironmentKey, V> V get() {
        Object value = values.get(K.getKey());
        return (V)(value != null ? value : K.getDefaultValue());
    }

    <K extends EnvironmentKey, V> void set(V newValue) {
        values.put(K.getKey(), newValue);
    }

    public Color getForegroundColor() { return this.<ForegroundColorEnvironmentKey, Color>get(); }
    public void setForegroundColor(Color newValue) { this.<ForegroundColorEnvironmentKey, Color>set(newValue); }

    public ColorScheme getColorScheme() { return this.<ColorSchemeEnvironmentKey, ColorScheme>get(); }
    public void setColorScheme(ColorScheme newValue) { this.<ColorSchemeEnvironmentKey, ColorScheme>set(newValue); }
}
