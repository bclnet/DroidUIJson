package com.DroidUI;

public class Font {
	public static class AnyFontBox {
		@Override
		public int hashCode() {
			return this.hashCode();
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof AnyFontBox))
				return false;
			AnyFontBox s = (AnyFontBox) o;
			return this.equals(s);
		}
	}

	public static class SystemProvider extends AnyFontBox {
		public float size;
		public Weight weight;
		public Design design;

		SystemProvider(float size, Weight weight, Design design) {
			this.size = size;
			this.weight = weight;
			this.design = design;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof SystemProvider))
				return false;
			SystemProvider s = (SystemProvider) o;
			return this.size == s.size && this.weight.equals(s.weight) && this.design.equals(s.design);
		}
	}

	public static class TextStyleProvider extends AnyFontBox {
		public TextStyle style;
		public Design design;

		TextStyleProvider(TextStyle style, Design design) {
			this.style = style;
			this.design = design;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof TextStyleProvider))
				return false;
			TextStyleProvider s = (TextStyleProvider) o;
			return this.style.equals(s.style) && this.design.equals(s.design);
		}
	}

	public AnyFontBox provider;

	Font() {
	}

	Font(AnyFontBox provider) {
		this.provider = provider;
	}

	public static Font system(TextStyle style) {
		return system(style, Design.default_);
	}

	public static Font system(TextStyle style, Design design) {
		AnyFontBox provider = new TextStyleProvider(style, design);
		return new Font(provider);
	}

	public static Font system(float size) {
		return system(size, Weight.regular, Design.default_);
	}

	public static Font system(float size, Weight weight) {
		return system(size, weight, Design.default_);
	}

	public static Font system(float size, Weight weight, Design design) {
		AnyFontBox provider = new SystemProvider(size, weight, design);
		return new Font(provider);
	}

	public static Font custom(String name, float size) {
		System.exit(0);
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Font))
			return false;
		Font s = (Font) o;
		return this.provider.equals(s.provider);
	}

	public static class Weight {
		public float value;

		private Weight(float value) {
			this.value = value;
		}

		public static Weight ultraLight = new Weight(100);
		public static Weight thin = new Weight(200);
		public static Weight light = new Weight(300);
		public static Weight regular = new Weight(400);
		public static Weight medium = new Weight(500);
		public static Weight semibold = new Weight(600);
		public static Weight bold = new Weight(700);
		public static Weight heavy = new Weight(800);
		public static Weight black = new Weight(900);
	}

	public static Font largeTitle = system(TextStyle.largeTitle);
	public static Font title = system(TextStyle.title);
	public static Font headline = system(TextStyle.headline);
	public static Font subheadline = system(TextStyle.subheadline);
	public static Font body = system(TextStyle.body);
	public static Font callout = system(TextStyle.callout);
	public static Font footnote = system(TextStyle.footnote);
	public static Font caption = system(TextStyle.caption);

	public enum TextStyle

	{
        largeTitle,
        title,
        headline,
        subheadline,
        body,
        callout,
        footnote,
        caption,
    }

	public enum Design

	{
        default_,
        serif,
        rounded,
        monospaced,
    }
}
