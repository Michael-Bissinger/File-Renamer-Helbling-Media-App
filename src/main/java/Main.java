import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

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

        CopyAndRenameAudios.audioFinalizing(directory_files_to_change, directory_for_new_files);


    }
}
