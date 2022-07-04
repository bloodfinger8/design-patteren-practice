## 전략 패턴
여러 알고리즘을 캡슐화하고 상호 교환 가능하게 만드는 패턴이다.

---

### 전략패턴의 장/단점

장점
- 새로운 전략을 추가하더라도 기존 코드는 변경하지 않는다.
- 상속 대신 위임을 사용 할 수 있다.
- 런타임에 전략을 변경 할 수 있다.

단점 
- 복잡도가 증가한다.
- 클라이언트 코드가 구체적인 전략을 알아야한다.
 