package com.flymanager.service;

import com.flymanager.data.CustomerData;
import com.flymanager.model.Customer;
import com.flymanager.model.Staff;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Register {
    public static final Scanner SC = new Scanner(System.in);
    public void staffRegister(){
        List<Staff> staffs = new ArrayList<>();

        try {
            while (true){
                System.out.println("ten dang nhap:");
                String name = SC.nextLine();
                System.out.println("mat khau");
                String password = SC.nextLine();
                Staff staff = new Staff(name,password);
                staffs.add(staff);
            }
        }catch (InputMismatchException e){
            System.out.println("Nhap sai roi nhap lai di");
            e.printStackTrace();
        }
    }

    public void customerRegister(){
        List<Customer> customers = new ArrayList<>();
        try {
            System.out.println("ten dang nhap:");
            String name = SC.nextLine();
            System.out.println("mat khau");
            String password = SC.nextLine();
            Customer customer = new Customer(name,password);
            customers.add(customer);
            CustomerData.writer(customers,CustomerData.FILE);
        }catch (InputMismatchException e){
            System.out.println("Nhap sai roi nhap lai di");
            e.printStackTrace();
        }
    }
}
