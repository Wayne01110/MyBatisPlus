package com.wayne;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wayne.dao.UserDao;
import com.wayne.domain.User;
import com.wayne.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus03DplApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
//        user.setId(667L);
        user.setName("程序员");
        user.setPassword("system");
        user.setAge(12);
        user.setTel("40061840000");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
//        ArrayList<Long> list = new ArrayList<>();
//        list.add(1600376760723898370L);
//        list.add(1600378191774302209L);
//        list.add(1600378551825965057L);
//        userDao.deleteBatchIds(list);

        userDao.deleteById(2L);
        System.out.println(userDao.selectList(null));
    }

    @Test
    void testUpdate() {
//        User user = new User();
//        user.setId(3L);
//        user.setName("Jock666");
//        user.setVersion(1);
//        userDao.updateById(user);

//        //1.先通过要修改的数据id将当前数据查询出来
//        User user = userDao.selectById(3L);
//        //2.将要修改的属性逐一设置进去
//        user.setName("Jock888");
//        userDao.updateById(user);

        //1.先通过要修改的数据id将当前数据查询出来
        User user = userDao.selectById(3L);

        User user2 = userDao.selectById(3L);

        //2.将要修改的属性逐一设置进去
        user2.setName("Jock aaa");
        userDao.updateById(user2);

        user.setName("Jock bbb");
        userDao.updateById(user);
    }
}
