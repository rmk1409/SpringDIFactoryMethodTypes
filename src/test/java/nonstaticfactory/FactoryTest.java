package nonstaticfactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Roma on 16.09.2016.
 */
public class FactoryTest {
    @Test
    public void getFood() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("configForNonStaticFactory.xml");

        assertEquals(context.getBean("eatable").getClass(), Pizza.class);
    }
}