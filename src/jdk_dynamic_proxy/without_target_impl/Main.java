package jdk_dynamic_proxy.without_target_impl;

public class Main {
    public static void main(String[] args) {
        IUserDao userDaoProxy = (IUserDao)new ProxyFactoryWithoutTargetImpl(IUserDao.class).getProxyInstance();
        userDaoProxy.saveUser();
    }
}
