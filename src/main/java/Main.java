import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) {

    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    //setting a gap
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Scene scene = new Scene(grid, 300, 275);

        // Labels and textfields
        Text scenetitle = new Text("Please Login: ");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Label userName = new Label("User Name:");
        TextField userTextField = new TextField();
        Label pw = new Label("Password: ");
        PasswordField pwBox = new PasswordField();


        // Adding the defined elements to the Grid
        // The information behind sets the position
        grid.add(scenetitle,0,0,2,1); //span 2 columns, span 1 row
        grid.add(userName, 0, 1);
        grid.add(userTextField, 1, 1);
        grid.add(pw, 0, 2);
        grid.add(pwBox, 1, 2);

        // only for develpment. Delete in final version.
        //grid.setGridLinesVisible(true);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);

        // Lamda expression
//        btn.setOnAction(event ->
//        {
//            actiontarget.setFill(Color.FIREBRICK);
//            actiontarget.setText("Sign in button pressed");
//        });


        //scene.getStylesheets().
        //        add(GUITestProject.class.getResource("Login.css").toExternalForm());
        primaryStage.setTitle("JavaFX Login Form!");
        primaryStage.setScene(scene);
        primaryStage.show();




        // Old mainclass


        String userdata[] = new UserData().getdata();
        String directory_files_to_change = userdata[0];
        String directory_for_new_files = userdata[1];
        String location_excel_sheet = userdata [2];

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

    /**I
     * @param args the command line arguments
     */







    public static void main(String[] args) {
            launch(args);
        }

    }

