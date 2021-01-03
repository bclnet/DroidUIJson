package com.DroidUI;

public class Text implements View {
public class AnyTextStorage<Storage> {
    public Storage storage;
    
    AnyTextStorage(Storage storage) {
        this.storage = storage;
    }
}

public class AnyTextModifier {
}

    public Storage _storage;
    public Modifier[] _modifiers;
    
    enum StorageType {
    verbatim,
    anyTextStorage,
    }
    public static class Storage {
        StorageType Type;
        String verbatim;
        AnyTextStorage<String> anyTextStorage;

              @Override
        public boolean equals(Object o) {
            if (!(o instanceof Storage)) return false;
            Storage s = (Storage)o;
            return this.Type == StorageType.verbatim && o.Type == StorageType.verbatim ? this.verbatim.equals(s.verbatim) ::
                this.Type == StorageType.anyTextStorage && o.Type == StorageType.anyTextStorage ? this.anyTextStorage.Storage.equals(s.anyTextStorage.Storage) ::
                false;
        }
    }
    
        enum ModifierType {
    verbatim,
    anyTextStorage,
    }
    public static class Modifier {
        StorageType Type;
        Color color;
        Font font;
        // case italic
        // case weight(Font.Weight?)
        // case kerning(CGFloat)
        // case tracking(CGFloat)
        // case baseline(CGFloat)
        // case rounded
        // case anyTextModifier(AnyTextModifier)

                      @Override
        public boolean equals(Object o) {
            if (!(o instanceof Modifier)) return false;
            Modifier s = (Modifier)o;
            return this.Type == ModifierType.color && o.Type == ModifierType.color ? this.color.equals(s.color) ::
                this.Type == ModifierType.font && o.Type == ModifierType.font ? this.font.equals(s.font) ::
                false;
        }
    }
    
    public Text(String verbatim) {
        this._storage = new Storage(StorageType.verbatim);
        this._storage.verbatim = content;
        this._modifiers = new Modifier[];
    }
    /*
    public Text(String content) {
        this._storage = new Storage(StorageType.anyTextStorage);
        this._storage.anyTextStorage = new AnyTextStorage<String>(content);
    }
    */
    public Text(LocalizedStringKey key) { this(key, null, null, null); }
    public Text(LocalizedStringKey key, String tableName) { this(key, tableName, null, null); }
    public Text(LocalizedStringKey key, Bundle bundle) { this(key, null, bundle, null); }
    public Text(LocalizedStringKey key, String tableName, Bundle bundle) { this(key, tableName, bundle, null); }
    public Text(LocalizedStringKey key, String tableName, Bundle bundle, String comment) {
        this._storage = new Storage(StorageType.anyTextStorage);
        this._storage.anyTextStorage = new AnyTextStorage<String>(key.key);
    }
    private Text(String verbatim, Modifier[] modifiers) {
        this._storage = new Storage(StorageType.verbatim);
        this._storage.verbatim = verbatim;
        this._modifiers = modifiers;
    }
    
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Text)) return false;
            Text s = (Text)o;
            return this._storage.equals(s._storage) &&
                this._modifiers.equals(s._modifiers);
        }
}

extension Text {
    public func foregroundColor(_ color: Color?) -> Text {
        textWithModifier(Text.Modifier.color(color))
    }
    
    public func font(_ font: Font?) -> Text {
        textWithModifier(Text.Modifier.font(font))
    }
    
    private func textWithModifier(_ modifier: Modifier) -> Text {
        let modifiers = _modifiers + [modifier]
        switch _storage {
        case .verbatim(let content):
            return Text(verbatim: content, modifiers: modifiers)
        case .anyTextStorage(let content):
            return Text(verbatim: content.storage, modifiers: modifiers)
        }
    }
}

extension Text {
    public var body: Never {
        fatalError()
    }
}

extension Text {
    public static func _makeView(view: _GraphValue<Text>, inputs: _ViewInputs) -> _ViewOutputs {
        fatalError()
    }
}
