package pl.sda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.beans.NewBean;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class NewBeanTest {

    @Resource
    NewBean newBean;

    private int oldNumber;


    @Before
    public void initialize() {
        oldNumber = newBean.getNumber();
        newBean.setNumber(3);
    }

    @After
    public void after() {
        newBean.setNumber(oldNumber);
    }

    @Test
    public void test() {
        assertNotNull(newBean);
        assertNotNull(newBean.getFirstBean());
        assertNotNull(newBean.getSecondBean());
        assertEquals(3, newBean.getNumber());
    }
}