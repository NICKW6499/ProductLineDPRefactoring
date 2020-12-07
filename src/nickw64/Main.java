package nickw64;

import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This is the main file of the program.
 *
 * @author: Nicholis Wright
 */
public class Main extends Application {
  /** @author: Nicholis Wright */
  public static void main(String[] args) {
       launch(args);
  }

  /**
   * This method creates the scene.
   *
   * @author: Nicholis Wright
   * @param primaryStage: sets scene.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("production.fxml"));
    primaryStage.setTitle("Production Line");
    primaryStage.setScene(new Scene(root, 500, 450));
    primaryStage.show();
  }
}
