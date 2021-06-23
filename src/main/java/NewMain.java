/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;  
/**
 *
 * @author asmaa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try{
           InputStreamReader r= new InputStreamReader(System.in); 
            BufferedReader br=new BufferedReader(r);
            FileWriter writer = new FileWriter("C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\testout.txt");  
            BufferedWriter buffer = new BufferedWriter(writer);
            String name="";
            while(!name.equals("stop")){
            System.out.println("Enter the Data");
                name=br.readLine();
             System.out.println(name);
             buffer.write(name);
            }
        // TODO code application logic here
        buffer.close();
        br.close();
       
    }
    catch(Exception e){
                   System.out.println("Error");
                       }
    }
    

}


    

