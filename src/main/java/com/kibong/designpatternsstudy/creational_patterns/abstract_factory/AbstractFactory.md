# 추상 팩토리(Abstract Factory) 패턴
여러개 관련 있는 여러 인스턴스를 만들어 주는 팩토리를 추상화된 형태로 정의하는 형태  
Factory Method 패턴과 비슷하지만 Factory를 사용하는 쪽을 클라이언트 쪽이면 Abstract Factory으로 볼 수 있다.

## 추상 팩토리 목적
팩토리에서 인스턴스를 만들어서 쓰는 코드를 인터페이스 기반으로 코딩할 수 있게끔 도와주는 패턴

## [추상 팩토리 만들기](simple%2FWhiteShipFactory.java)
구체적인 클래스 타입에 의존하지 않는 코드를 만드는 방법  
어떤 팩토리를 넣어 주느냐에 따라 어떤 제품군이 달라지게 되고 코드의 수정이 일어나지 않아도 되기에 코드가 개선되게 된다.

단일 책임 원칙 SRP(Single Responsibility Principle)를 위반하는 것처럼 보이기도하고 어느정도 위반하기도 하지만  
OCP(Open Closed Principle)위반하지 않으면서 제품군을 확장할 수 있는 장점이 있다.
