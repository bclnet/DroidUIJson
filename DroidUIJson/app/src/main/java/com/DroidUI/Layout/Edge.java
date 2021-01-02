package com.DroidUI;

import java.util.EnumSet;

public enum Edge {
    top((byte)1),
    leading((byte)2),
    bottom((byte)4),
    trailing((byte)8);

    public final byte rawValue;

    private Edge(byte rawValue) {
        this.rawValue = rawValue;
    }

    public static class Set {
        public static EnumSet<Edge> top = EnumSet.of(Edge.top);
        public static EnumSet<Edge> leading = EnumSet.of(Edge.leading);
        public static EnumSet<Edge> bottom = EnumSet.of(Edge.bottom);
        public static EnumSet<Edge> trailing = EnumSet.of(Edge.trailing);
        public static EnumSet<Edge> horizontal = EnumSet.of(Edge.leading, Edge.trailing);
        public static EnumSet<Edge> vertical = EnumSet.of(Edge.top, Edge.bottom);
        public static EnumSet<Edge> all = EnumSet.allOf(Edge.class);
    }
}
