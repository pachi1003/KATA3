package Kata3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        //String pathName = "C:emailsfilev1";
        String pathName = "C:\\Users\\Javi\\Documents\\NetBeansProjects\\Kata3\\data\\emailsfilev1.txt";
        
        try{ 
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            
            String mail;
            
            while((mail = fileIn.readLine()) != null){
               if (mail.contains("@"))
                   histo.increment(mail.split("@")[1].toLowerCase());
            }
            
        
        }catch(Exception e){
            System.out.println("El fichero no existe");   
        }
        
        HistogramDisplay histodisplay = new HistogramDisplay(histo);
        histodisplay.execute();
    }
    
}

