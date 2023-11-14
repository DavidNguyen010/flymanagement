package com.flymanager.data;

import com.flymanager.model.Ticket;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TicketData {
    public static final String FILE = "ticket.csv";
    public static void writer(List<Ticket> tickets, String FILE){
        try(Writer writer = new FileWriter(FILE);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT))
        {
            //header
            csvPrinter.printRecord("ID","fly code","type","price");

            //Ghi vao list customer
            for (Ticket ticket: tickets){
                csvPrinter.printRecord(
                        ticket.getId(),
                        ticket.getFlyCode(),
                        ticket.getType(),
                        ticket.getPrice());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Ticket> reader(String FILE){
        List<Ticket> tickets = new ArrayList<>();
        try(Reader reader = new FileReader(FILE);
            CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);)
        {

            for (CSVRecord csvRecord:csvParser ){
                String id = csvRecord.get(0);
                String flyCode = csvRecord.get(1);
                String type = csvRecord.get(2);
                String price = csvRecord.get(3);
                Ticket ticket = new Ticket(id,flyCode,type,Double.parseDouble(price));
                tickets.add(ticket);
                ticket.toString();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return tickets;
    }
}
