package jdk_dynamic_proxy.with_target_impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理有实现类的target
 */
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 当一个接口有多个方法时，此时可以通过method.getName()来判断是哪个方法，从而实现不同的代理逻辑
                if (method.getName().equals("sayHello")) {
                    System.out.println("sayHello前_______");
                    method.invoke(target, args);
                    System.out.println("sayHello后_______");
                } else if (method.getName().equals("saveUser")) {
                    System.out.println("saveUser前_______");
                    method.invoke(target, args);
                    System.out.println("saveUser后_______");
                }
                return null;
            }
        });
    }
}
