import javafx.scene.shape.Path;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CopyAudios {

    // 2 variables are put in, oo variable is output

public static void audioFinalizing (List<String> filenames, String directory_files_to_change, String directory_for_new_files) {

    System.out.println("Welcome in the final round!");
    System.out.println(filenames);
    System.out.println(directory_files_to_change);
    System.out.println(directory_for_new_files);


    // Copy the files
    File source = new File(directory_files_to_change);
    File destination = new File(directory_for_new_files);

    // First check if the input entered by the user is correct
    if (source.isDirectory()) {

        System.out.println("That is a directory. Perfect!");

    }
    else {

        System.out.println("Programm failed because the original folder " + directory_files_to_change + " is not a folder!");
        System.out.println("Please start again and input correct data.");
        System.exit(0);

    }


}

}
