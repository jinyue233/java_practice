package jdk_dynamic_proxy.with_target_impl;

import jdk_dynamic_proxy.without_target_impl.ProxyFactoryWithoutTargetImpl;

public class Main {
    public static void main(String[] args) {
        IUserDao userDaoProxy = (IUserDao) new ProxyFactory(new UserDaoImpl()).getProxyInstance();
        userDaoProxy.saveUser();
        userDaoProxy.sayHello();
    }
}
