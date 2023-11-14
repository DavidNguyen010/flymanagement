package com.flymanager.controller;

import com.flymanager.model.Customer;
import com.flymanager.model.LoginModel;
import com.flymanager.model.Staff;
import com.flymanager.view.LoginView;
import com.flymanager.view.Menu;

public class LoginController {
    private LoginView view;

    public LoginController(LoginView view){
        this.view = view;
    }

    public void login() {
        while (true) {
            LoginModel user = view.getUserInfo();
            if (checkAdmin(user)) {
                view.showMessage("success!");
                Menu.menu();
                break;
            }else if(checkLogin(user)){
                view.showMessage("success");
            }
            else {
                view.showMessage("wrong username or password!");
            }
        }
    }

    private boolean checkAdmin(LoginModel user) {
        if ((user.getUserName().equals("admin"))
                && (user.getPassword().equals("099"))) {
            return true;
        }
        return false;
    }
    Customer customer =new Customer();
    Staff staff = new Staff();
    private boolean checkLogin(LoginModel user){
        if (user.getUserName().equals(customer.getUserName())
                && (user.getPassword().equals(customer.getPassword()))){
            return true;
        }else if(user.getUserName().equals(staff.getUserName())
                && (user.getPassword().equals(staff.getPassword()))){
            return true;
        }
        return false;
    }

    public LoginView getView() {
        return view;
    }

    public void setView(LoginView view) {
        this.view = view;
    }
}
