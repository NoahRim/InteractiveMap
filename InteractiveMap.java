package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.Node;
import javafx.scene.paint.Color;

public class Main extends Application {
	    @Override
	    public void start(Stage primaryStage) throws FileNotFoundException {
	        // Create a StackPane as the root pane
	        StackPane root = new StackPane();

	        // Load the background image
	        Image image = new Image(new FileInputStream("C:\\Users\\nrim0\\Downloads\\Maryland Map.PNG"));
	        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
	                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
	                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true));
	        Background background = new Background(backgroundImage);
	        root.setBackground(background);

	        // Create buttons and add them to a VBox
	        VBox buttonBox = new VBox(10); // 10px spacing between buttons
	        buttonBox.setPadding(new Insets(20)); // Padding around the VBox
		    Button b1 = new Button("1");
			Button b2 = new Button("2");
			Button b3 = new Button("3");
			Button b4 = new Button("4");
			Button b5 = new Button("5");
			Button b6 = new Button("6");
			Button b7 = new Button("7");
			Button b8 = new Button("8");
			Button b9 = new Button("9");
			Button b10 = new Button("10");
			Button b11 = new Button("11");
		    Button b12 = new Button("12");
		    buttonBox.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12);
		    
	        VBox buttonBox2 = new VBox(10); // spacing between buttons
	        buttonBox2.setPadding(new Insets(20));
			Button b13 = new Button("13");
			Button b14 = new Button("14");
			Button b15 = new Button("15");
			Button b16 = new Button("16");
			Button b17 = new Button("17");
			Button b18 = new Button("18");
			Button b19 = new Button("19");
			Button b20 = new Button("20");
			Button b21= new Button("21");
			Button b22 = new Button("22");
			Button b23 = new Button("23");
			Button b24 = new Button("24");
			buttonBox2.getChildren().addAll(b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24);
	        
	        // Create a main VBox to hold both VBoxes
	        HBox mainHBox = new HBox();
	        mainHBox.setSpacing(20); // spacing between VBoxes
	        mainHBox.setPadding(new Insets(20)); // padding around main VBox

	        mainHBox.getChildren().addAll(buttonBox, buttonBox2);
			
	        // Example buttons (you can replace these with your button creation logic)
		    b1.setOnAction(e -> openChart("Garrett County", 76.88, 21.02, 2.10));
		    b2.setOnAction(e -> openChart("Allegany County", 68.16, 29.89, 1.95));
		    b3.setOnAction(e -> openChart("Washington County", 59.35, 38.42, 2.23));
		    b4.setOnAction(e -> openChart("Fredrick County", 43.73, 53.34, 2.92));
		    b5.setOnAction(e -> openChart("Carroll County", 60.02, 36.34, 3.64));
		    b6.setOnAction(e -> openChart("Baltimore County", 35.24, 62.28, 2.49));
		    b7.setOnAction(e -> openChart("Baltimore City", 10.69, 87.28, 2.03));
		    b8.setOnAction(e -> openChart("Harford County", 54.61, 42.58, 2.81));
		    b9.setOnAction(e -> openChart("Cecil County", 62.03, 35.42, 2.56));
		    b10.setOnAction(e -> openChart("Montgomery County", 18.96, 78.61, 2.43));
		    b11.setOnAction(e -> openChart("Howard County", 26.43, 70.70, 2.86));
		    b12.setOnAction(e -> openChart("Anne Arundel County", 41.28, 55.82, 2.90));
		    b13.setOnAction(e -> openChart("Prince George's County", 8.73, 89.26, 2.01));
		    b14.setOnAction(e -> openChart("Charles County", 28.58, 69.47, 1.95));
		    b15.setOnAction(e -> openChart("Calvert County", 51.61, 45.99, 2.40));
		    b16.setOnAction(e -> openChart("St. Mary's County", 55.38, 41.57, 3.06));
		    b17.setOnAction(e -> openChart("Kent County", 48.13, 49.37, 2.50));
		    b18.setOnAction(e -> openChart("Queen Anne's County", 61.87, 35.35, 2.77));
		    b19.setOnAction(e -> openChart("Talbot County", 48.53, 49.04, 2.43));
		    b20.setOnAction(e -> openChart("Caroline County", 65.11, 32.26, 2.63));
		    b21.setOnAction(e -> openChart("Dorchester County", 54.85, 42.92, 2.23));
		    b22.setOnAction(e -> openChart("Wicomico County", 49.65, 47.72, 2.64));
		    b23.setOnAction(e -> openChart("Somerset County", 56.56, 41.80, 1.65));
		    b24.setOnAction(e -> openChart("Worcester County", 58.60, 39.63, 1.77));
		    
		    // Add the VBox to the StackPane with center alignment
	        root.getChildren().add(mainHBox);
	        StackPane.setAlignment(mainHBox, javafx.geometry.Pos.CENTER);

	        // Create the scene
	        Scene scene = new Scene(root, 800, 600);

	        // Responsive behavior: Bind root size to scene size
	        root.prefWidthProperty().bind(scene.widthProperty());
	        root.prefHeightProperty().bind(scene.heightProperty());

	        primaryStage.setTitle("Maryland Interactive Map (Presidential Voting Data)");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    /*
	     * Creates a window with a chart when a button is clicked.
	     */
	    private void openChart(String title, double rep, double dem, double ind) {
	        Stage s = new Stage();
	        s.initModality(Modality.APPLICATION_MODAL);
	        StackPane chart = new StackPane();

	        // Create chart content (BarChart example)
			CategoryAxis xAxis = new CategoryAxis();
		    NumberAxis yAxis = new NumberAxis();
		    
		    // Create BarChart
		    BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
		    barChart.setTitle(title + " Data");
		    
		    // Define data for the chart
		    XYChart.Series<String, Number> series = new XYChart.Series<>();
		    series.getData().add(new XYChart.Data<>("Republican", rep));
		    series.getData().add(new XYChart.Data<>("Democrat", dem));
		    series.getData().add(new XYChart.Data<>("Other", ind));
		    
	        // Set up scene and show stage
		    barChart.getData().add(series);
		    chart.getChildren().add(barChart);
		    
	        Scene chartScene = new Scene(chart, 800, 600); // Placeholder StackPane
	        s.setTitle(title);
	        s.setScene(chartScene);
	        s.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
