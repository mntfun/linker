package com.linker.test;

import com.linker.LinkerServiceApplication;
import com.linker.model.User;
import com.linker.service.UserOpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 *
 * Created by dentalulcer on 05/07/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LinkerServiceApplication.class)
public class UserTest {

    @Autowired
    private UserOpService userOpService;

    @Test
    public void userInsertTest() {
        User user = new User();
        user.setUsername("tom3");
        user.setGender(true);
        user.setPassword("xxsxfsdf");
        user.setEmail("ccc");
        user.setAvatar("123z");
        user.setCreateAt(new Date());
        int result = userOpService.saveUserInfo(user);
        System.out.println(result);
    }

    @Test
    public void userUpdateTest() {
        User user = new User();
        user.setId(1);
        user.setUsername("tom2");
        user.setGender(true);
        user.setPassword("xxsx");
        user.setEmail("bbb");
        user.setAvatar("123z");
        user.setCreateAt(new Date());
        userOpService.editUserInfo(user);
    }


}
