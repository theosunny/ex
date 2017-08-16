package com.test.annotationDemo.ex;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
public class PasswordUtils {

    @UserCase(userid = "47",desc = "Passwords must contain at least one numeric")
    public boolean validatePwd(String password){
        return password.matches("\\\\w*\\\\d\\\\w*");
    }
    @UserCase(userid = "48")
    public  String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
}
