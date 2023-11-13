package com.flymanager.data;

import com.flymanager.model.Customer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerData {

    public static final String FILE = "customer.csv";
    public static void writer(List<Customer> customers,String FILE){
        try(Writer writer = new FileWriter(FILE);
            CSVPrinter csvPrinter = new CSVPrinter(writer,CSVFormat.DEFAULT))
        {
            //header
            csvPrinter.printRecord("ID","name","address","phone","identity");

            //Ghi vao list customer
            for (Customer customer: customers){
                csvPrinter.printRecord(
                        customer.getId(),
                        customer.getName(),
                        customer.getAddress(),
                        customer.getPhoneNumber(),
                        customer.getIdentityNumber());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Customer> reader(String FILE){
        List<Customer> customers = new ArrayList<>();
        try(Reader reader = new FileReader(FILE);
            CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);)
        {

            for (CSVRecord csvRecord:csvParser ){
                String id = csvRecord.get(0);
                String name = csvRecord.get(1);
                String address = csvRecord.get(2);
                String phoneNumber = csvRecord.get(3);
                String identityNumber = csvRecord.get(4);
                Customer customer = new Customer(id,name,address,phoneNumber,identityNumber);
                customers.add(customer);
                customer.toString();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return customers;
    }
}
