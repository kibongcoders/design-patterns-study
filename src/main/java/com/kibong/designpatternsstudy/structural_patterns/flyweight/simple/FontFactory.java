package com.kibong.designpatternsstudy.structural_patterns.flyweight.simple;

import java.util.HashMap;

public class FontFactory {

    private HashMap<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            Font newFont = new Font(font.split(":")[0], Integer.parseInt(font.split(":")[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
