import com.spring.annotation.Book;
import com.spring.annotation.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by Administrator on 2017/8/15 0015.
 */
public class JunitTest {

    @Test
    public   void test1(){
        ApplicationContext context =new  ClassPathXmlApplicationContext("spring-context.xml");
        UserService service =(UserService)context.getBean("userService1");
        service.say();
    }

    /**
     * 测试aop操作book类
     */
    @Test
    public   void testAop(){
        ApplicationContext context =new  ClassPathXmlApplicationContext("aop.xml");
        Book service =(Book)context.getBean("book");

        service.add("1");
    }
}
