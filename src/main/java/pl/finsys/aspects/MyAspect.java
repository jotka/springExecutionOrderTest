package pl.finsys.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 04.07.13
 * Time: 08:02
 */


@Aspect
public class MyAspect {

    @Before("execution(void set*(*))")
    public void setterAdvice(JoinPoint jointPoint) {
        System.out.println("AOP advice");
    }
}
