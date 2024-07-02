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
                int sum = 0;
                while (fileIn.hasNext()) {
                    // Reads the entire line
                    int lineIn = fileIn.nextInt();
                    // Output the line
                    sum += lineIn;
                }
                System.out.println(sum);
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