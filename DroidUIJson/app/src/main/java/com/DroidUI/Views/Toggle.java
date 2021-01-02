package com.DroidUI;

public class Toggle<Label extends View> implements View {
    public Binding<Boolean> __isOn;
    public Label _label;
    
    public Toggle(Binding<Boolean> isOn, Func<Label> label) {
        this.__isOn = isOn;
        this._label = label.v();
    }
    // where Label == ToggleStyleConfiguration.Label
    //public Toggle(ToggleStyleConfiguration configuration) {
    //    this.__isOn = configuration.__isOn;
    //    this._label = configuration.label;
    //}
    // where Label == Text
    public Toggle(LocalizedStringKey titleKey, Binding<Boolean> isOn) {
        System.exit(0);
    }
    public Toggle(String title, Binding<Boolean> isOn) {
        System.exit(0);
    }

    public View getBody() {
        return _label;
    }
}
