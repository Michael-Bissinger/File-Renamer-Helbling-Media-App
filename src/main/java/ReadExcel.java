import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by Michael on 27.01.2019.
 */
public class ReadExcel {

public List<String> readthesheet (String location_excel_sheet) throws IOException {

    //Reading the excel-file
    File excelFile = new File(location_excel_sheet);
    FileInputStream fis = new FileInputStream(excelFile);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    //Looking at the first sheet
    XSSFSheet sheet = workbook.getSheetAt(0);

    //reading through the rows of the first sheet
    Iterator<Row> rowIt = sheet.iterator();

    List<String> completesheet = new ArrayList<String>();     // This is to save the whole excelsheet into one list


    while (rowIt.hasNext()) {
        Row row = rowIt.next();

        Iterator<Cell> cellIterator = row.cellIterator();

        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            //System.out.print(cell.toString() + "; ");

            // Here the cell gets saved to the list "completesheet"
            completesheet.add(cell.toString()); // I removed  + ";"
        }
        //System.out.println();  //Creates a Tab
    }

    workbook.close();
    fis.close();

    //Now the list needs to be searched for those items, that are the new names of the audios

    System.out.println("Number of items in List: " + completesheet.size());

    //String[] filenames = new String[];
    List<String> filenames = new ArrayList<String>();

                // For testing
                // for (int i=0; i <completesheet.size(); i++) {
                //
                //    System.out.println("Number 1: " + i + ": " + completesheet.get(i));
                //
                //}



    for (int i=0; i <completesheet.size(); i++) {
                        //System.out.println(completesheet.get(i));

        //When it finds the element "audio" this is executed
        if (completesheet.get(i).equals("audio") == true) {
            // 1 columns after audio there comes the actual name of the audio
            System.out.println("!" + completesheet.get(i + 1) + " found and stored!");

            // Store this item in the ArrayList filenames
            filenames.add(completesheet.get(i + 1));
        }

    }

    //System.out.println("Filename number one is: " + filenames.get(1));
    System.out.println("Number of Filenames is: " + filenames.size());
    //Return the new names for the audios

    return filenames;

}

}
