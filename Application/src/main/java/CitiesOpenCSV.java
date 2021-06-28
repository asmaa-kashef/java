/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CitiesOpenCSV {
    public  List<CitiesPojo> opencsv(String fileName) {
        List<CitiesPojo> city=new ArrayList<>();
       try( BufferedReader br= new BufferedReader(new FileReader(fileName)))
       {
        String line=br.readLine();
//        if(line!=null){
//            line=br.readLine();
//        }
        while (line != null){
            String[] attributes=line.split(",");
            CitiesPojo pyr=createCity(attributes);
            city.add(pyr);
            line=br.readLine();
        }}
        catch(IOException ioe){
         ioe.printStackTrace();
         }
     
        return city;
    }


    public  CitiesPojo createCity(String[] a){
        String cityName=a[1];
        double populationInCity=Double.parseDouble(a[2]);
        String country=a[3];
        return new CitiesPojo(cityName,populationInCity,country);
    }
}