package com.kibong.designpatternsstudy.structural_patterns.flyweight.simple;

public final class Font {
    final String fontFamily;
    final Integer fontSize;

    public Font(String fontFamily, Integer fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
