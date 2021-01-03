package com.DroidUI;

public class Picker<Label extends View, SelectionValue, Content extends View> implements View {
	Binding<SelectionValue> selection;
	Label label;
	Content content;

	public Picker(Binding<SelectionValue> selection, Label label, Func<Content> content) {
		this.selection = selection;
		this.label = label;
		this.content = content.v();
	}

	/*
	//where Label == Text {
	public Picker(LocalizedStringKey titleKey, Binding<SelectionValue> selection, Func<Content> content) {
		this.selection = selection;
		this.label = new Text(titleKey);
		this.content = content.v();
	}

	public Picker(String title, Binding<SelectionValue> selection, Func<Content> content) {
		this.selection = selection;
		this.label = new Text(title);
		this.content = content.v();
	}
	*/

	public View getBody() {
		return null;
		/*
        return new HStack(() -> ViewBuilder.buildBlock(
			label,
			content));
		*/
    }
}
