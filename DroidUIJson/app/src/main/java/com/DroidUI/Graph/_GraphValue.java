package com.DroidUI;

public class _GraphValue<Value> {
    public Value value;
    
    public _GraphValue(Value value) {
        this.value = value;
    }
    
    /*
    public subscript<U>(keyPath: KeyPath<Value, U>) -> _GraphValue<U> {
        get {
            fatalError()
        }
    }
    public static func == (a: _GraphValue<Value>, b: _GraphValue<Value>) -> Bool {
        return true
    }
    */
}
