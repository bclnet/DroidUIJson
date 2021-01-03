package com.DroidUI;

/*
public class Environment<Value> implements DynamicProperty {
    enum Content {
        case keyPath(KeyPath<EnvironmentValues, Value>)
        case value(Value)
    }
    
    Content content;
    
    public Environment(_ keyPath: KeyPath<EnvironmentValues, Value>) {
        content = .keyPath(keyPath)
    }

    public Value getWrappedValue() {
        switch content {
        case let .value(value):
            return value
        case let .keyPath(keyPath):
            // not bound to a view, return the default value.
            return EnvironmentValues()[keyPath: keyPath]
        }
    }
    
    Never error() {
        System.exit(0);
        return null
    }
}
*/