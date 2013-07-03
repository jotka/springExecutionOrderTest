package pl.finsys.initOrder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 03.07.13
 * Time: 12:46
 */
public class BeanFactoryPostProcessorExampleTest {

    @Test
    public void testPostProcessBeanFactory() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("pl/finsys/initOrder/applicationContext.xml");

        assertThat(ctx != null);

        ((ClassPathXmlApplicationContext) ctx).close();


    }
}
