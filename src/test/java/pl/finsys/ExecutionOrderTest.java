package pl.finsys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.finsys.initOrder.TestBean;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 03.07.13
 * Time: 12:46
 */
public class ExecutionOrderTest {

    @Test
    public void testPostProcessBeanFactory() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("pl/finsys/initOrder/applicationContext.xml");

        assertThat(ctx != null);

        TestBean bean = (TestBean) ctx.getBean("testBean");

        bean.aMethod();

        ((ClassPathXmlApplicationContext) ctx).close();



    }
}
