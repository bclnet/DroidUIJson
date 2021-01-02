package com.DroidUI;

public class EdgeInsets {
    public float top;
    public float leading;
    public float bottom;
    public float trailing;

    public EdgeInsets() { this(0, 0, 0, 0); }
    public EdgeInsets(float all) { this(all, all, all, all); }    
    public EdgeInsets(float top, float leading, float bottom, float trailing) {
        this.top = top;
        this.leading = leading;
        this.bottom = bottom;
        this.trailing = trailing;
    }
}
