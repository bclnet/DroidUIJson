package com.DroidUI;

public class ViewBuilder {
    public static EmptyView buildBlock() {
        return new EmptyView();
    }
    
    public static <Content extends View> Content buildBlock(Content content) {
        return content;
    }
    
    public static <Content extends View> Content buildIf(Content content) {
        return content;
    }
    
    public static <TrueContent extends View, FalseContent extends View> _ConditionalContent<TrueContent, FalseContent> buildEitherTrue(TrueContent first) {
        _ConditionalContent content = new _ConditionalContent<TrueContent, FalseContent>();
        content.setTrueContent(first);
        return content;
    }

    public static <TrueContent extends View, FalseContent extends View> _ConditionalContent<TrueContent, FalseContent> buildEitherFalse(FalseContent second) {
        _ConditionalContent content = new _ConditionalContent<TrueContent, FalseContent>();
        content.setFalseContent(second);
        return content;
    }

    public static <C0 extends View, C1 extends View> TupleView<Tuple2<C0, C1>> buildBlock(C0 c0, C1 c1) {
        return new TupleView(new Tuple2(c0, c1));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View> TupleView<Tuple3<C0, C1, C2>> buildBlock(C0 c0, C1 c1, C2 c2) {
        return new TupleView(new Tuple3(c0, c1, c2));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View> TupleView<Tuple4<C0, C1, C2, C3>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3) {
        return new TupleView(new Tuple4(c0, c1, c2, c3));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View, C4 extends View> TupleView<Tuple5<C0, C1, C2, C3, C4>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3, C4 c4) {
        return new TupleView(new Tuple5(c0, c1, c2, c3, c4));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View, C4 extends View, C5 extends View> TupleView<Tuple6<C0, C1, C2, C3, C4, C5>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3, C4 c4, C5 c5) {
        return new TupleView(new Tuple6(c0, c1, c2, c3, c4, c5));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View, C4 extends View, C5 extends View, C6 extends View> TupleView<Tuple7<C0, C1, C2, C3, C4, C5, C6>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3, C4 c4, C5 c5, C6 c6) {
        return new TupleView(new Tuple7(c0, c1, c2, c3, c4, c5, c6));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View, C4 extends View, C5 extends View, C6 extends View, C7 extends View> TupleView<Tuple8<C0, C1, C2, C3, C4, C5, C6, C7>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3, C4 c4, C5 c5, C6 c6, C7 c7) {
        return new TupleView(new Tuple8(c0, c1, c2, c3, c4, c5, c6, c7));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View, C4 extends View, C5 extends View, C6 extends View, C7 extends View, C8 extends View> TupleView<Tuple9<C0, C1, C2, C3, C4, C5, C6, C7, C8>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3, C4 c4, C5 c5, C6 c6, C7 c7, C8 c8) {
        return new TupleView(new Tuple9(c0, c1, c2, c3, c4, c5, c6, c7, c8));
    }
    
    public static <C0 extends View, C1 extends View, C2 extends View, C3 extends View, C4 extends View, C5 extends View, C6 extends View, C7 extends View, C8 extends View, C9 extends View> TupleView<TupleA<C0, C1, C2, C3, C4, C5, C6, C7, C8, C9>> buildBlock(C0 c0, C1 c1, C2 c2, C3 c3, C4 c4, C5 c5, C6 c6, C7 c7, C8 c8, C9 c9) {
        return new TupleView(new TupleA(c0, c1, c2, c3, c4, c5, c6, c7, c8, c9));
    }
}
