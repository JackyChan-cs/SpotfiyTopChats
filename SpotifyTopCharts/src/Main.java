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
        PrintStream output = new PrintStream("Artists-WeekOfMMDDYYYY.txt");     //Creates a text file for the outputs
        String fileName = "regional-global-daily-lastest.csv";
        File file = new File("C:\\Users\\somet\\IdeaProjects\\Spotify top charts\\src\\regional-global-daily-latest.csv");    //Create filepath for csv file
        String line = "";
        String[][] list = new String[201][5];           //creates 2d array


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));     //creates object that reads the data in the csv file
            int i = 0;                                      //counter to make output more dynamic 
            while ((line = br.readLine()) != null) {        //loop reads through the csv line by line until the end

                String[] lineData = line.split(",");          //creates a string array that splits the csv data by commans
                list[i]= lineData;                            //converts the data in the lineData array into the 2d array.  

                System.out.printf("");
                output.printf("%-13s%-42s%-35s%-35s%-35s%n",list[i][0], list[i][1] ,list[i][2] ,list[i][3] ,list[i][4]);  //formats the output statement 

                i++;
            }
            }catch(FileNotFoundException e){             //exception handling
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }


    }
}
