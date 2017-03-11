package pl.sda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.other.Continent;
import pl.sda.beans.MyBean;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class MyBeanTest {

    @Qualifier("myBean")
    @Autowired
    private MyBean myBean;

    @Qualifier("childBean")
    @Autowired
    private MyBean childBean;

    @Test
    public void myBeanTest() {
        assertNotNull(myBean);
        assertEquals("00001", myBean.getCode());
    }

    @Test
    public void myBeanVersionTest() {
        assertNotNull(myBean.getVersion());
        assertEquals(1, myBean.getVersion().getVersionNumber());
    }

    @Test
    public void myBeanListTest() {
        assertNotNull(myBean.getAltCodes());
        assertEquals(3, myBean.getAltCodes().size());
        assertEquals("54000", myBean.getAltCodes().get(2));
    }

    @Test
    public void childBeanTest() {
        assertNotNull(childBean);
        assertEquals("00010", childBean.getCode());
        assertEquals("15000", childBean.getAltCodes().get(1));
    }

    @Test
    public void subBeansTest() {
        assertNotNull(myBean.getSubBeens());
        assertEquals("Kuba", myBean.getSubBeens().get(0).getName());
        assertEquals("Justa", myBean.getSubBeens().get(1).getName());
    }

    @Test
    public void countryTest() {
        assertNotNull(myBean.getNameToCountryBean());
        assertEquals(Continent.AFRICA, myBean.getNameToCountryBean().get("Uganda").getContinent());
        assertEquals("North America", myBean.getNameToCountryBean().get("United States").getContinent().getName());
        assertEquals("POL", myBean.getNameToCountryBean().get("Poland").getIsocode());
    }
}