# 옵저버(Observer) 패턴
- 다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴.
- pub/sub 패턴을 구현할 수 도 있다.

## Observer Pattern Structure
![Observer.png](Observer.png)
- Subject : 상태가 변경되면 자신에게 등록되어 있는 모든 Observer를 순회하며 Observer가 제공하는 특정한 메소드를 호출
- Observer : Subject의 상태가 변경되었을 때 호출되는 메소드를 제공하는 인터페이스
- ConcreteObserver : Observer 인터페이스를 구현한 구체적인 클래스

## Observer Pattern 적용
- [Subject](simple%2FChatServer.java)
- [Observer](simple%2FSubscriber.java)
- [ConcreteObserver](simple%2FUser.java)

## Observer Pattern 장단점
### 장점
- Subject와 Observer를 느슨하게 결합할 수 있다.
  - Subject와 Observer는 서로 독립적으로 확장할 수 있다.
- Subject의 상태변경을 주기적으로 조회하지 않고 자동으로 감지할 수 있다.
- 런타임에 옵저버를 추가하거나 삭제할 수 있다.
### 단점
- 복잡도가 증가한다.
- 다수의 Oberserver 객체를 등록 이후 해지하지 않는 다면 메모리 누수가 발생할 수 있다.\

## Java와 Spring에서 Observer Pattern 사용 예
- Java
  - java.util.Observer
    - java.util.Observable
    - 사용 예(이벤트 리스너, GUI 프로그래밍)
  - PropertyChangeListener, PropertyChangeEvent
  - Flow API
  - SAX(Simple API for XML)
- Spring
  - ApplicationEvent, ApplicationListener

