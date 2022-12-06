package com.wayne;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wayne.dao.UserDao;
import com.wayne.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@SpringBootTest
class Mybatisplus01QucikstartApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
