package com.sitenovoshop.novoshop.models.userlogin;

import com.sitenovoshop.novoshop.interfaces.UserLogin;

public class CheckoutLogin extends User implements UserLogin {

    public CheckoutLogin(String name, String estado, String cpf, String email) {
        super(name, estado, cpf, email);
    }

    @Override
    public void UseLogin() {
        this.getName().isEmpty();
    }

    @Override
    public void UseCredentials() {

    }
}
