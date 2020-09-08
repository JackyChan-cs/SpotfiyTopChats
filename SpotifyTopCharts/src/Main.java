import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.util.*;

/**
 * Read in spotify top charts csv into a 2d array and formatted the output
 *
 * @author Jacky chan
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream("Artists-WeekOfMMDDYYYY.txt");
        String fileName = "regional-global-daily-lastest.csv";
        File file = new File("C:\\Users\\somet\\IdeaProjects\\Spotify top charts\\src\\regional-global-daily-latest.csv");
        String line = "";
        String[][] list = new String[201][5];


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int i = 0;
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                list[i]= values;

                System.out.printf("");
                output.printf("%-13s%-42s%-35s%-35s%-35s%n",list[i][0], list[i][1] ,list[i][2] ,list[i][3] ,list[i][4]);

                i++;
            }
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }


    }
}
