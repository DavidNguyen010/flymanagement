package com.flymanager;

import com.flymanager.controller.LoginController;
import com.flymanager.controller.RegisterController;
import com.flymanager.view.LoginView;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController control = new LoginController(view);
        RegisterController rgcontrol = new RegisterController();
        // goi ham login
        Scanner scanner = new Scanner(System.in);
        System.out.println("chon di con cho");
        System.out.println("1 dang nhap");
        System.out.println("2 dang ky");

        do {
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    control.login();
                    break;
                case 2:
                    rgcontrol.registerController();
                    break;
                case 3:
                    return;
            }
        }while (true);
//        control.login();
    }
}
