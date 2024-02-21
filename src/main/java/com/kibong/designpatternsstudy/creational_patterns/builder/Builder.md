# 빌더(Builder) 패턴
인스턴스를 만들 때 다양한 구성으로 만들어질 수 있는데 다양한 구성으로 만들어 질 수 있게끔하는 패턴이다.

빌더를 사용하면 복잡한 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.

빌더는 디렉터를 추가적으로 사용할 수 있는데
직접 클라이언트와 콘크리트 빌더가 만나는 것이 아닌 반복되는 빌더를 디렉터에 숨겨 디렉터를 통해 가져올 수도 있다. 
![BuilderPattern.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2FBuilderPattern.png)