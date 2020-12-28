package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class Main extends Application {
    int count = 0;
    @Override
    public void start(Stage primaryStage) {
        final Button btn = new Button("CLICK ME");
        final Label label = new Label();

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                count++;
                if(count == 8){
                    label.setText("That\'s enough!");
                    btn.setDisable(true);
                }
            }
        });
        btn.setLayoutX(105);
        btn.setLayoutY(90);
        label.setLayoutX(105);
        label.setLayoutY(125);
        Pane root = new Pane();
        root.getChildren().add(btn);
        root.getChildren().add(label);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Disable Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
