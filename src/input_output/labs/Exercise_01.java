package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

public class Exercise_01{

    public static void main(String[] args) {

        int i;
        try (FileInputStream in = new FileInputStream("testFile.txt");
             FileOutputStream out = new FileOutputStream("newFile.txt")) {


            do {
                i = in.read();
                if(i != -1) out.write(i);
            } while (i != -1);
        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }
    }

}