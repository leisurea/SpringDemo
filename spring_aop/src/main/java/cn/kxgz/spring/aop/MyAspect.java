package cn.kxgz.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void before() {
        System.out.println("ǰ����ǿ������");
    }

    public void afterReturning() {
        System.out.println("������ǿ������");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("����ǰ��ǿ������");
        Object proceed = pjp.proceed();
        System.out.println("���ƺ���ǿ������");
        return proceed;
    }

    public void afterThrowing() {
        System.out.println("�쳣�ͳ���ǿ������");
    }

    public void after() {
        System.out.println("������ǿ������");
    }
}
