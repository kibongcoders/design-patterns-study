package com.kibong.designpatternsstudy.creational_patterns.factory_method.simple;

public interface ShipFactorySimple {
    default ShipSimple orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        ShipSimple shipSimple = createShip();
        sendEmailTo(email, shipSimple);
        return shipSimple;
    }

    ShipSimple createShip();

    private void sendEmailTo(String email, ShipSimple shipSimple) {
        System.out.println(shipSimple.getName() + " 다 만들었습니다.");
    }

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
