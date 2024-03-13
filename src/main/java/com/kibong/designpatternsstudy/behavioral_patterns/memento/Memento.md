# 메멘토(Memento) 패턴
- 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법
- 객체 상태를 외부에 저장했다가 해당 상태로 다시 복구할 수 있다.

## Memento Pattern을 사용하는 이유
- 클라이언트가 객체의 상태 변경을 관리하지 않고, 객체 자체가 상태를 관리하도록 하기 위해 사용한다.

## Memento Pattern Structure
![Memento.png](Memento.png)
- Originator : 상태를 저장하고 복구하는 객체
- Memento : Originator의 추상화

## Memento Pattern 적용
- [ClientCareTaker](simple%2FClient.java)
- [Originator](simple%2FGame.java)
- [Memento](simple%2FGameSave.java)

