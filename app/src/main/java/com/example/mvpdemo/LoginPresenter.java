package com.example.mvpdemo;

public class LoginPresenter {
    ILogin iLogin;

    public LoginPresenter(ILogin iLogin) {
        this.iLogin = iLogin;
    }

    public void Login(String username, String pass) {

        if (username.equals("haint46") && pass.equals("123456")) {
            iLogin.LoginDone("Login Thành công");
        } else
            iLogin.LoginNotDone("Login Không thành công");
    }

}
