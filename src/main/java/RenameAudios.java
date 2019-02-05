import java.io.File;
import java.util.List;

public class RenameAudios {

    public static void audiosRenaming (List<String> filenames, String directory_for_new_files) {

        System.out.println("Now renaming audios...");

        //Getting the files
        File folder = new File(directory_for_new_files);
        File[] listOfFiles = folder.listFiles();

        //Iterating through files
        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File(directory_for_new_files + listOfFiles[i].getName());

                f.renameTo(new File(filenames.get(i)));

                System.out.println("Renaming file: " + filenames.get(i));

            }

        }

        System.out.println("Done!");



    }

}
