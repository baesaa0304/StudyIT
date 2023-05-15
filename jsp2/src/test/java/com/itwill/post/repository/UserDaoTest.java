package com.itwill.post.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itwill.post.model.User;

public class UserDaoTest {
    private final Logger log = LoggerFactory.getLogger(UserDaoTest.class);
    
    @Test
    public void loginTest() {
        UserDao userDao = UserDao.getInstance();
        Assertions.assertNotNull(userDao);
       
       // username이 "guest"이고 password가  "guest" 의 테스트 객체 
       User test1 = new User(0, "guest", "guest", null, 0); 
       User result = userDao.selectByUsernameAndPassword(test1);
       // username의 password가 일치하는 사용자를 찾을 수 있어야 함.
       Assertions.assertNotNull(result); 
       log.info("result: {}" , result);
       
       // username 또는 password가 일치하지 않는 사용자는 찾을 수 없어야 함:
        User test2 = new User(0, "Guest", "guest", null, 0);
        result = userDao.selectByUsernameAndPassword(test2);
        Assertions.assertNull(result);
        log.info("result: {}" , result);
    }
}
