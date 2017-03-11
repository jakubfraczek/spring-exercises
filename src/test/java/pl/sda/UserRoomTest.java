package pl.sda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.other.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class UserRoomTest {

    @Autowired
    private User user;

    @Test
    public void getUserRoom() throws Exception {
        assertNotNull(user);
        assertNotNull(user.getRoom());
        assertEquals("27c", user.getRoom().getRoomNumber());
    }
}
