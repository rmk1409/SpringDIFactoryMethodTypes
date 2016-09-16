package staticfactory;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Roma on 16.09.2016.
 */
public class FactoryTest {
    private static ApplicationContext context;

    @BeforeClass
    public static void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("configForStaticFactory.xml");
    }

    @Test
    public void getCar() throws Exception {
        Object flyable = context.getBean("flyable");
        assertEquals(flyable.getClass(), Fighter.class);
    }

    @Test
    public void getPlane() throws Exception {
        Object driveable = context.getBean("driveable");
        assertEquals(driveable.getClass(), Tesla.class);
    }

}