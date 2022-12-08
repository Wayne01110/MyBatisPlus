package com.wayne;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wayne.dao.UserDao;
import com.wayne.domain.User;
import com.wayne.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus02DplApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        //方式一：按条件查询
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age", 18);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

        //方式二：按条件查询
//        QueryWrapper<User> qw = new QueryWrapper<User>();
//        qw.lambda().lt(User::getAge, 10);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

        //方式三：按条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.lt(User::getAge, 10);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);


//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //10到30岁之间
//        lqw.lt(User::getAge, 30).gt(User::getAge, 10);
        //小于10岁或者大于30岁
//        lqw.lt(User::getAge, 10).or().gt(User::getAge, 30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

        //模拟页面传递过来的插叙数据
        UserQuery uq = new UserQuery();
        uq.setAge(10);
        uq.setAge2(30);

        //null判定
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge, uq.getAge2());
//        lqw.gt(User::getAge, uq.getAge());
//        if (null != uq.getAge()) {
//            lqw.gt(User::getAge, uq.getAge());
//        }
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        //先判定第一个参数是否为true，如果为true连接当前条件
//          lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2());
//          lqw.gt(null != uq.getAge(), User::getAge, uq.getAge());
//        lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2()).gt(null != uq.getAge(), User::getAge, uq.getAge());
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

        //查询投影
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.select(User::getId, User::getName, User::getAge);
//        QueryWrapper<User> lqw = new QueryWrapper<>();
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        QueryWrapper<User> lqw = new QueryWrapper<>();
//        lqw.select("count(*) as count,tel");
//        lqw.groupBy("tel");
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

        //条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //等同于==
//        lqw.eq(User::getName, "Jerry").eq(User::getPassword, "jerry");
//
//        User loginUser = userDao.selectOne(lqw);
//        System.out.println(loginUser);


//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        //范围查询 lt le gt ge eq between
//        lqw.between(User::getAge, 10, 30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        //模糊匹配 like
//        lqw.likeLeft(User::getName, "J");
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);


    }
}
