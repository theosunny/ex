import com.spring.tx.OrderService;
import org.aspectj.weaver.ast.Or;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/17 0017.
 */
public class OrderTest {
    private OrderService orderService ;
    @Before
    public void before1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-jdbc-annotation.xml");
         orderService = (OrderService)app.getBean("orderService");
    }
    @Test
    public  void  testAccount(){
        orderService.accountMoney();
    }
    @After
    public void afterAccount(){
        System.out.println("转账成功");
    }
}
