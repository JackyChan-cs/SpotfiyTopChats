import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

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
                System.out.printf("%-13s%-42s%-35s%-35s%-35s%n",list[i][0], list[i][1] ,list[i][2] ,list[i][3] ,list[1][4]);

                i++;
            }
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }


    }
}
