# 싱글톤(Singleton) 패턴
인스턴스를 오직 한개만 제공하는 클래스

## 싱글톤 패턴이 필요한 이유
여러가지의 인스턴스가 아닌 오직 하나만 존재하는 경우 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.
A라는 설정화면에서 A라는 버튼을 눌렀을 때

## 간단한 싱글톤 패턴을 구현하는 방법 ([Settings1.java](Settings1.java))
싱글톤 패턴을 구현해야할 때에는 New를 사용해서 인스턴스를 만들면 안된다.  
New를 사용해서 인스턴스를 생성한다면 그것은 싱글톤 패턴을 만족시키는 것이 아니다.

그래서 3가지 방법으로 싱글톤 패턴을 할 수 있다.
1. 인스턴스를 private static하게 만들기
2. getInstance()를 호출해서 인스턴스를 생성할 수 있도록 만들기
3. getInstance()에는 생성자 한적이 없을 경우에만 new 인스턴스를 할 수 있도록 만들기

### 질문하기
1. 생성자를 private 만든 이유?  
   -> 아무데서나 생성자를 생성하지 못하도록 하기 위해서.
2. getInstance() 메소드를 static으로 선언한 이유?  
   -> 글로벌하게 엑세스 하기 위해서 
3. getInstance()가 멀티쓰레드 환경에서 안전하지 않은 이유?  
   -> 서로 다른 쓰레드들이 인스턴스가 생성되었는지 확인을 하다보면,   
   하나의 쓰레드에서 이미 생성이 됐음에도 다른 쓰레드가 확인할 때에는 생성이 되지 않았을 수 있기에 싱글톤 패턴이 적용되었다고 할 수 없다.

## 멀티쓰레드 환경에서 안전한 싱글톤 패턴 구현하는 방법

### [가장 간단한 방법](Settings2.java)
synchronized 키워드 사용하기

이 방법은 synchronized를 사용해서 하나의 쓰레드만 이 동작을 할 수 있도록 동작하기에 하나의 인스턴스를 보장할 수 있다.
#### 문제점
하지만 이 방법은 동기화 하는 과정에서 성능 불이익이 발생할 수 있는데 그 이유는  
키가 되는 락을 잡아서 락을 잡고 있는 쓰래드만 이 동작을 할 수 있기에 성능적으로 부하가 생길 수 있다.

###  [간단하면서도 약간의 성능을 신경쓰는 방법](Settings2.java)
이른 초기화 : 객체를 final로 변경하기 

객체를 만드는데 꼭 나중에 만들지 않거나 만드는 비용이 비싸지 않다면 해당 방법을 사용가능하다.

#### 문제점
만들어 놨는데 쓰지 않는다면, 이 인스턴스를 만드는 과정이 길고 오래 걸리고 메모리를 많이 차지 않는다면
어플리케이션을 로딩할 대 굉장히 많은 리소스를 잡아먹게 된다.

### [나중에 생성하면서도 Synchronized Block 비용을 줄이는 방법](Settings3.java)
Double-Checked Locking : synchronized 사용하기 전에 인스턴스를 검사하는 방법

해당 방법은 이미 인스턴스가 존재하기에 synchronized를 lock을 하지 않아도 인스턴스를 하나만 유지 할 수 있고
동시에 접근 할 때 synchronized lock을 이용하기에 성능이 더 좋아진다.

#### 문제점
조금 복잡하다.

## [나중에 생성하면도 Synchronized Block하지 않는 방법](Settings4.java)
static inner 클래스 : Double-Checked Locking 하지 않으면서도 해결하는 방법

복잡하게 사용하지 않고 하나의 인스턴스만 생성 가능

### [Enum을 사용하는 방법](Settings5.java)

Enum을 사용하여 간단하게 싱글톤 패턴을 만들 수 있는데  
Enum 자체에서 synchronized하게 생성되므로 Thread Safe하게 싱글톤 패턴을 사용가능하다.

## 자바 및 스프링에서 사용하는 싱글톤 패턴
- 자바 어플리케이션 실행 시(Runtime)
- 스프링 빈 스코프 중 하나로 싱글톤 스코프 사용 가능
- Object, Service, Repository 할 때도 사용 가능
- 다른 디자인 패턴 구현체의 일부로 쓰이기도 함.





