
public class Main {

    public static void main(String[] args) {

        // *** PLAN ***
        // To Develop:
        // I want to build a tool, that
        // 1) Looks in my excel-sheet
        // 2) Finds the column "audioSource"
        // 3) Copies the name of the media-title under it
        //    -> changes the first file it finds in a certain directory to it
        //    -> Repeats until there is no more text

        // Prerequisites:
        // There must be a fully filled Excelsheet
        //       -> without blank columns (Programm will stop if it finds any)

        //Prompting the user which directory the file is in

        // The class UserData is called here
        // Save the 3 variables, that the class gives back, here please


        String userdata[] = new UserData().getdata();
                String directory_files_to_change = userdata[0];
                String directory_for_new_files = userdata[1];
                String location_excel_sheet = userdata [2];

        System.out.println("*********************** START ***********************");

        // Here every necesarry column from the excel-sheets are read and put into an Array
        // To do this the class needs to know the location of the excel-sheet saved in "location_excel_sheet"
        String filenames[] = ReadExcel(location_excel_sheet);


    }
}
