package com.sunx.aop.demo.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by sunholdIng on 2018/6/29.
 */
@Aspect
@Component
public class DmoAspect {

    //拦截任意返回值，public方法，任意参数的
    @Pointcut("execution(public * com.sunx.aop.demo.service.*.*(..))")
    public void pointCutAll() {
    }

    //拦截String返回值，public方法，任意参数的
    @Pointcut("execution(public String com.sunx.aop.demo.service.*.*(..))")
    public void pointCutStr() {

    }

    @Before("pointCutStr()")
    public void doBefore() {
        System.out.println("I'm before");
    }

    @Around(value = "pointCutStr()")
    public Object after(ProceedingJoinPoint test) {
        System.out.println("before");
        Object str = "";
        try {
            //拿到拦截到的方法的值
            str = test.proceed(test.getArgs());
        } catch (Exception e) {
            System.out.println("###ex");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("this is finally");
        }
        System.out.println("str = "+str);
        return str;
    }


    @AfterReturning(value = "pointCutStr()", returning = "result")
    public void doAfterreturn(Object result) {
        System.out.println("I'm after,{doAfterreturn}");
        System.out.println("return =" + result);
    }
}
