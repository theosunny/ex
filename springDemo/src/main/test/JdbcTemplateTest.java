import com.spring.jdbcTemplate.T_User;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/8/16 0016.
 * jdbcTemplate 的测试类
 */

public class JdbcTemplateTest {

    @Test
    public void testAdd(){
        //设置数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/kf");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("fanyy");
        dataSource.setPassword("fanyy");
        //创建JdbcTemplate，并且设置数据源
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "insert into t_user(username,password,sex) values (?,?,?)";
        //添加数据
       int record=  template.update(sql, "spring测试","spring","女");
      System.out.println("插入"+record+"行");
    }


    /**
     * 修改操作
     */
    @Test
    public void testUpdate(){
        //设置数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/kf");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("fanyy");
        dataSource.setPassword("fanyy");
        //创建JdbcTemplate，并且设置数据源
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "update t_user set username= ? where id= ?";
        //添加数据
        int record=  template.update(sql, "spring测试","3");
        System.out.println("修改"+record+"行");
    }
    /**
     * 删除操作
     */
    @Test
    public void testDelete(){
        //设置数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/kf");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("fanyy");
        dataSource.setPassword("fanyy");
        //创建JdbcTemplate，并且设置数据源
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "DELETE FROM  t_user  WHERE id= ?";
        //添加数据
        int record=  template.update(sql, "3");
        System.out.println("删除"+record+"行");
    }
    /**
     * 删除操作
     */
    @Test
    public void testquery(){
        //设置数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/kf");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("fanyy");
        dataSource.setPassword("fanyy");
        //创建JdbcTemplate，并且设置数据源
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM  t_user ";

        //得到返回的某一个值
        String countsql = "SELECT count(*) FROM  t_user ";
        int count = template.queryForObject(countsql,Integer.class);
        System.out.println("记录数"+count);
        RowMapper<T_User> row = new BeanPropertyRowMapper<T_User>(T_User.class);

        List<T_User> list = template.query(sql, row);
        Iterator<T_User> iterator = list.iterator();
        for (T_User tUser:list){
            System.out.println(tUser.getId());
            System.out.println(tUser);
        }
        //添加数据
//        int record=  template.query(sql, "3");

    }

}
