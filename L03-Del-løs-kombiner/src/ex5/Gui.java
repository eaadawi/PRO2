package ex5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {


    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private int i = 1;
    Button incBtn = new Button("+");
    Button decBtn = new Button("-");
    Label lbl = new Label("" + 1);

    private Pane initContent(GridPane pane) {
        pane.setPrefSize(600, 400);

        pane.add(incBtn, 2, 1);
        incBtn.setAlignment(Pos.BASELINE_RIGHT);
        pane.add(decBtn, 0, 1);
        decBtn.setAlignment(Pos.BASELINE_LEFT);
        pane.add(lbl, 1, 1);
        incBtn.setAlignment(Pos.BASELINE_CENTER);

        Pane paneDraw = new Pane();
        pane.add(paneDraw, 0, 0);

        sierpinski(paneDraw,i);

        incBtn.setOnAction(event -> this.incAction(paneDraw));
        decBtn.setOnAction(event -> this.decAction(paneDraw));

        return pane;
    }

    // ------------------------------------------------------------------------


    private void drawTriangle(int h, int x, int y, Pane pane) {
        Line l1 = new Line(x, y, x+2*h, y);
        Line l2 = new Line(x+2*h, y, x+h, y-h);
        Line l3 = new Line(x+h, y-h, x, y);
        pane.getChildren().add(l1);
        pane.getChildren().add(l2);
        pane.getChildren().add(l3);
    }

    private void sierpinski(int h, int x, int y, Pane pane, int i) {
        drawTriangle(h, x, y, pane);
        i--;
        if(i>0) {
            sierpinski(h / 2, x, y, pane, i);
            sierpinski(h / 2, x + h, y, pane, i);
            sierpinski(h / 2, x + h / 2, y - h / 2, pane, i);
        }
    }

    public void sierpinski(Pane pane, int i) {
        sierpinski(256, 50,300,pane, i);
    }

    private void incAction(Pane pane) {
        if(i < 8)
            i++;
        pane.getChildren().clear();
        lbl.setText(""+i);
        sierpinski(pane,i);
    }

    private void decAction(Pane pane) {
        if(i > 1)
            i--;
        pane.getChildren().clear();
        lbl.setText(""+i);
        sierpinski(pane,i);
    }
}
