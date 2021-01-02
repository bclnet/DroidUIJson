package com.DroidUI;

public class EmptyView implements View {
    public EmptyView() { }

    public View getBody() {
        System.exit(0);
        return null;
    }

    public static _ViewOutputs _makeView(_GraphValue<EmptyView> view, _ViewInputs inputs) {
        System.exit(0);
        return null;
    }

    public static _ViewListOutputs _makeViewList(_GraphValue<EmptyView> view, _ViewListInputs inputs) {
        System.exit(0);
        return null;
    }
}
