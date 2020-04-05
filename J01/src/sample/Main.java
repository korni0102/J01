package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {
    int samo = 0;
    int spolu = 0;
    int pocet = 0;
    int r ,g ,b;
    int pred = 0;
    char q;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Glow glow = new Glow();
        Group root = new Group();
        HBox hbox = new HBox(10);
        TextField textf = new TextField();
        Button button = new Button("Zmen");
        hbox.getChildren().addAll(textf,button);
        root.getChildren().add(hbox);
        Scene scene = new Scene(root, 750,350,Color.BLACK);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String text = textf.getText();
                for (int i = pred; i < text.length(); i++){
                    q = text.charAt(i);
                    if (q == 'a' || q == 'e' || q == 'i' || q == 'o' || q == 'u'){
                        samo++;
                        pocet++;
                        r = samo*16;
                        System.out.println(q);
                    }
                    if (q == 'b' || q == 'c' || q == 'd' || q == 'f' || q == 'g' || q == 'h' || q == 'j' || q == 'k' ||
                            q == 'l' || q == 'm' || q == 'n' || q == 'p' || q == 'q' || q == 'r' || q == 's' || q == 't' ||
                            q == 'v' || q == 'w' || q == 'z' || q == 'y' || q == 'x') {
                        spolu++;
                        pocet++;
                        g = spolu*24;
                    }
                }
                pred = text.length()-1;
                b = (pocet%25)*10;
                if (r > 255)
                    r = 0;
                scene.setFill(Color.rgb(r,g,b));
            }
        });

        Line l1 = new Line();
        l1.setStartX(50);
        l1.setStartY(100);
        l1.setEndX(100);
        l1.setEndY(100);
        l1.setStroke(Color.VIOLET);
        l1.setStrokeWidth(3);
        glow.setLevel(10);
        l1.setEffect(glow);
        root.getChildren().add(l1);

        Line l2 = new Line();
        l2.setStartX(50);
        l2.setStartY(100);
        l2.setEndX(100);
        l2.setEndY(180);
        l2.setStroke(Color.VIOLET);
        l2.setStrokeWidth(3);
        glow.setLevel(10);
        l2.setEffect(glow);
        root.getChildren().add(l2);

        Line l3 = new Line();
        l3.setStartX(50);
        l3.setStartY(180);
        l3.setEndX(100);
        l3.setEndY(180);
        l3.setStroke(Color.VIOLET);
        l3.setStrokeWidth(3);
        glow.setLevel(10);
        l3.setEffect(glow);
        root.getChildren().add(l3);

        Line l4 = new Line();
        l4.setStartX(50);
        l4.setStartY(180);
        l4.setEndX(65);
        l4.setEndY(155);
        l4.setStroke(Color.VIOLET);
        l4.setStrokeWidth(3);
        glow.setLevel(10);
        l4.setEffect(glow);
        root.getChildren().add(l4);

        Line l5 = new Line();
        l5.setStartX(100);
        l5.setStartY(100);
        l5.setEndX(85);
        l5.setEndY(125);
        l5.setStroke(Color.VIOLET);
        l5.setStrokeWidth(3);
        glow.setLevel(10);
        l5.setEffect(glow);
        root.getChildren().add(l5);

        Line l6 = new Line();
        l6.setStartX(150);
        l6.setStartY(100);
        l6.setEndX(250);
        l6.setEndY(100);
        l6.setStroke(Color.YELLOW);
        l6.setStrokeWidth(3);
        glow.setLevel(10);
        l6.setEffect(glow);
        root.getChildren().add(l6);

        Line l7 = new Line();
        l7.setStartX(250);
        l7.setStartY(100);
        l7.setEndX(235);
        l7.setEndY(120);
        l7.setStroke(Color.YELLOW);
        l7.setStrokeWidth(3);
        glow.setLevel(10);
        l7.setEffect(glow);
        root.getChildren().add(l7);

        Line l8 = new Line();
        l8.setStartX(150);
        l8.setStartY(100);
        l8.setEndX(200);
        l8.setEndY(180);
        l8.setStroke(Color.YELLOW);
        l8.setStrokeWidth(3);
        glow.setLevel(10);
        l8.setEffect(glow);
        root.getChildren().add(l8);

        Line l9 = new Line();
        l9.setStartX(200);
        l9.setStartY(180);
        l9.setEndX(220);
        l9.setEndY(150);
        l9.setStroke(Color.YELLOW);
        l9.setStrokeWidth(3);
        glow.setLevel(10);
        l9.setEffect(glow);
        root.getChildren().add(l9);

        Line l10 = new Line();
        l10.setStartX(235);
        l10.setStartY(120);
        l10.setEndX(210);
        l10.setEndY(120);
        l10.setStroke(Color.YELLOW);
        l10.setStrokeWidth(3);
        glow.setLevel(10);
        l10.setEffect(glow);
        root.getChildren().add(l10);

        Line l11 = new Line();
        l11.setStartX(350);
        l11.setStartY(100);
        l11.setEndX(300);
        l11.setEndY(180);
        l11.setStroke(Color.RED);
        l11.setStrokeWidth(3);
        glow.setLevel(10);
        l11.setEffect(glow);
        root.getChildren().add(l11);

        Line l12 = new Line();
        l12.setStartX(300);
        l12.setStartY(180);
        l12.setEndX(400);
        l12.setEndY(180);
        l12.setStroke(Color.RED);
        l12.setStrokeWidth(3);
        glow.setLevel(10);
        l12.setEffect(glow);
        root.getChildren().add(l12);

        Line l13 = new Line();
        l13.setStartX(400);
        l13.setStartY(180);
        l13.setEndX(365);
        l13.setEndY(120);
        l13.setStroke(Color.RED);
        l13.setStrokeWidth(3);
        glow.setLevel(10);
        l13.setEffect(glow);
        root.getChildren().add(l13);

        Line l14 = new Line();
        l14.setStartX(450);
        l14.setStartY(100);
        l14.setEndX(550);
        l14.setEndY(100);
        l14.setStroke(Color.LIGHTGREEN);
        l14.setStrokeWidth(3);
        glow.setLevel(10);
        l14.setEffect(glow);
        root.getChildren().add(l14);

        Line l15 = new Line();
        l15.setStartX(450);
        l15.setStartY(100);
        l15.setEndX(500);
        l15.setEndY(180);
        l15.setStroke(Color.LIGHTGREEN);
        l15.setStrokeWidth(3);
        glow.setLevel(10);
        l15.setEffect(glow);
        root.getChildren().add(l15);

        Line l16 = new Line();
        l16.setStartX(500);
        l16.setStartY(180);
        l16.setEndX(540);
        l16.setEndY(120);
        l16.setStroke(Color.LIGHTGREEN);
        l16.setStrokeWidth(3);
        glow.setLevel(10);
        l16.setEffect(glow);
        root.getChildren().add(l16);

        Line l17 = new Line();
        l17.setStartX(650);
        l17.setStartY(100);
        l17.setEndX(630);
        l17.setEndY(130);
        l17.setStroke(Color.LIGHTBLUE);
        l17.setStrokeWidth(3);
        glow.setLevel(10);
        l17.setEffect(glow);
        root.getChildren().add(l17);

        Line l18 = new Line();
        l18.setStartX(650);
        l18.setStartY(100);
        l18.setEndX(700);
        l18.setEndY(180);
        l18.setStroke(Color.LIGHTBLUE);
        l18.setStrokeWidth(3);
        glow.setLevel(10);
        l18.setEffect(glow);
        root.getChildren().add(l18);

        Line l19 = new Line();
        l19.setStartX(700);
        l19.setStartY(180);
        l19.setEndX(600);
        l19.setEndY(180);
        l19.setStroke(Color.LIGHTBLUE);
        l19.setStrokeWidth(3);
        glow.setLevel(10);
        l19.setEffect(glow);
        root.getChildren().add(l19);

        Line l20 = new Line();
        l20.setStartX(600);
        l20.setStartY(180);
        l20.setEndX(620);
        l20.setEndY(150);
        l20.setStroke(Color.LIGHTBLUE);
        l20.setStrokeWidth(3);
        glow.setLevel(10);
        l20.setEffect(glow);
        root.getChildren().add(l20);

        Line l21 = new Line();
        l21.setStartX(620);
        l21.setStartY(150);
        l21.setEndX(650);
        l21.setEndY(150);
        l21.setStroke(Color.LIGHTBLUE);
        l21.setStrokeWidth(3);
        glow.setLevel(10);
        l21.setEffect(glow);
        root.getChildren().add(l21);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
