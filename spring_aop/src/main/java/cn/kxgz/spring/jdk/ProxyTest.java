package cn.kxgz.spring.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        final Target target = new Target();
        final Advice power = new Advice();

        TargetInterface proxyInstance = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                power.before();
                Object invoke = method.invoke(target, args);
                power.after();
                return invoke;
            }
        });
        proxyInstance.save();
    }
}
