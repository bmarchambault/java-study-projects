package utilities;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //this will read data from a csv file and return a list

    public static List<String[]> read (String file) {
//each element in the list will be an array
        List<String[]> data = new LinkedList<String[]>();
        //linked list makes it easy to add elements.

        //DECLARE THIS OUTSIDE SO WE CAN LOOP THROUGH THE CSV FILE LINE BY LINE, READING ALL LINES:
        String dataRow;
        try {
            //READ THE FILE
            BufferedReader br = new BufferedReader(new FileReader(file));

            //READ ONE LINE
//            String dataRow = br.readLine();

            //INSTEAD OF THE ABOVE, WE WANT TO LOOP THROUGH THE FILE TO READ ALL LINES BECAUSE WE DON'T KNOW HOW MANY LINES ARE IN OUR CSV:
            while ((dataRow = br.readLine()) != null) {
                //DATA IS SEPARATED BY A COMMA AND ADDED TO THE ARRAY DATARECORDS
                String[] dataRecords = dataRow.split(",");
                //the array of data records is added to the list DATA
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }


}
