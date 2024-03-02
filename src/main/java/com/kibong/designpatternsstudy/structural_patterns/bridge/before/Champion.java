package com.kibong.designpatternsstudy.structural_patterns.bridge.before;


import com.kibong.designpatternsstudy.structural_patterns.bridge.simple.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
