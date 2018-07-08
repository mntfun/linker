package com.linker.test;

import com.linker.LinkerServiceApplication;
import com.linker.model.User;
import com.linker.service.UserOpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        user.setUsername("tom");
        int result = userOpService.saveUserInfo(user);
        System.out.println(result);
    }

    @Test
    public void userUpdateTest() {
        User user = new User();
        userOpService.editUserInfo(user);
    }


}
