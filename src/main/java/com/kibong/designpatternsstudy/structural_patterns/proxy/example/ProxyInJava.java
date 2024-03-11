package com.kibong.designpatternsstudy.structural_patterns.proxy.example;


import com.kibong.designpatternsstudy.structural_patterns.proxy.simple.DefaultGameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        //GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        //gameServiceProxy.startGame();
    }

//    private GameService getGameServiceProxy(GameService target) {
//        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
//                new Class[]{GameService.class}, (proxy, method, args) -> {
//                    System.out.println("O");
//                    method.invoke(target, args);
//                    System.out.println("ㅁ");
//                    return null;
//                });
//    }
}
