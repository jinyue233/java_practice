package jdk_dynamic_proxy.without_target_impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理无实现类的target
 */
public class ProxyFactoryWithoutTargetImpl {
    private Class target;

    public ProxyFactoryWithoutTargetImpl(Class target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClassLoader(), new Class[]{target}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我仅仅代理了一个接口的方法，而没有代理有具体实现类的方法");
                return null;
            }
        });
    }
}
