import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
//import java.io.IOException;

public class app extends Application {
    @Override
    public void start(Stage stage){
StackPane root = new StackPane();

Text text = new Text("hello, i am Phuc");
text.setFont(Font.font("Arial, 12"));
text.setTranslateX(text.getTranslateX() + 20);

root.getChildren().add(text);
       // FXMLLoader fxmlLoader = new FXMLLoader(app.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 320, 240);
       stage.setScene(scene);  
       stage.setTitle("Hello!");
       stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}