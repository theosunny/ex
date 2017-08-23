package com.spring.ssh;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23 0023.
 */
public class UserDaoImpl implements UserDao {
    //得到hibernate实现类对象
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add() {
        //HibernateTemplate对Hibernate进行封装
//        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
//        hibernateTemplate.save(entity)
//       不采用上面的 现在使用配置实现
    //调用save方法实现
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setUsername("tom");
        user.setPassword("tom");
        hibernateTemplate.save(user);
        //load（延时查询），get方法查询根据id查询
        user=hibernateTemplate.get(UserEntity.class,1020);
        System.out.println("password="+user.getPassword());
        user=hibernateTemplate.load(UserEntity.class,1);
        System.out.println("password="+user.getPassword());
        //find方法查询表里所有记录
//        第一个参数是hql语句，第二个是可变参数值
       List<UserEntity> list = (List) hibernateTemplate.find("from UserEntity ");
        for (UserEntity user1:
             list) {
        System.out.println("find方法全部查询"+user1);

        }
       //find方法根据条件查询
        //        第一个参数是hql语句，第二个是可变参数值
//        DetachedCriteria 实现分页
        List<UserEntity> listbyParam = (List) hibernateTemplate.find("from UserEntity where username=?","tom");

        for (UserEntity user1:
                listbyParam) {
            System.out.println("find方法条件查询"+user1);

        }

    }
}
