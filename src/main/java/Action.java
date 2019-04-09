import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Action {

    public static void start (String directory_files_to_change_gui, String directory_for_new_files_gui, String location_excel_sheet_gui){


        // Old way of getting userdata
        String userdata[] = new UserData().getdata();
        String directory_files_to_change = userdata[0];
        String directory_for_new_files = userdata[1];
        String location_excel_sheet = userdata [2];

        //New way of getting userdata (through GUI)
        //userdata[] = new UserData().getdata();
        //directory_files_to_change = userdata[0];
        //directory_for_new_files = userdata[1];
        //location_excel_sheet = userdata [2];

        System.out.println("*********************** START ***********************");

        // Here I want to get the new names of the audio-tracks from the Excel-sheet and save them in the Array filenames
        List<String> filenames = new ArrayList<String>();

        try {
            //List<String> filenames = new ReadExcel().readthesheet(location_excel_sheet);
            filenames = new ReadExcel().readthesheet(location_excel_sheet);

        } catch (IOException e) {
            e.printStackTrace(); // needed, otherwise it won't work
        }

        try {
            CopyAudios.audioCopying(filenames, directory_files_to_change, directory_for_new_files);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finally the audios are gonna be renamed. That's it then!
        RenameAudios.audiosRenaming(filenames, directory_for_new_files);
    }



}
