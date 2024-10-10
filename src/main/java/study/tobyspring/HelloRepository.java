package study.tobyspring;

public interface HelloRepository {  // data access 하는 오브젝트 (==dao)
    Hello findHello(String name);

    void increaseCount(String name);    // 비즈니스 로직은 일반적으로 서비스나 도메인 빈에 넣는 것이 좋음

    default int countOf(String name) {  // default 키워드로 인터페이스에서 메서드 구현부 작성 가능
        Hello hello = findHello(name);
        return hello == null ? 0 : hello.getCount();
    }
}
