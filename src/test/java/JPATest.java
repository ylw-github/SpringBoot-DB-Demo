import com.ylw.springboot.App;
import com.ylw.springboot.bean.JPAUser;
import com.ylw.springboot.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class JPATest {

    @Autowired
    UserDao userDao;

    @Test
    public void test() {
        List<JPAUser> users = userDao.findAll();
        if (users == null || users.size() == 0) {
            return;
        }
        for (JPAUser user : users) {
            System.out.println(user.toString());
        }
    }
}
