package com.flymanager.data;

import com.flymanager.model.Staff;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StaffData {
    public static final String FILE = "staff.csv";
    public static void writer(List<Staff> staffs, String FILE){
        try(Writer writer = new FileWriter(FILE);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT))
        {
            //header
            csvPrinter.printRecord("ID","name","address","phone","position");

            //Ghi vao list customer
            for (Staff staff: staffs){
                csvPrinter.printRecord(
                        staff.getId(),
                        staff.getName(),
                        staff.getAddress(),
                        staff.getPhoneNumber(),
                        staff.getPosition());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Staff> reader(String FILE){
        List<Staff> staffs = new ArrayList<>();
        try(Reader reader = new FileReader(FILE);
            CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);)
        {

            for (CSVRecord csvRecord:csvParser ){
                String id = csvRecord.get(0);
                String name = csvRecord.get(1);
                String address = csvRecord.get(2);
                String phoneNumber = csvRecord.get(3);
                String position = csvRecord.get(4);
                Staff staff = new Staff(id,name,address,phoneNumber,position);
                staffs.add(staff);
                staff.toString();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return staffs;
    }
}
