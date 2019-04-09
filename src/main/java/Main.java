import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {


        // Controls
        final TextField dirfilestochange = new TextField();
        final TextField dirnewfiles = new TextField();
        final TextField locationexcel = new TextField();
        Label lbltitle = new Label("Helbling File Renamer");
        lbltitle.setTextAlignment(TextAlignment.CENTER);
        Label lblspace = new Label("--------------");
        lblspace.setTextAlignment(TextAlignment.CENTER);
        Label lblfilestochange = new Label("Where are the files to change? (Path to folder)");
        lblfilestochange.setTextAlignment(TextAlignment.CENTER);
        Label lblnewfiles = new Label("Where to put the renamed files? (Path to folder)");
        lblnewfiles.setTextAlignment(TextAlignment.CENTER);
        Label lbllocationexcel = new Label("Where is the excel sheet? (Path to sheet)");
        lbllocationexcel.setTextAlignment(TextAlignment.CENTER);

        Button btn = new Button();
        btn.setText("Start renaming!");


        // Create and setup GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        // Add to GridPane

        grid.add(lbltitle, 0, 0, 1, 1);
        grid.add(lblspace, 0, 1, 1, 1);
        grid.add(lblfilestochange, 0,2,1,1);
        grid.add(dirfilestochange, 0, 3, 1, 1);
        grid.add(lblnewfiles,0,4,1,1);
        grid.add(dirnewfiles, 0, 5, 1, 1);
        grid.add(lbllocationexcel,0,6,1,1);
        grid.add(locationexcel, 0, 7, 1, 1);
        grid.add(btn,0,8,1,1);

        Scene scene = new Scene(grid, 500, 500);

        //scene.getStylesheets().
        //        add(GUITestProject.class.getResource("Login.css").toExternalForm());
        primaryStage.setTitle("File Renamer (Helbling Media App)");
        primaryStage.setScene(scene);
        primaryStage.show();


        // Start programm
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String directory_files_to_change_gui = dirfilestochange.getText();
                System.out.println("---> Directoriy files to change: " + directory_files_to_change_gui);
                String directory_for_new_files_gui = dirnewfiles.getText();
                System.out.println("---> Directoriy for new files: " + directory_for_new_files_gui);
                String location_excel_sheet_gui = locationexcel.getText();
                System.out.println("---> Location excel-sheet: " + location_excel_sheet_gui);
                Action.start(directory_files_to_change_gui, directory_for_new_files_gui, location_excel_sheet_gui);
            }
        });



    }

    /**I
     * @param args the command line arguments
     */







    public static void main(String[] args) {
            launch(args);
        }

    }

