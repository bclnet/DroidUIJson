package com.DroidUI;

public class State<Value> {
    Value _value;
    AnyLocation<Value> _location;
    
    public State() { this(null); }
    public State(Value value) {
        this._value = value;
        this._location = new AnyLocation(value);
    }
    
    public Value getWrappedValue() { return _location._value; }
    public void setWrappedValue(Value newValue) { _location._value = newValue; }
    
    public Binding<Value> getProjectedValue() { return new Binding<Value>(() -> getWrappedValue(), (newValue) -> setWrappedValue(newValue)); }
    
    //public static func _makeProperty<V>(in buffer: inout _DynamicPropertyBuffer, container: _GraphValue<V>, fieldOffset: Int, inputs: inout _GraphInputs) { }
}
