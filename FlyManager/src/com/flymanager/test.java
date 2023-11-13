package com.flymanager;

import com.flymanager.data.CustomerData;
import com.flymanager.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        CustomerData.writer(customers,CustomerData.FILE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id");
        String id = scanner.nextLine();
        System.out.println("Nhap Ten");
        String name = scanner.nextLine();
        System.out.println("Nhap Dia chi");
        String address = scanner.nextLine();
        System.out.println("Nhap sdt");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap so cmnd");
        String identity = scanner.nextLine();

        Customer  customerSc = new Customer(id,name,address,phoneNumber,identity);
        customers.add(customerSc);
        CustomerData.writer(customers,CustomerData.FILE);



        CustomerData.reader(CustomerData.FILE);
        for (Customer customer: customers) {
            System.out.println(customer.toString());
        }
    }
}
