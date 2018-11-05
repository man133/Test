/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ed-dev
 */
public class JavaApplication2Test {

    public JavaApplication2Test() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        char expected = 'd';
        
        try {
            OutputStream os = new FileOutputStream("test.txt");
            OutputStreamWriter writer = new OutputStreamWriter(os);
            FileInputStream in = new FileInputStream("test.txt");
            // write something in the file
            writer.write("dhgjfgj");
            writer.flush();
            // read what we write
            char result = (char) in.read();
            assertEquals (expected, result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
