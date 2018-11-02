package javaapplication2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Reading file");
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/ed-dev/Documents/myJson.txt"));
            String thisLine;
            while ( (thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

}
