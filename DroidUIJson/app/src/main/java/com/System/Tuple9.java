package com.DroidUI;

public class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> {
  public final T1 v1;
  public final T2 v2;
  public final T3 v3;
  public final T4 v4;
  public final T5 v5;
  public final T6 v6;
  public final T7 v7;
  public final T8 v8;
  public final T9 v9;

  public Tuple9(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
    this.v5 = v5;
    this.v6 = v6;
    this.v7 = v7;
    this.v8 = v8;
    this.v9 = v9;
  }

  @Override
  public int hashCode() { return v1.hashCode() ^
    v2.hashCode() ^
    v3.hashCode() ^
    v4.hashCode() ^
    v5.hashCode() ^
    v6.hashCode() ^
    v7.hashCode() ^
    v8.hashCode() ^
    v9.hashCode(); }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Tuple9)) return false;
    Tuple9 s = (Tuple9)o;
    return this.v1.equals(s.v1) &&
           this.v2.equals(s.v2) &&
           this.v3.equals(s.v3) &&
           this.v4.equals(s.v4) &&
           this.v5.equals(s.v5) &&
           this.v6.equals(s.v6) &&
           this.v7.equals(s.v7) &&
           this.v8.equals(s.v8) &&
           this.v9.equals(s.v9);
  }
}
