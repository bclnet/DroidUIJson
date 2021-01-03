package com.DroidUI;

public class Tuple2<T1, T2> {
  public final T1 v1;
  public final T2 v2;

  public Tuple2(T1 v1, T2 v2) {
    this.v1 = v1;
    this.v2 = v2;
  }

  @Override
  public int hashCode() { return v1.hashCode() ^
    v2.hashCode(); }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Tuple2)) return false;
    Tuple2 s = (Tuple2)o;
    return this.v1.equals(s.v1) &&
           this.v2.equals(s.v2);
  }
}
