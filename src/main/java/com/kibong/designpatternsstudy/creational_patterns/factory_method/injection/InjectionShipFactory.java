package com.kibong.designpatternsstudy.creational_patterns.factory_method.injection;

public interface InjectionShipFactory {
    default InjectionShip orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        InjectionShip injectionShip = createShip();
        sendEmailTo(email, injectionShip);
        return injectionShip;
    }

    InjectionShip createShip();

    void sendEmailTo(String email, InjectionShip injectionShip);

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
