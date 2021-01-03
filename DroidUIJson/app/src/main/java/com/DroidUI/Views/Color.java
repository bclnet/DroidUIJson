package com.DroidUI;

public class Color implements View {
    public static class AnyColorBox {
        @Override
        public int hashCode() { return this.hashCode(); }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof AnyColorBox)) return false;
            AnyColorBox s = (AnyColorBox)o;
            return this.equals(s);
        }
    }

    public enum SystemColor {
        clear,
        black,
        white,
        gray,
        red,
        green,
        blue,
        orange,
        yellow,
        pink,
        purple,
        primary,
        secondary,
        accentColor,
    }

    public static class SystemColorType extends AnyColorBox {
        public SystemColor value;
    
        SystemColorType(SystemColor value) {
            this.value = value;
        }
           
        @Override
        public String toString() { 
            return value.toString(); 
        }
    }

    public static class DisplayP3 extends AnyColorBox {
        public double red;
        public double green;
        public double blue;
        public double opacity;
    
        DisplayP3(double red, double green, double blue, double opacity) {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.opacity = opacity;
        }
    }

    public static class _Resolved extends AnyColorBox {
        public double linearRed;
        public double linearGreen;
        public double linearBlue;
        public double opacity;
    
        _Resolved(double linearRed, double linearGreen, double linearBlue, double opacity) {
            this.linearRed = linearRed;
            this.linearGreen = linearGreen;
            this.linearBlue = linearBlue;
            this.opacity = opacity;
        }
    
        @Override
        public String toString() { 
            return String.format("#%02X%02X%02X%02X", linearRed, linearGreen, linearBlue, opacity); 
        }
    }

    public enum RGBColorSpace {
        sRGB,
        sRGBLinear,
        displayP3,
    }

    public AnyColorBox provider;
    
    public Color(double red, double green, double blue) { this(RGBColorSpace.sRGB, red, green, blue, 1); }
    public Color(double red, double green, double blue, double opacity) { this(RGBColorSpace.sRGB, red, green, blue, opacity); }
    public Color(RGBColorSpace colorSpace, double red, double green, double blue) { this(colorSpace, red, green, blue, 1); }
    public Color(RGBColorSpace colorSpace, double red, double green, double blue, double opacity) {
        switch (colorSpace) {
        case sRGB: this.provider = new _Resolved(red, green, blue, opacity); break;
        case sRGBLinear: this.provider = new _Resolved(red, green, blue, opacity); break;
        case displayP3: this.provider = new DisplayP3(red, green, blue, opacity); break;
        }
    }
    public Color(double white) { this(RGBColorSpace.sRGB, white, 1); }
    public Color(double white, double opacity) { this(RGBColorSpace.sRGB, white, opacity); }
    public Color(RGBColorSpace colorSpace, double white) { this(colorSpace, white, 1); }
    public Color(RGBColorSpace colorSpace, double white, double opacity) {
        switch (colorSpace) {
        case sRGB: this.provider = new _Resolved(white, white, white, opacity); break;
        case sRGBLinear: this.provider = new _Resolved(white, white, white, opacity); break;
        case displayP3: this.provider = new DisplayP3(white, white, white, opacity); break;
        }
    }
    /*
    public Color(double hue, double saturation, double brightness) { this(hue, saturation, brightness, 1); }
    public Color(double hue, double saturation, double brightness, double opacity) {
        double[] rgb = hsbToRGB(hue, saturation, brightness);
        this.provider = _Resolved(rgb.v1, rgb.v2, rgb.v3, opacity);
    }
    */
    private Color(SystemColor systemColor) {
        this.provider = new SystemColorType(systemColor);
    }
    
	public View getBody() {
		System.exit(0);
		return null;
	}
    
    @Override
    public String toString() { 
        return provider.getClass().getName();
    }

    public static Color clear = new Color(SystemColor.clear);
    public static Color black = new Color(SystemColor.black);
    public static Color white = new Color(SystemColor.white);
    public static Color gray = new Color(SystemColor.gray);
    public static Color red = new Color(SystemColor.red);
    public static Color green = new Color(SystemColor.green);
    public static Color blue = new Color(SystemColor.blue);
    public static Color orange = new Color(SystemColor.orange);
    public static Color yellow = new Color(SystemColor.yellow);
    public static Color pink = new Color(SystemColor.pink);
    public static Color purple = new Color(SystemColor.purple);
    public static Color primary = new Color(SystemColor.primary);
    public static Color secondary = new Color(SystemColor.secondary);
    public static Color accentColor = new Color(SystemColor.accentColor);

    /*
    public View foregroundColor(Color color) {
        return environment(\.foregroundColor, color)
    }
    */

    private static double[] hsbToRGB(double hue, double saturation, double brightness) {
        double i = Math.floor(hue * 6);
        double f = hue * 6 - i;
        double p = brightness * (1 - saturation);
        double q = brightness * (1 - f * saturation);
        double t = brightness * (1 - (1 - f) * saturation);
        switch ((int)(i % 6)) {
        case 0: return new double[] { brightness, t, p };
        case 1: return new double[] { q, brightness, p };
        case 2: return new double[] { p, brightness, t };
        case 3: return new double[] { p, q, brightness };
        case 4: return new double[] { t, p, brightness };
        case 5: return new double[] { brightness, p, q };
        default: return null;
        }
    }
}
