package com.DroidUI;

public class ZStack<Content extends View> implements View {
    public _VariadicView_Tree<_ZStackLayout, Content> _tree;
    
    public ZStack(Func<Content> content) { this(Alignment.center, content); }
    public ZStack(Alignment alignment, Func<Content> content) {
        _tree = new _VariadicView_Tree(
            new _ZStackLayout(alignment), content.v());
    }

    public View getBody() {
        System.exit(0);
        return null;
    }

    public static _ViewOutputs _makeView(_GraphValue<ZStack> view, _ViewInputs inputs) {
        System.exit(0);
        return null;
    }
}
