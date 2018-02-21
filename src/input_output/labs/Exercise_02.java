package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02{

    public static void main(String[] args) {

        int i, key, counter;
        BufferedReader in = null;
        BufferedWriter out = null;
        try{

            //ENCODING THE SECRET MESSAGE INTO THE FILE encrypted.txt
            in = new BufferedReader(new FileReader("originalFile.txt"));
            out = new BufferedWriter(new FileWriter("encrypted.txt"));

            key = 1;
            counter = 1;

            do {
                i = in.read();
                if (i != -1) {
                    i = encodeDecode(i, (counter % 2 == 0) ? true : false, key);
                    out.write((char)i);
                    key++;
                    counter++;
                    if(key > 3)
                        key = 1;
                }

            } while (i != -1);

            in.close();
            out.close();

            //DECODING THE SECRET MESSAGE FROM encrypted.txt AND PRINTING IT TO THE CONSOLE
            in = new BufferedReader(new FileReader("encrypted.txt"));
            out = new BufferedWriter(new OutputStreamWriter(System.out));

            key = 1;
            counter = 1;


            do {
                i = in.read();
                if (i != -1) {
                    i = encodeDecode(i, (counter % 2 != 0) ? true : false, key);
                    out.write((char)i);
                    key++;
                    counter++;
                    if(key > 3)
                        key = 1;
                }

            } while (i != -1);

            out.flush();


            //Print to a "decrypted.txt' file
/*          in = new BufferedReader(new FileReader("encrypted.txt"));
            out = new BufferedWriter(new FileWriter("decrypted.txt"));

            key = 1;
            counter = 1;

            do {
                i = in.read();
                if (i != -1) {
                    i = encodeDecode(i, (counter % 2 != 0) ? true : false, key);
                    out.write((char)i);
                    key++;
                    counter++;
                    if(key > 3)
                        key = 1;
                }

            } while (i != -1);
            */

        } catch(IOException ioe){
            System.out.println("I/O Exception: " + ioe);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public static int encodeDecode(int c, boolean encdec, int key){
        if(encdec == true)
            return c+key;
        else
            return c-key;
    }


}

