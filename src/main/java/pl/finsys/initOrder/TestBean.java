package pl.finsys.initOrder;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 03.07.13
 * Time: 12:44
 */
public class TestBean implements InitializingBean, DisposableBean {

    public TestBean() {
        System.out.println("constructor");
    }

    public void setSetterTest(String dummy) {
        System.out.println("setters");
    }

    public void initMethod() {
        System.out.println("init-method");
    }

    public void destroyMethod() {
        System.out.println("destroy-method");
    }


    @PostConstruct
    public void initMethodAnnotated() {
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void destroyMethodAnnotated() {
        System.out.println("@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean#destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean#afterPropertiesSet");
    }
}
