package com.flymanager.data;

import com.flymanager.model.Flight;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlightData {
    public static final String FILE = "flight.csv";
    public static void writer(List<Flight> flights, String FILE){
        try(Writer writer = new FileWriter(FILE);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT))
        {
            //header
            csvPrinter.printRecord("Ma may bay","Date Arrives","Date Department","Note"
            ,"FlightTime","location","width","height","status");

            for (Flight flight: flights){
                csvPrinter.printRecord(
                        flight.getMamaybay(),
                        flight.getDateArrives(),
                        flight.getDateDepartment(),
                        flight.getNote(),
                        flight.getFlightTime(),
                        flight.getLocation(),
                        flight.getWidth(),
                        flight.getHeight(),
                        flight.getStatus()
                );
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Flight> reader(String FILE){
        List<Flight> flights = new ArrayList<>();
        try(Reader reader = new FileReader(FILE);
            CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);)
        {

            for (CSVRecord csvRecord:csvParser ){
                String mamaybay = csvRecord.get(0);
                String dateArrives = csvRecord.get(1);
                String dateDepartment = csvRecord.get(2);
                String note = csvRecord.get(3);
                String flightTime = csvRecord.get(4);
                String location = csvRecord.get(5);
                String width = csvRecord.get(6);
                String heigth = csvRecord.get(7);
                String status = csvRecord.get(8);
                Flight flight = new Flight(mamaybay,flightTime,dateArrives,dateDepartment,note,
                        location,Double.parseDouble(width),Double.parseDouble(heigth),status);
                flights.add(flight);
                flight.toString();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return flights;
    }
}
