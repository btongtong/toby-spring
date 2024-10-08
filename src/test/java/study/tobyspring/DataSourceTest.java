package study.tobyspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TobySpringApplication.class)
@TestPropertySource("classpath:/application.properties")    // application.properties를 등록하는 것은 springboot의 기본 동작 방식이 아니고, 후처리를 통한 것이니까 따로 읽어오기
    public class DataSourceTest {
        @Autowired
        DataSource dataSource;

        @Test
        void connect() throws SQLException {
            Connection connection = dataSource.getConnection();
            connection.close();
    }
}
