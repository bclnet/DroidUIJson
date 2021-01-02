package com.DroidUI;

public class _ConditionalContent<TrueContent extends View, FalseContent extends View> implements View {
    public enum Storage {
        trueContent(TrueContent)
        falseContent(FalseContent)
    }
    
    public Storage _storage; 
    
    _ConditionalContent(Storage storage) {
        _storage = storage;
    }

    public View getBody() {
        System.exit(0);
        return null;
    }

    public static _ViewOutputs _makeView(view: _GraphValue<_ConditionalContent> view, _ViewInputs inputs) {
        System.exit(0);
        return null;
    }
    public static _ViewListOutputs _makeViewList(view: _GraphValue<_ConditionalContent> view, _ViewListInputs inputs) {
        System.exit(0);
        return null;
    }
}
