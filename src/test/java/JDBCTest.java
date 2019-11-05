import com.ylw.springboot.App;
import com.ylw.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class JDBCTest {

    @Autowired
    UserService userService;

    @Test
    public void testJDBCTemplate() {
        userService.createUser(UUID.randomUUID().toString(),"Dumas", 18);
    }
}
