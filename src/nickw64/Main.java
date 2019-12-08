package nickw64;

import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *This is the main file of the program.
 * @author: Nicholis Wright
 *
 * */

public class Main extends Application {
  /**
   *This method creates the scene.
   * @author: Nicholis Wright
   *@param  primaryStage: sets scene.
   * */

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("production.fxml"));
    primaryStage.setTitle("Production Line");
    primaryStage.setScene(new Scene(root, 500, 450));
    primaryStage.show();
  }

  /**
   * @author: Nicholis Wright */

  public static void main(String[] args) {
    // 1a
    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.getCodes());
    }

    //TeST FOR REPL.IT CODE
    // 1b
    Product product1 = new Widget("iPod", "Apple", ItemType.AUDIO);
    System.out.println(product1.toString());
    Product product2 = new Widget("Zune", "Microsoft", ItemType.AUDIO);
    System.out.println(product2.toString());

    //TeST FOR REPL.IT CODE
    // 2
    AudioPlayer newProduct = new AudioPlayer("M3U/PLS/WPL");
    System.out.println(newProduct);
    newProduct.play();
    newProduct.stop();
    newProduct.next();
    newProduct.previous();

    //TEST FOR REPL.IT CODE
    // 3a
    Screen s1 = new Screen("600x400", 40, 22);
    System.out.println(s1);

    //TEST FOR REPL.IT CODE
    // 3b
    AudioPlayer newAudioProduct = new AudioPlayer("M3U/PLS/WPL");
    Screen newScreen = new Screen("720x480", 40, 22);
    MoviePlayer newMovieProduct = new MoviePlayer(newScreen);
    ArrayList<MultimediaControl> productList = new ArrayList<>();
    productList.add(newAudioProduct);
    productList.add(newMovieProduct);
    for (MultimediaControl p : productList) {
      System.out.println(p);
      p.play();
      p.stop();
      p.next();
      p.previous();
    }
    // issue #4
    // test constructor used when creating production records from user interface
    int numProduced = 3; // this will come from the combobox in the UI

    for (int productionRunProduct = 0; productionRunProduct < numProduced; productionRunProduct++) {
      ProductionRecord pr = new ProductionRecord(0);
      System.out.println(pr.toString());
    }

    // test constructor used when creating production records from reading database
    ProductionRecord pr = new ProductionRecord(0, 3, "1", new Date());
    System.out.println(pr.toString());

    // testing accessors and mutators
    pr.setProductionNum(1);
    System.out.println(pr.getProductionNum());

    pr.setProductID(4);
    System.out.println(pr.getProductID());

    pr.setSerialNum("2");
    System.out.println(pr.getSerialNum());

    pr.setProdDate(new Date());
    System.out.println(pr.getProdDate());

    //TEST FOR REPL.IT CODE
    // issue #5
    Product productProduced = new Widget("iPod", "Apple", ItemType.AUDIO);

    // test constructor used when creating production records from user interface
    numProduced = 3; // this will come from the combobox in the UI
    int itemCount = 0;

    for (int productionRunProduct = 0; productionRunProduct < numProduced; productionRunProduct++) {
      pr = new ProductionRecord(productProduced, itemCount++);
      // using the iterator as the product id for testing
      System.out.println(pr.toString());
    }

    launch(args);
  }
}
