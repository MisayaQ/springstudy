import com.study.dao.UserDaoSqlserverImpl;
import com.study.service.UserService;
import com.study.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springstudy
 * @description:
 * @version: 1.0
 * @author: LiuJiaQi
 * @create: 2021-01-24 14:55
 **/
public class MyTest {

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlserverImpl());
//        userService.getUser();

        //获取ApplicationContext；拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
