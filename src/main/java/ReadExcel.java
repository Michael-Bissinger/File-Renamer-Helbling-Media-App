import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Michael on 27.01.2019.
 */
public class ReadExcel {

public String[] readthesheet (String location_excel_sheet) throws IOException {

    //Opening the Excelsheet
    FileInputStream file = new FileInputStream(new File(location_excel_sheet));
    Workbook workbook = new XSSFWorkbook(file);

    Sheet sheet = workbook.getSheetAt(0);

    //Following needs work

    int i = 0;
    for (Row row : sheet) {
        data.put(i, new ArrayList<String>());
        for (Cell cell : row) {
            switch (cell.getCellTypeEnum()) {
                case STRING: ... break;
                case NUMERIC: ... break;
                case BOOLEAN: ... break;
                case FORMULA: ... break;
                default: data.get(new Integer(i)).add(" ");
            }
        }
        i++;
    }





    String[] filenames;
    return filenames;

}

}
