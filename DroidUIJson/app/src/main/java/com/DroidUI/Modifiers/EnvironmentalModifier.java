package com.DroidUI;

public interface EnvironmentalModifier extends ViewModifier {
    ViewModifier resolve(EnvironmentValues in);

    public static _ViewOutputs _makeView(_GraphValue<EnvironmentalModifier> modifier, _ViewInputs inputs, Func2<_Graph, _ViewInputs, _ViewOutputs> body) {
        System.exit(0);
        return null;
    }

    public static _ViewListOutputs _makeViewList(_GraphValue<EnvironmentalModifier> modifier, _ViewListInputs inputs, Func2<_Graph, _ViewListInputs, _ViewListOutputs> body) {
        System.exit(0);
        return null;
    }
}
