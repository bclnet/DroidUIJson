package com.DroidUI;

public class Tuple4<T1, T2, T3, T4> {
  public final T1 v1;
  public final T2 v2;
  public final T3 v3;
  public final T4 v4;

  public Tuple4(T1 v1, T2 v2, T3 v3, T4 v4) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
  }

  @Override
  public int hashCode() { return v1.hashCode() ^
    v2.hashCode() ^
    v3.hashCode() ^
    v4.hashCode(); }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Tuple4)) return false;
    Tuple4 s = (Tuple4)o;
    return this.v1.equals(s.v1) &&
           this.v2.equals(s.v2) &&
           this.v3.equals(s.v3) &&
           this.v4.equals(s.v4);
  }
}
