import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

public class MagicSquare extends Application{
    private TextField square1, square2, square3, square4, square5, square6, square7, square8, square9;

    public void start(Stage stage) throws Exception{

        stage.setTitle("Magic Square");
        stage.setWidth(400);
        stage.setHeight(600);
        stage.setMinWidth(350);
        stage.setMinHeight(450);

        BorderPane mainPane = new BorderPane();
        GridPane squarePane = new GridPane();

        Button btnCheck = new Button("Check!");
        Button btnShow = new Button("Show sums");
        Button btnHide = new Button("Hide sums");

        Label lblResult = new Label();

        HBox boxBtns = new HBox();
        VBox boxControls = new VBox();

        boxBtns.getChildren().addAll(btnShow, btnCheck, btnHide);
        boxControls.getChildren().addAll(boxBtns, lblResult);

        mainPane.setCenter(squarePane);
        mainPane.setBottom(boxControls);

        boxControls.setAlignment(Pos.CENTER);
        boxBtns.setAlignment(Pos.CENTER);
        squarePane.setAlignment(Pos.CENTER);

        squarePane.setHgap(20);
        squarePane.setVgap(20);

        boxBtns.setMargin(btnCheck, new Insets(0, 20, 0, 20));
        boxControls.setMargin(lblResult, new Insets(10, 0, 20, 0));

        //Magic square
        square1 = new TextField();
        squarePane.add(square1, 0, 0);
        square2 = new TextField();
        squarePane.add(square2, 1, 0);
        square3 = new TextField();
        squarePane.add(square3, 2, 0);
        square4 = new TextField();
        squarePane.add(square4, 0, 1);
        square5 = new TextField();
        squarePane.add(square5, 1, 1);
        square6 = new TextField();
        squarePane.add(square6, 2, 1);
        square7 = new TextField();
        squarePane.add(square7, 0, 2);
        square8 = new TextField();
        squarePane.add(square8, 1, 2);
        square9 = new TextField();
        squarePane.add(square9, 2, 2);

        Label lblrow1 = new Label();
        squarePane.add(lblrow1, 3, 0);
        lblrow1.getStyleClass().add("sum");
        Label lblrow2 = new Label();
        squarePane.add(lblrow2, 3, 1);
        lblrow2.getStyleClass().add("sum");
        Label lblrow3 = new Label();
        squarePane.add(lblrow3, 3, 2);
        lblrow3.getStyleClass().add("sum");
        Label lblcolumn1 = new Label();
        squarePane.add(lblcolumn1, 0, 3);
        lblcolumn1.getStyleClass().add("sum");
        Label lblcolumn2 = new Label();
        squarePane.add(lblcolumn2, 1, 3);
        lblcolumn2.getStyleClass().add("sum");
        Label lblcolumn3 = new Label();
        squarePane.add(lblcolumn3, 2, 3);
        lblcolumn3.getStyleClass().add("sum");

        squarePane.setHalignment(lblcolumn1, HPos.CENTER);
        squarePane.setHalignment(lblcolumn2, HPos.CENTER);
        squarePane.setHalignment(lblcolumn3, HPos.CENTER);
        //Magic square
        
        //Event Handler
        HandleClickCheck handlerCheck = new HandleClickCheck();

        handlerCheck.setTxtSquare1(square1);
        handlerCheck.setTxtSquare2(square2);
        handlerCheck.setTxtSquare3(square3);
        handlerCheck.setTxtSquare4(square4);
        handlerCheck.setTxtSquare5(square5);
        handlerCheck.setTxtSquare6(square6);
        handlerCheck.setTxtSquare7(square7);
        handlerCheck.setTxtSquare8(square8);
        handlerCheck.setTxtSquare9(square9);
        handlerCheck.setLblResult(lblResult);

        btnCheck.addEventFilter(MouseEvent.MOUSE_CLICKED, handlerCheck);
        
        HandleClickShow handlerShow = new HandleClickShow();

        handlerShow.setTxtSquare1(square1);
        handlerShow.setTxtSquare2(square2);
        handlerShow.setTxtSquare3(square3);
        handlerShow.setTxtSquare4(square4);
        handlerShow.setTxtSquare5(square5);
        handlerShow.setTxtSquare6(square6);
        handlerShow.setTxtSquare7(square7);
        handlerShow.setTxtSquare8(square8);
        handlerShow.setTxtSquare9(square9);
        handlerShow.setRow1(lblrow1);
        handlerShow.setRow2(lblrow2);
        handlerShow.setRow3(lblrow3);
        handlerShow.setColumn1(lblcolumn1);
        handlerShow.setColumn2(lblcolumn2);
        handlerShow.setColumn3(lblcolumn3);
        handlerShow.setLblResult(lblResult);

        btnShow.addEventFilter(MouseEvent.MOUSE_CLICKED, handlerShow);

        HandleClickHide handlerHide = new HandleClickHide();

        handlerHide.setRow1(lblrow1);
        handlerHide.setRow2(lblrow2);
        handlerHide.setRow3(lblrow3);
        handlerHide.setColumn1(lblcolumn1);
        handlerHide.setColumn2(lblcolumn2);
        handlerHide.setColumn3(lblcolumn3);

        btnHide.addEventFilter(MouseEvent.MOUSE_CLICKED, handlerHide);
        //Event Handler

        Scene scene = new Scene(mainPane);
        scene.getStylesheets().add(getClass().getResource("Styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}