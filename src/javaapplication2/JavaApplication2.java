package javaapplication2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* new commit */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // create a new OutputStreamWriter
            OutputStream os = new FileOutputStream("test.txt");
            OutputStreamWriter writer = new OutputStreamWriter(os);

            // create a new FileInputStream to read what we write
            FileInputStream in = new FileInputStream("test.txt");

            // write something in the file
            writer.write("dhgjfgj");

            // flush the stream
            System.out.println("Flushing Stream...");
            writer.flush();
            System.out.println("Stream flushed.");

            // read what we write
            System.out.println("" + (char) in.read());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
/**
 * BufferedReader Example
 */
/*
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
 */
