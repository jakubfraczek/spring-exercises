package pl.sda;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.beans.Bean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class BeanTest {

    private Bean bean;

    @Test
    public void testIfBeanInjected() throws Exception {
        Assert.assertNotNull(bean);
    }

}