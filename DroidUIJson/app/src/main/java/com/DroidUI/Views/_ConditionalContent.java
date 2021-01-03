package com.DroidUI;

public class _ConditionalContent<TrueContent extends View, FalseContent extends View> implements View {
	public Storage _storage;

	_ConditionalContent() { this(null); }
	_ConditionalContent(Storage storage) {
		_storage = storage;
	}

	enum StorageType
	{
		trueContent,
		falseContent,
	}

	public class Storage {
		public StorageType value;
		public TrueContent trueContent;
		public FalseContent falseContent;

		Storage(StorageType value) {
			this.value = value;
		}
	}

	void setTrueContent(TrueContent trueContent) {
		_storage = new Storage(StorageType.trueContent);
		_storage.trueContent = trueContent;
	}

	void setFalseContent(FalseContent falseContent) {
		_storage = new Storage(StorageType.falseContent);
		_storage.falseContent = falseContent;
	}

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<_ConditionalContent> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}

	public static _ViewListOutputs _makeViewList(_GraphValue<_ConditionalContent> view, _ViewListInputs inputs) {
		System.exit(0);
		return null;
	}
}
