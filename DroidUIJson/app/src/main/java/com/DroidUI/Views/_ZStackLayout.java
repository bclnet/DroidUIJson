package com.DroidUI;

public class _ZStackLayout implements _VariadicView_UnaryViewRoot {
    public Alignment alignment;
    
    public _ZStackLayout() { this(Alignment.center); }
    public _ZStackLayout(Alignment alignment) {
        this.alignment = alignment;
    }

    public View body(_VariadicView_Children children) {
        System.exit(0);
        return null;
    }
}
