package com.unit_exception.session5;

public class LoginTest {

    public static void main(String[] args) {
        String name      = "朱四倍";
        String  password = "123abc";

        login(name, password);
    }


    public static void login(String name, String password) {
        if ((name == null || name.length() <= 0) || (password == null || password.length() <= 0)) {
            throw new LoginException(LoginException.ERROR_CODE_1, "用户名或密码为空");
        }

        //db check
        String dbName = "朱四倍";

        if (!dbName.equals(name)) {
            throw new LoginException(LoginException.ERROR_CODE_2, "用户名不存在");
        }

        String dbPassword = "123Abc";
        if (!dbPassword.equals(password)) {
            throw new LoginException(LoginException.ERROR_CODE_3, "密码不正确");
        }

        int isLock = 0;
        if (isLock == 1) {
            throw new LoginException(LoginException.ERROR_CODE_3, "此帐号已锁定");
        }

        System.out.println("登录成功！");
    }
}
