import java.util.Scanner;

public class UserData {

    // This class shall return the value of these variables:
    // directory_files_to_change
    // directory_for_new_files
    // location_excel_sheet


    public String[] getdata () {

        System.out.println("*********************** WELCOME ***********************");
        System.out.println("!!!!!!!!!!!!!!!!!!!! Please check !!!!!!!!!!!!!!!!!!!!");
        System.out.println("[  ] In my excel-sheet EVERY column is filled under audioSource");
        System.out.println("[  ] The number of files and columns in my Excel-sheet matches perfectly");
        System.out.println("[  ] I prepared a folder for the renamed files.");
        System.out.println("If something still needs to be done, then do it and come back after.");
        System.out.println("");

        // *** Where are the files, that need to be changed? ***

        System.out.println("***************** ORIGINAL DIRECTORY *****************");
        Scanner user_input = new Scanner(System.in);      // Initialize Scanner
        String directory_files_to_change;
        System.out.println("[Prompting] Please tell me in which directory the files are, whose names you want to change (enter t for testing): ");
        directory_files_to_change = user_input.next();
        System.out.println("Your original directory is " + directory_files_to_change);

        if  (directory_files_to_change.equals("d") == true) {
            directory_files_to_change = "C:\\Users\\Michael\\Desktop\\Michael\\Programmieren\\_Projekte\\File Renamer Helbling Media App\\resources\\Audios\\to rename"; // reset default directory for testing only -> Remove later
            // To test the app I want to always use the same directory, so I don't have to write it all the time.
        }

        directory_files_to_change = "C:\\Users\\Michael\\Desktop\\Michael\\Programmieren\\_Projekte\\File Renamer Helbling Media App\\resources\\Audios\\to rename"; // reset default directory for testing only -> Remove later
        // To test the app I want to always use the same directory, so I don't have to write it all the time.
        // Please delete for release
        System.out.println("");


        // *** Where are the new files going to be saved? ***

        System.out.println("****************** FUTURE DIRECTORY ******************");
        String directory_for_new_files;
        System.out.println("[Prompting] Please tell me now, where the new files shall be saved (enter t for testing):");
        directory_for_new_files = user_input.next();
        System.out.println("Your future directory is " + directory_for_new_files);

        if (directory_for_new_files.equals("t")) {
            directory_for_new_files = "C:\\Users\\Michael\\Desktop\\Michael\\Programmieren\\_Projekte\\File Renamer Helbling Media App\\resources\\Audios\\renamed"; // reseting user input
            // To test the app I want to always use the same directory, so I don't have to write it all the time.
        }

        System.out.println("");


        System.out.println("******************** EXCELSHEET ********************");
        String location_excel_sheet;
        System.out.println("[Prompting] Finally: Please tell me the exact location of your excel-sheet including the name of the sheet. Then I will go to work (enter t for testing):");
        location_excel_sheet = user_input.next();
        System.out.println("Your excel-sheet is at " + location_excel_sheet + " I am going to work");

        if (location_excel_sheet.equals("t")) {
            location_excel_sheet = "C:\\Users\\Michael\\Desktop\\Michael\\Programmieren\\_Projekte\\File Renamer Helbling Media App\\resources\\Excel-sheets\\Test-sheet\\MediaApp_KeyboardClass_SB1.xlsx"; // reseting user input
            // To test the app I want to always use the same location, so I don't have to write it all the time.
        }

        // After the user inputs data I have to add ".xlsx" to the end if it is not there already
        System.out.println("");


        // Now I want to return the values created in this class. To do this I put everything in an array.
        String userdata[] = {directory_files_to_change, directory_for_new_files, location_excel_sheet};
        return userdata;

    }

}
