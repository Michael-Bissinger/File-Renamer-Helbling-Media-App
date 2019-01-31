import java.io.IOException;
import java.util.List;

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



        String userdata[] = new UserData().getdata();
                String directory_files_to_change = userdata[0];
                String directory_for_new_files = userdata[1];
                String location_excel_sheet = userdata [2];

        System.out.println("*********************** START ***********************");

        // Here I want to get the new names of the audio-tracks from the Excel-sheet and save them in the Array filenames
        try {
            List<String> filenames = new ReadExcel().readthesheet(location_excel_sheet);
        } catch (IOException e) {
            e.printStackTrace(); // neede, otherwise it won't work
        }


    }
}
