package com.flymanager.controller;

import com.flymanager.service.Register;

public class RegisterController {
    public void registerController(){
        Register register = new Register();
        register.customerRegister();
    }
}
