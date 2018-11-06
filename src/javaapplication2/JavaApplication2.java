package javaapplication2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*  ccommit */
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


