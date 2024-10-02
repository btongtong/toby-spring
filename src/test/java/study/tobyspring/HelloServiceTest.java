package study.tobyspring;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class HelloServiceTest {
    @Test
    public void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

        String ret = helloService.sayHello("Test");

        assertThat(ret).isEqualTo("Hello Test");
    }
}
