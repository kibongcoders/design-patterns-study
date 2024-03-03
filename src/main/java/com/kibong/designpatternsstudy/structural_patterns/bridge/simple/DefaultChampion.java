package com.kibong.designpatternsstudy.structural_patterns.bridge.simple;

import com.kibong.designpatternsstudy.structural_patterns.bridge.before.Champion;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultChampion implements Champion {

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        log.info("{} {} move", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        log.info("{} {} Q", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        log.info("{} {} W", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        log.info("{} {} E", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        log.info("{} {} R", skin.getName(), this.name);
    }

    @Override
    public String getName() {
        return null;
    }
}
