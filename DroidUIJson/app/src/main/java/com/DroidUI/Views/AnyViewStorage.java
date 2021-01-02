package com.DroidUI;

public class AnyViewStorage<V extends View> extends AnyViewStorageBase {
    public V _view;
    
    AnyViewStorage(V view) {
        this._view = view;
    }
}
