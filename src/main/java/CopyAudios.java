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

public static void audioCopying (List<String> filenames, String directory_files_to_change, String directory_for_new_files) throws IOException {

    System.out.println("Welcome in the final round!");
    System.out.println(filenames);
    System.out.println(directory_files_to_change);
    System.out.println(directory_for_new_files);


    // Copy the files
    File source = new File(directory_files_to_change);
    File destination = new File(directory_for_new_files);

    // First check if the input entered by the user is correct
    if (source.isDirectory()) {

        if (!destination.exists()){

            // If the destination-fodler doesn't exist just create it
            destination.mkdir();
            System.out.println("The folder !" + destination + "! had to be created");

        }

        String files[] = source.list();

        for (String file : files) {

            File source_File = new File(source, file);
            File destination_File = new File(destination,file);

            //Copying
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to: " + directory_for_new_files);

        }

    }
    else {

        System.out.println("Program failed because the original folder " + directory_files_to_change + " is not a folder!");
        System.out.println("Please start again and input correct data.");
        System.exit(0);

    }


}

}
