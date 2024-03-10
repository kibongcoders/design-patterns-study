# 책임 연쇄 패턴(Chain Of Responsibility) 패턴
요청을 보내는 쪽(sender)과 요청을 받는 쪽(receiver)을 분리하여 처리하는 패턴이다.

특정 책임이 있는 클래스들이 연결되어 처리하는 패턴이다.

## 책임 연쇄 패턴이 필요한 이유
- SRP를 지키다보면 클래스가 많아지고 구조가 복잡해질 때

## 책임 연쇄 패턴 구조
![ChainOfResponsibility.png](ChainOfResponsibility.png)