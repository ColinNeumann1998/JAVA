package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.Double;
import java.lang.String;


import static javafx.scene.text.Font.font;


public class Homework_3b_Main extends Application {

    @java.lang.Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Temperature Converter");

        GridPane grid;
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Displays the title of the grid we will be using
        Text sceneTitle;
        sceneTitle = new Text("Temperature Converter HW 3");    // Displays the title of the program
        sceneTitle.setFont(font("Tahoma", FontWeight.NORMAL, 20));  // Sets the font
        grid.add(sceneTitle, 0, 0, 2, 1);

        Scene scene = new Scene(grid, 300, 325);
        primaryStage.setScene(scene);
        primaryStage.show();




    } // End of public void start


} // End of Main

class Fahrenheit extends Application implements Convert
{
    private double temperature;
    private double Temperature;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        public double convert();
    }

    public double convert()   //
    {
        GridPane grid;
        grid = new GridPane();

        // Displays the Label 'Degrees in F: ' on the grid
        Label DegreesF = new Label("Degrees F: ");   // Title for the first label
        grid.add(DegreesF, 0, 1);     // Sets the dimension as to where the label will be on the grid

        // Displays a box that allows the user to enter any degree in Fahrenheit
        TextField DegreesTextField;
        DegreesTextField = new TextField();
        grid.add(DegreesTextField, 1, 1);   // Sets the dimension to where the first box will go

        // Displays a button in which the user will be able to convert any temperature they enter into Celsius
        Button btn = new Button("Convert F to C");  // Title for the first button
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);          // Placement as to where the button will be along the row
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);       // Where the button will be placed within the grid

        // Displays the Label 'Degrees C: ' on the grid
        Label degreesC = new Label("Degrees C: "); // Title for the second label
        grid.add(degreesC, 0, 2);   // Sets the dimension as to where the label will be on the grid

        Label Degreesc = new Label();
        grid.add(Degreesc, 1, 2);

        btn.setOnAction((event) ->
        {   // Lambda Expression

            String text = DegreesTextField.getText();   // Retrieves the text from the field and sets it as a string
            double temperature = Double.parseDouble(text);     // Converts the string from the text into a type double
            double temperature2 = ((temperature - 32) * .5556);    // Calculates the double from Celsius into Fahrenheit
            String s = String.valueOf(temperature2);    // Converts the type double back into a String value
            final Text actiontarget = new Text();   // Displays the String Value
            grid.add(actiontarget, 1, 2);   // Displays the String Value at this given location
            actiontarget.setText(s);

        }); // End of Lambda Expression
        return;
    }
}

class Celsius extends Application implements Convert
{
    private double Temperature;
    private double Temperature2;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        public double convert();
    }

    public double convert()
    {
        GridPane grid;
        grid = new GridPane();

        // Displays the Label 'Degrees C: ' on the grid
        Label DegreesC = new Label("Degrees C: "); // Title for the third label
        grid.add(DegreesC, 0, 5);

        // Displays the field in which the user can enter any degree in Celsius
        TextField degreesTextField = new TextField();
        grid.add(degreesTextField, 1, 5);

        // Displays the Label 'Degrees in F: ' on the grid just under the Celsius label
        Label degreesF = new Label("Degrees F: ");
        grid.add(degreesF, 0, 6);

        Label Degreesf = new Label("");
        grid.add(Degreesf, 1, 6);

        // Displays a button in which the user will be able to convert any temperature they enter into Celsius
        Button btn2 = new Button("Convert C to F");  // Title for the first button
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_CENTER);          // Placement as to where the button will be along the row
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 7);       // Where the button will be placed within the grid


        btn2.setOnAction((event)->

        {   // Lambda Expression

            String text = degreesTextField.getText();   // Retrieves the text from the field and sets it as a string
            double Temperature = Double.parseDouble(text);    // Converts the string from the text into a type double
            double Temperature2 = ((Temperature * 1.8) + 32);    // Calculates the double from Celsius into Fahrenheit
            String s1 = String.valueOf(Temperature2);  // Converts the type double back into a String value
            final Text actiontarget = new Text();   // Displays the String Value
            grid.add(actiontarget, 1, 6);   // Displays the String Value at this given location
            actiontarget.setText(s1);
        });
        return;
    }
}





