package pl.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.user.DefaultUserService;
import pl.sda.user.UserService;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/user-config.xml"})

public class UserTest {

    @Resource
    UserService service;

    @Test
    public void serviceTest() {
        assertNotNull(service);
        assertEquals(3, service.getAllUsers().size());
        assertEquals("Iza", service.getUserByLogin("MariaAnna").getName());
    }

}