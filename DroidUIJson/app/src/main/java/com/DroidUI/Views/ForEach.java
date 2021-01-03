package com.DroidUI;

import java.util.List;

public class ForEach<Data extends List, ID, Content extends View> {
	public Data data;
	public Func1<Object, Content> content;

	//where ID == Data.Element.ID, Content: View, Data.Element: Identifiable {
	public ForEach(Data data, Func1<Object, Content> content) {
		this.data = data;
		this.content = content;
	}

	public ForEach(Data data, KeyPath<Object, ID> id, Func1<Object, Content> content) {
		this.data = data;
		this.content = content;
	}
	//where Data == Range<Int>, ID == Int, Content: View {
	//public ForEach(Range<Int> data, Func1<Int, Content> content) {
	//    this.data = data;
	//    this.content = content;
	//}

	public View getBody() {
		System.exit(0);
		return null;
	}

	public static _ViewOutputs _makeView(_GraphValue<ForEach> view, _ViewInputs inputs) {
		System.exit(0);
		return null;
	}

	public static _ViewListOutputs _makeViewList(_GraphValue<ForEach> view, _ViewListInputs inputs) {
		System.exit(0);
		return null;
	}
}
