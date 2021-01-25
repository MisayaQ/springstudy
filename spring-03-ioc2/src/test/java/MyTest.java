import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("12312312312");
        User user2 = (User) context.getBean("user");
        System.out.println(user==user2);
        user.show();

    }
}
