package com.DroidUI;

public class Size {
    public int width;
    public int height;
    
    public static Size zero = new Size(0, 0);
    
    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
