import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.io.FileNotFoundException;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.CheckBox;

import java.io.File;
import java.io.PrintWriter;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 * Represents a program that is a FoodTruck.
 *
 * @author prumyantseva3
 * @version 13.31
 */
public class FoodTruck extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        int mid = 150;
        int top = 50;

        Rectangle bgd = new Rectangle(0, 0, 300, 300);
        bgd.setFill(Color.GRAY);

        Text text = new Text(mid + 80, 80, "Cat");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Rectangle ground = new Rectangle(0, 155, 300, 20);  // ground
        ground.setFill(Color.BLUE);
        Rectangle sky = new Rectangle(0, 0, 300, 20);
        sky.setFill(Color.BLUE);
        Rectangle textR = new Rectangle(0, 175, 300, 50);
        textR.setFill(Color.WHITE);

        Text myText = new Text(2, 185, "Patrisiya Rumyantseva");
        myText.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 10));
        Text myText2 = new Text(2, 195, "prumyantseva3@gatech.edu");
        myText2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 10));


        Circle face = new Circle();
        face.setCenterX(150.0f);
        face.setCenterY(100.0f);
        face.setRadius(50.0f);  // sun
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(3);
        face.setFill(Color.TRANSPARENT);
        Ellipse lefteye = new Ellipse(mid - 25, top + 25, 10, 10);   // left eye
        Ellipse righteye = new Ellipse(mid + 25, top + 25, 10, 10);    // right eye
        lefteye.setFill(Color.WHITE);
        righteye.setFill(Color.WHITE);
        Ellipse ilefteye = new Ellipse(mid - 20, top + 20, 5, 5);   // left eye
        Ellipse irighteye = new Ellipse(mid + 20, top + 20, 5, 5);    // right eye
        ilefteye.setFill(Color.BLACK);
        irighteye.setFill(Color.BLACK);
        Ellipse nose = new Ellipse(mid, top + 50, 10, 5);   // upper torso
        nose.setFill(Color.PINK);
        Arc smile = new Arc(mid, top + 70, 20, 5, 190, 160);   // smile
        smile.setType(ArcType.OPEN);
        Line leftarm = new Line(mid - 25, top + 60, mid - 60, top + 40);
        leftarm.setStrokeWidth(3);
        Line rightarm = new Line(mid + 25, top + 60, mid + 60, top + 40);
        rightarm.setStrokeWidth(3);  // right arm
        Line whisker2 = new Line(mid + 25, top + 60, mid + 60, top + 60);
        whisker2.setStrokeWidth(3);
        Line whisker3 = new Line(mid - 25, top + 60, mid - 60, top + 60);
        whisker3.setStrokeWidth(3);
        Rectangle hatTop = new Rectangle(mid - 15, top - 23, 30, 25);
        Arc hatBrim = new Arc(mid, top - 1, 20, 5, 180, 180);   // smile
        Line ear = new Line(mid + 40, top + 20, mid + 70, top - 2);
        ear.setStrokeWidth(3);
        Line ear1 = new Line(mid + 31, top + 10, mid + 70, top - 2);
        ear1.setStrokeWidth(3);
        Line ear11 = new Line(mid - 40, top + 20, mid - 70, top - 2);
        ear11.setStrokeWidth(3);
        Line ear22 = new Line(mid - 31, top + 10, mid - 70, top - 2);
        ear22.setStrokeWidth(3);

        Pane pane = new Pane();

        pane.getChildren().add(bgd);
        pane.getChildren().add(text);
        pane.getChildren().add(ground);
        pane.getChildren().add(textR);
        pane.getChildren().add(myText);
        pane.getChildren().add(myText2);

        pane.getChildren().add(sky);
        pane.getChildren().add(face);
        pane.getChildren().add(nose);
        pane.getChildren().add(ear);
        pane.getChildren().add(ear1);
        pane.getChildren().add(ear11);
        pane.getChildren().add(ear22);
        pane.getChildren().add(lefteye);
        pane.getChildren().add(righteye);
        pane.getChildren().add(ilefteye);
        pane.getChildren().add(irighteye);
        pane.getChildren().add(leftarm);
        pane.getChildren().add(rightarm);
        pane.getChildren().add(smile);
        pane.getChildren().add(hatBrim);
        pane.getChildren().add(hatTop);
        pane.getChildren().add(whisker2);
        pane.getChildren().add(whisker3);
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("Cat"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage


        TextField hamburger = new TextField();
        hamburger.setMaxWidth(50);
        TextField hotdog = new TextField();
        hotdog.setMaxWidth(50);
        TextField frenchfries = new TextField();
        frenchfries.setMaxWidth(50);
        TextField total = new TextField();
        total.setMaxWidth(50);


        BorderPane border = new BorderPane();
        // Place nodes in the pane
        Rectangle header = new Rectangle(658, 100);
        header.setFill(Color.GREEN);

        Text myText1 = new Text(186, 70, "CS 1331 Food Truck");
        myText1.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 30));
        myText1.setFill(Color.WHITE);
        Pane pane1 = new Pane();
        pane1.getChildren().add(header);
        pane1.getChildren().add(myText1);
        border.setTop(pane1);
        GridPane grid = new GridPane();
        Label l1 = new Label("Hamburger ($8)");
        Label l2 = new Label("Hot Dog ($5)");
        Label l3 = new Label("French Fries ($3)");
        CheckBox checkBox1 = new CheckBox("Ketchup");
        CheckBox checkBox2 = new CheckBox("Mustard");
        CheckBox checkBox3 = new CheckBox("Relish");
        GridPane condiment = new GridPane();

        Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFB"
                + "BTzeJnIKO7IBDppLPV1RKlhr2CbX-7Cy13UzB4ctpJ-2wfnUix2sKYl9jTdQ5EAOMU&usqp=CAU");
        ImageView imageView = new ImageView(image);
        condiment.add(imageView, 1, 4);
        Label dietery = new Label("Dietary Restriction:N/A ");
        dietery.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 9));
        condiment.add(dietery, 1, 5);
        condiment.setHgap(15);
        condiment.setPadding(new Insets(0, 30, 0, 30));


        condiment.add(new Label("Condiments:"), 1, 0);
        condiment.add(checkBox1, 1, 1);
        condiment.add(checkBox2, 1, 2);
        condiment.add(checkBox3, 1, 3);

        condiment.setAlignment(Pos.TOP_CENTER);


        grid.setVgap(15);
        hamburger.setText("0");
        hotdog.setText("0");
        frenchfries.setText("0");
        grid.add(hamburger, 1, 0);
        grid.add(l1, 0, 0);
        grid.add(hotdog, 1, 1);
        grid.add(l2, 0, 1);
        grid.add(frenchfries, 1, 2);
        grid.add(l3, 0, 2);
        grid.setPadding(new Insets(0, 5, 0, 2));

        GridPane gridImg = new GridPane();
        Image foodtruckimg = new Image("https://assets.stickpng.com/images/5ed4c939d9395700046875aa.png");
        ImageView viewImg = new ImageView(foodtruckimg);
        Image burger = new Image("https://www.nicepng.com/png/detail/7-76566_"
                + "hamburger-cliparts-transparent-hamburger-clipart-png.png");
        Image fries = new Image("https://www.kindpng.com/picc/m/241-2415997_fr"
                + "ench-fries-png-clipart-transparent-png.png");
        Image hot = new Image("https://www.seekpng.com/png/detail/7-71000_hot-"
                + "dog-hot-dog-png-transparent.png");
        ImageView hotV = new ImageView(hot);
        ImageView friesV = new ImageView(fries);
        ImageView burgerV = new ImageView(burger);
        ComboBox<String> combo = new ComboBox<>();
        Label comboboxl = new Label("Dietary Restrictions:");
        comboboxl.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 10));

        gridImg.add(comboboxl, 0, 2);
        combo.getItems().addAll("Vegetarian", "Gluten-Free", "Egg-Free");
        gridImg.add(combo, 0, 3);
        dietery.setMaxWidth(130);

        combo.setOnAction(e -> {
            if (combo.getValue().equals("Vegetarian")) {
                dietery.setText("Dietary Restriction: VG ");
            } else if (combo.getValue().equals("Egg-Free")) {
                dietery.setText("Dietary Restriction: EF ");
            } else if (combo.getValue().equals("Gluten-Free")) {
                dietery.setText("Dietary Restriction: GF ");
            }

        });

        viewImg.setFitHeight(100);
        viewImg.setFitWidth(180);
        burgerV.setFitHeight(30);
        burgerV.setFitWidth(30);
        friesV.setFitHeight(30);
        friesV.setFitWidth(30);
        hotV.setFitWidth(30);
        hotV.setFitHeight(30);
        gridImg.add(viewImg, 0, 1);
        gridImg.add(burgerV, 1, 1);
        gridImg.add(friesV, 3, 1);
        gridImg.add(hotV, 2, 1);
        gridImg.setAlignment(Pos.CENTER);
        GridPane buttonpane = new GridPane();
        buttonpane.setHgap(541);
        Button purchase = new Button("Purchase");
        buttonpane.add(purchase, 0, 1);
        Button clearButton = new Button("Clear");
        buttonpane.add(clearButton, 1, 1);
        Label labelCost = new Label("Current Cost: ");
        labelCost.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 10));
        Label cost = new Label("");


        cost.setMaxWidth(130);


        //GridPane right = new GridPane();
        cost.setMaxWidth(200);
        cost.setMinHeight(50);
        grid.setHgap(0);
        //grid.setAlignment(Pos.CENTER);
        grid.add(labelCost, 0, 4);
        grid.add(cost, 1, 4);


        border.setLeft(grid);
        border.setCenter(gridImg);
        buttonpane.setPadding(new Insets(2, 2, 2, 0));
        border.setBottom(buttonpane);

        border.setRight(condiment);
        Alert a = new Alert(AlertType.NONE);
        hamburger.setOnKeyPressed(e -> {
            if (e.getCode().equals(KeyCode.ENTER)) {
                try {
                    Integer aNum = Integer.parseInt(hamburger.getText());
                    Integer aNum1 = Integer.parseInt(hotdog.getText());
                    Integer aNum2 = Integer.parseInt(frenchfries.getText());


                    if (aNum < 0 || aNum1 < 0 || aNum2 < 0) {
                        cost.setText("Invalid");
                    } else {
                        Integer value1 = Integer.valueOf(hamburger.getText());
                        Integer value2 = Integer.valueOf(hotdog.getText());
                        Integer value3 = Integer.valueOf(frenchfries.getText());


                        Integer r = (value1 * 8) + (value2 * 5) + (value3 * 3);
                        cost.setText("$" + r.toString());

                    }

                } catch (NumberFormatException ee) {
                    cost.setText("Invalid");

                }

            }
        });
        hotdog.setOnKeyPressed(e -> {
            if (e.getCode().equals(KeyCode.ENTER)) {
                try {
                    Integer aNum = Integer.parseInt(hamburger.getText());
                    Integer aNum1 = Integer.parseInt(hotdog.getText());
                    Integer aNum2 = Integer.parseInt(frenchfries.getText());


                    if (aNum < 0 || aNum1 < 0 || aNum2 < 0) {
                        cost.setText("Invalid");
                    } else {
                        Integer value1 = Integer.valueOf(hamburger.getText());
                        Integer value2 = Integer.valueOf(hotdog.getText());
                        Integer value3 = Integer.valueOf(frenchfries.getText());


                        Integer r = (value1 * 8) + (value2 * 5) + (value3 * 3);
                        cost.setText("$" + r.toString());

                    }

                } catch (NumberFormatException ee) {
                    cost.setText("Invalid");

                }

            }
        });
        frenchfries.setOnKeyPressed(e -> {

            if (e.getCode().equals(KeyCode.ENTER)) {
                try {
                    Integer aNum = Integer.parseInt(hamburger.getText());
                    Integer aNum1 = Integer.parseInt(hotdog.getText());
                    Integer aNum2 = Integer.parseInt(frenchfries.getText());


                    if (aNum < 0 || aNum1 < 0 || aNum2 < 0) {
                        cost.setText("Invalid");
                    } else {
                        Integer value1 = Integer.valueOf(hamburger.getText());
                        Integer value2 = Integer.valueOf(hotdog.getText());
                        Integer value3 = Integer.valueOf(frenchfries.getText());


                        Integer r = (value1 * 8) + (value2 * 5) + (value3 * 3);
                        cost.setText("$" + r.toString());

                    }

                } catch (NumberFormatException ee) {
                    cost.setText("Invalid");

                }

            }
        });

        purchase.setOnAction(e -> {

            a.setAlertType(AlertType.ERROR);
            boolean thrown = false;
            String[] intArr = new String[]{hamburger.getText(),
                    hotdog.getText(), frenchfries.getText()};
            for (String i : intArr) {

                try {

                    if (Integer.parseInt(i) < 0) {
                        NegativeQuantityException err = new NegativeQuantityException(i);
                        a.setContentText(err.toString());
                        a.show();
                        thrown = true;

                    }

                } catch (NumberFormatException ee) {
                    IllegalQuantityException err2 = new IllegalQuantityException(i);
                    a.setContentText(err2.toString());
                    a.show();
                    thrown = true;
                }
            }

            if (!thrown) {
                Integer value1 = Integer.valueOf(hamburger.getText());
                Integer value2 = Integer.valueOf(hotdog.getText());
                Integer value3 = Integer.valueOf(frenchfries.getText());


                Integer r = (value1 * 8) + (value2 * 5) + (value3 * 3);
                cost.setText("$" + r.toString());
                try {
                    File receipt = new File("order.txt");
                    PrintWriter print = new PrintWriter(receipt);
                    print.println("----------Receipt-----------");
                    print.println();
                    print.println("Food-------------Quantity---");
                    if (!hamburger.getText().equals("0")) {
                        print.println("Hamburger:          " + hamburger.getText());
                    }
                    if (!hotdog.getText().equals("0")) {
                        print.println("Hotdog:             " + hotdog.getText());
                    }
                    if (!frenchfries.getText().equals("0")) {
                        print.println("French Fries:       " + frenchfries.getText());
                    }
                    print.println("----------------------------");
                    print.println("Total cost: " + cost.getText());
                    print.close();
                } catch (FileNotFoundException ei) {
                    System.out.println("Sorry, the file does not exist");
                }


            }

        });


        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                hamburger.setText("0");
                hotdog.setText("0");
                frenchfries.setText("0");
                cost.setText("0");
            }

        });
        Stage newStage = new Stage();
        Scene newscene = new Scene(border, 657, 345);
        newStage.setTitle("FoodTruck"); // Set the stage title
        newStage.setScene(newscene);
        newStage.setResizable(false); // Place the scene in the stage
        newStage.show(); // Display the stage
    }

    /**
     * Creates a main method .
     *
     * @param args the arguments for the main method/
     */
    public static void main(String[] args) {
        launch(args);
    }
}
