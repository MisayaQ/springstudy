package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;

public class DiyPointCut {

    public void before(){
        System.out.println("========方法执行前=========");
    }

    public void after(){
        System.out.println("========方法执行后=========");
    }

    private Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("这是环绕通知之前的部分！！！");
        Object proceed = pjp.proceed();// 调用目标方法
        System.out.println("这是环绕通知之后的部分！！！");
        return proceed;
    }

}
