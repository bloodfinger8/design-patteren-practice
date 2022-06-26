## 플라이웨어 패턴

객체를 가볍게 만들 메모리 사용을 줄이는 패턴이다.

---
장점 
- 애플리케이션에서 사용하는 메모리를 줄일수있다.

단점
- 코드의 복잡성이 증가한다.


---

```java
Integer i1 = Integer.valueOf(10000);
Integer i2 = Integer.valueOf(10000);
System.out.println(i1 == i2); //true
//각각 인스턴스를 생성했지만 , 레퍼런스가 같다. 즉 자바에서 캐싱해서 사용중
```
