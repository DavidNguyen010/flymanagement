package com.flymanager.data;

import com.flymanager.model.Plane;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlaneData {
    public static final String FILE = "plane.csv";
    public static void writer(List<Plane> planes, String FILE){
        try(Writer writer = new FileWriter(FILE);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT))
        {
            //header
            csvPrinter.printRecord("ID","name","manufacturer","size","seats");

            for (Plane plane: planes){
                csvPrinter.printRecord(
                        plane.getId(),
                        plane.getName(),
                        plane.getManufacturer(),
                        plane.getSize(),
                        plane.getSize());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Plane> reader(String FILE){
        List<Plane> planes = new ArrayList<>();
        try(Reader reader = new FileReader(FILE);
            CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);)
        {

            for (CSVRecord csvRecord:csvParser ){
                String id = csvRecord.get(0);
                String name = csvRecord.get(1);
                String manufacturer = csvRecord.get(2);
                String size = csvRecord.get(3);
                String seats = csvRecord.get(4);
                Plane plane = new Plane(id,name,manufacturer,size,Integer.parseInt(seats));
                planes.add(plane);
                plane.toString();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return planes;
    }
}
