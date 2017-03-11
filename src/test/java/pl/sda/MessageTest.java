package pl.sda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.beans.Message;

import static org.junit.Assert.*;

/**
 * Created by trot on 11.03.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class MessageTest {

    @Autowired
    private Message message;

    @Test
    public void getLogins() throws Exception {
        assertNotNull(message);
        assertNotNull(message.getLogins());
        assertTrue(message.getLogins().size() == 2);
        assertEquals("anna.chmiel", message.getLogins().get(1));
    }
}