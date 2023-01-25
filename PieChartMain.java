package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class Homework_2_Main extends Application {

    @java.lang.Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Exercise14_13");
        stage.setWidth(500);
        stage.setHeight(500);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Quiz -- 10%", 10),
                        new PieChart.Data("Project -- 20%", 20),
                        new PieChart.Data("Final -- 40%", 40),
                        new PieChart.Data("Midterm -- 30%", 30));
                final PieChart chart = new PieChart(pieChartData);
                chart.setTitle("Exercise14_13");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
