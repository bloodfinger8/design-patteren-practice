## 어탭터 패턴

특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환합니다.
인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와줍니다.



---

어답터 패턴은 여러 객체지향 원칙을 반영하고 있다.
1. 어댑티를 새로 바뀐 인터페이스로 감쌀 때는 객체 구성(composition)을 사용 할 수있어서 어댑티의
모든 서브클래스에 어 러변환시키는 여댑터를 쓸 수 있다는 장점이 있다.
2. 클라이언트를 특정 구현이 아닌 인터페이스에 연걸한다. 서로 다른 벡엔드 클래스로 변환시키는
여러 어댑터를 사용할 수도 있습니다.

---

장점
- 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어 재사용 할 수 있다.
- 기존 코드가 하던 일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여
고나리 할 수 있다.

단점
- 새 클래스가 생겨 복잡도가 증가할 수 있다. 경우에 따라서는 기존 코드가
해당 인터페이스를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다.
