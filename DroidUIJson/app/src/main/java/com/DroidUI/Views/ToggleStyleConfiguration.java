package com.DroidUI;

public class ToggleStyleConfiguration {
    public ToggleStyleConfiguration.Label label;
    
    public Boolean __isOn;
    public Boolean getIsOn() { return __isOn; }
    public void setIsOn(Boolean newValue) { __isOn = newValue; }
    
    public Binding<Boolean> get__isOn() { return new Binding<Boolean>(() -> getIsOn(), (newValue) -> setIsOn(newValue)); }

    public class Label implements View {
        public View getBody() {
            System.exit(0);
            return null;
        }
    }
}
