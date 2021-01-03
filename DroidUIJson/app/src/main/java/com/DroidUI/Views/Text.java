package com.DroidUI;

import java.util.Arrays;
import android.os.Bundle;

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

	enum StorageType

	{
		verbatim,
		anyTextStorage,
    }

	public static class Storage {
		StorageType type;
		String verbatim;
		AnyTextStorage<String> anyTextStorage;

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Storage))
				return false;
			Storage s = (Storage) o;
			return this.type == StorageType.verbatim && s.type == StorageType.verbatim
					? this.verbatim.equals(s.verbatim)
					: this.type == StorageType.anyTextStorage && s.type == StorageType.anyTextStorage
							? this.anyTextStorage.storage.equals(s.anyTextStorage.storage) : false;
		}
	}

	enum ModifierType

	{
		color,
		font,
    }

	public static class Modifier {
		ModifierType type;
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
            return this.type == ModifierType.color && s.type == ModifierType.color? this.color.equals(s.color) :
                this.type == ModifierType.font && s.type == ModifierType.font ? this.font.equals(s.font) :
                false;
        }
	}

	public Text(String verbatim) {
        this._storage = new Storage(StorageType.verbatim);
        this._storage.verbatim = verbatim;
        this._modifiers = new Modifier[0];
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

	public Text foregroundColor(Color color) {
        return textWithModifier(Modifier.color(color));
    }

	public Text font(Font font) {
        return textWithModifier(Modifier.font(font));
    }

	private Text textWithModifier(Modifier modifier) {
		Modifier[] modifiers = Arrays.copyOf(_modifiers, _modifiers.length + 1);
		modifiers[modifiers.length - 1] = modifier;
        switch (_storage.type) {
        case verbatim: return new Text(_storage.verbatim, modifiers);
        case anyTextStorage: return new Text(_storage.anyTextStorage, modifiers);
        }
    }

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<Text> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
    }
}
