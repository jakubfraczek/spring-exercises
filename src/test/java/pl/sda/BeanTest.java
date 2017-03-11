package pl.sda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.beans.Bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class BeanTest {

    @Qualifier("test")
    @Autowired
    private Bean bean;

    @Qualifier("test2")
    @Autowired
    private Bean bean2;

    @Test
    public void testIfBeanInjected() throws Exception {
        assertNotNull(bean);
        assertEquals("TestName", bean.getName());
        assertTrue(bean.isTestMethodCalled());
    }

    @Test
    public void testSecondBean() {
        assertNotNull(bean2);
        assertEquals("TestName2", bean2.getName());
    }

}