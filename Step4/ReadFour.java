package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        {

            try {
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));
                //initialize variable
                int sum = 0;
                //while there's a next line
                while (fileIn.hasNext()) {
                    // Reads the entire line as ints
                    int lineIn = fileIn.nextInt();
                    // take the int from that line and add it to sum
                    sum += lineIn;
                    System.out.println("Running total: " + sum + "...");
                }
                //print total
                System.out.println("Total : " + sum);
                //close filein scanner (good practice)
                fileIn.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                throw new RuntimeException(e);
            }
            // Print out a running total of all the
            // values in the input file.
        }
    }
}