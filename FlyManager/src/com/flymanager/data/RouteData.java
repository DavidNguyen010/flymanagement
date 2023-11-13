package com.flymanager.data;

import com.flymanager.model.Route;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RouteData {
    public static final String FILE = "route.csv";
    public static void writer(List<Route> routes, String FILE){
        try(Writer writer = new FileWriter(FILE);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT))
        {
            //header
            csvPrinter.printRecord("ID","location","chieu dai may bay","chieu rong","status");

            for (Route route: routes){
                csvPrinter.printRecord(
                        route.getId(),
                        route.getLocation(),
                        route.getWidth(),
                        route.getHeight(),
                        route.getStatus());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Route> reader(String FILE){
        List<Route> routes = new ArrayList<>();
        try(Reader reader = new FileReader(FILE);
            CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);)
        {
//            Route(String id, String location, double width, double height, String status)

            for (CSVRecord csvRecord:csvParser ){
                String id = csvRecord.get(0);
                String location = csvRecord.get(1);
                String width = csvRecord.get(2);
                String height = csvRecord.get(3);
                String status = csvRecord.get(4);
                Route route = new Route(id,location,Double.parseDouble(width),Double.parseDouble(height),status);
                routes.add(route);
                route.toString();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return routes;
    }
}
