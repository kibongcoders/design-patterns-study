# 방문자(Visitor) 패턴
- 기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법
- 더블 디스패치(Double Dispatch)를 활용할 수 있다.

## Visitor Pattern을 적용하는 경우
- SRP(Single Responsibility Principle)을 준수하면서 새로운 기능을 추가하고 싶은 경우
- 다른 곳에서도 사용될 것 같은 경우

## Visitor Pattern Structure
![Visitor.png](Visitor.png)
- Double Dispatch : 구체적인 메소드를 찾아서 배치하는 과정

## Visitor Pattern 적용
- [Element](simple%2FShape.java)
- [ElementA](simple%2FPhone.java)
- [ElementB](simple%2FWatch.java)
- [Visitor](simple%2FDevice.java)
- [ConcreteVisitorA](simple%2FCircle.java)
- [ConcreteVisitorB](simple%2FRectangle.java)
- [ConcreteVisitorC](simple%2FTriangle.java)

## Visitor Pattern 장단점
### 장점
- 기존 코드를 변경하지 않고 새로운 코드를 추가할 수 있다.
- 추가 기능을 한 곳에 모아둘 수 있다.
### 단점
- 복잡하다
- 새로운 Element를 추가할 때 마다 Visitor 코드를 변경해야한다.

## Java, Spring에서의 사용되는 Visitor Pattern
- Java
  - FileVisitor
  - SimpleFileVisitor
  - AnnotationValueVisitor
  - ElementVisitor
- Spring
  - BeanDefinitionVisitor