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


        // Controls
        TextField dirfilestochange = new TextField();
        TextField dirnewfiles = new TextField();
        TextField locationexcel = new TextField();



        Button btn = new Button();
        btn.setText("Start renaming!");

        // Lamda expression
//        btn.setOnAction(event ->
//        {
//
//
//        });

        // Create and setup GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        // Add to GridPane

        grid.add(dirfilestochange, 0, 0, 1, 1);
        grid.add(dirnewfiles, 0, 1, 1, 1);
        grid.add(locationexcel, 0, 2, 1, 1);
        grid.add(btn,0,3,1,1);

        Scene scene = new Scene(grid, 500, 500);

        //scene.getStylesheets().
        //        add(GUITestProject.class.getResource("Login.css").toExternalForm());
        primaryStage.setTitle("File Renamer (Helbling Media App)");
        primaryStage.setScene(scene);
        primaryStage.show();




    }

    /**I
     * @param args the command line arguments
     */







    public static void main(String[] args) {
            launch(args);
        }

    }

