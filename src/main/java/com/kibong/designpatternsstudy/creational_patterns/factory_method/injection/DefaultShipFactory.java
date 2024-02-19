package com.kibong.designpatternsstudy.creational_patterns.factory_method.injection;

public abstract class DefaultShipFactory implements InjectionShipFactory{

    @Override
    public void sendEmailTo(String email, InjectionShip injectionShip) {
        System.out.println(injectionShip.getName() + " 다 만들었습니다.");
    }
}
