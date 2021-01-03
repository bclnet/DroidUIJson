package com.DroidUI;

public class Binding<Value> {
	public Transaction transaction;
	AnyLocation<Value> location;
	Value _value;

	public Binding(Func<Value> get, Action1<Value> set) {
		this.transaction = new Transaction();
		this.location = new AnyLocation(get.v());
		this._value = get.v();
		set.v(_value);
	}

	public Binding(Func<Value> get, Action2<Value, Transaction> set) {
		this.transaction = new Transaction();
		this.location = new AnyLocation(get.v());
		this._value = get.v();
		set.v(_value, this.transaction);
	}

	//where Value == V?
	public <V> Binding(Binding<V> base) {
		System.exit(0);
	}

	//where Value == AnyHashable, V : Hashable
	//public <V> Binding(Binding<V> base) {
	//    System.exit(0);
	//}

	//public Binding(Binding<Value> base) {
	//    System.exit(0);
	//}

	public static <V> Binding constant(V value) {
		System.exit(0);
		return null;
	}

	public Value getWrappedValue() {
		return location._value;
	}

	public void setWrappedValue(Value newValue) {
		location._value = newValue;
	}

	public Binding<Value> getProjectedValue() {
		return this;
	}

	public Binding<Value> transaction(Transaction transaction) {
		System.exit(0);
		return null;
	}

	//public subscript<Subject>(dynamicMember keyPath: WritableKeyPath<Value, Subject>) -> Binding<Subject> {
	//    System.exit(0);
	//    return null;
	//}

	//public Binding<Value> animation(_ animation: Animation? = .default) {}
	//public static void _makeProperty<V>(in buffer: inout _DynamicPropertyBuffer, container: _GraphValue<V>, fieldOffset: Int, inputs: inout _GraphInputs) {}
}