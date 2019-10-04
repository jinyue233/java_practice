package jdk_dynamic_proxy.with_target_impl;

public class UserDaoImpl implements IUserDao {
    @Override
    public void saveUser() {
        System.out.println("保存用户________");
    }
}
