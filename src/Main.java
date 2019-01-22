import  java.util.Scanner;

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
                System.out.println("[Prompting] Please tell me in which directory the files are, whose names you want to change: ");
                directory_files_to_change = user_input.next();
                System.out.println("Your original directory is " + directory_files_to_change);
        directory_files_to_change = "reset default directory for testing only."; // reseting user input
        // To test the app I want to always use the same directory, so I don't have to write it all the time.
        // Please delete for release
        System.out.println("");


        // *** Where are the new files going to be saved? ***

        System.out.println("****************** FUTURE DIRECTORY ******************");
                String directory_for_new_files;
                System.out.println("[Prompting] Please tell me now, where the new files shall be saved:");
                directory_for_new_files = user_input.next();
                System.out.println("Your future directory is " + directory_for_new_files);
        directory_for_new_files = "reset default directory for testing only."; // reseting user input
        // To test the app I want to always use the same directory, so I don't have to write it all the time.
        // Please delete for release
        System.out.println("");


        System.out.println("******************** EXCELSHEET ********************");
                String location_excel_sheet;
                System.out.println("[Prompting] Finally: Please tell me the location of your excel-sheet. Then I will go to work:");
                location_excel_sheet = user_input.next();
                System.out.println("Your excel-sheet is at " + location_excel_sheet + " I am going to work");
        directory_for_new_files = "reset default location for testing only."; // reseting user input
        // To test the app I want to always use the same location, so I don't have to write it all the time.
        // Please delete for release
        System.out.println("");

        System.out.println("*********************** START ***********************");

    }
}
