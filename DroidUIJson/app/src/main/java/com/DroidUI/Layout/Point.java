package com.DroidUI;

public class Point {
    public int x;
    public int y;
    
    public static Point zero = new Point(0, 0);

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
