## 퍼사드 패턴
복잡ㄹ한 서브 시스템 의존성을 최소화하는 방법.

+ 클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할 수 있다.
+ 사전적 의미로 외관이라는 의미를 가지고 있다.
+ 디테일한 부분은 모두 와관 안으로 숨긴다라는 의미를 가지고 있다.

---
OOP의 주요한 철학
- 의존성이 타이틀할수록 해당 코드를 변경하기 어렵고 이유가 많아지고 테스트도 어렵고 여러모로 힘들어진다

---
장점
- 서브 시스템에 대한 의존성을 한곳으로 모을 수 있다.
- 퍼사드를 통해 코드가 읽기 쉬워진다.(일종의 리펙토링의 역할)

단점 
- 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다.