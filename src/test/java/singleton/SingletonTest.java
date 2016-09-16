package singleton;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Roma on 16.09.2016.
 */
public class SingletonTest {
    @Test
    public void getInstance() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("configForSingleton.xml");

        Singleton singleton1 = (Singleton) context.getBean("singleton");
        Singleton singleton2 = (Singleton) context.getBean("singleton");

        assertEquals(singleton1, singleton2);
    }

}