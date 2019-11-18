package nickw64;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/*
 * This is the controller file which controls the program.
 * @author: Nicholis Wright
 * */
// error says it can be package private but it cannot
@SuppressWarnings("WeakerAccess")
public class Controller extends ProductionRecord {

  @FXML public Button addButton;
  @FXML public Button recordProductionButton;
  @FXML private ComboBox<Integer> quantityCombo;
  @FXML private ChoiceBox choiceBox;
  @FXML private TextField txtName;
  @FXML private TextField txtMan;
  @FXML private TextArea ProductionLog;
  @FXML private ObservableList<Product> productLine;
  @FXML private ListView<Product> produceView;
  @FXML private TableView<Product> productView;
  @FXML private TableColumn<?, ?> colProdName;
  @FXML private TableColumn<?, ?> colManName;
  @FXML private TableColumn<?, ?> colProdType;

  /*
  *@author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  product add button
  * */

  /*
  * This method calls the setupProductLineTable to insert items in the table
  * and also calls insertDB() to insert into database
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  product add button
  * */
  public void handleProductAddButton() {
    System.out.println("hopefully this works");
    setupProductLineTable();
    String prodName = txtName.getText();
    String prodMan = txtMan.getText();
    ItemType prodType = (ItemType) choiceBox.getValue();
    Product newProduct = new Product(prodName, prodMan, prodType);
    ProductionRecord newProds = new ProductionRecord(newProduct, 1);

    ProductionLog.appendText(super.toString() + "\n");
    insertDB();
  }

  /*
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  record product button
  * */

  public void handleRecordProductionButton() {
    int prodCount = Integer.parseInt(String.valueOf(quantityCombo.getValue()));
    Product newItem = produceView.getSelectionModel().getSelectedItem();

    for (int num = 1; num <= prodCount; num++) {
      ProductionRecord newProds = new ProductionRecord(newItem, prodCount);

      newProds.setProductID(getProductID() + 1);
      ProductionLog.appendText(newProds.toString() + "\n" + "\n");

      insertDB(newProds);
    }
  }

  /*
   * this method inserts new products to a table view on production log page
   * @author: Nicholis Wright
   * @param
   * */
  private void setupProductLineTable() {

    String prodName = txtName.getText();
    String prodMan = txtMan.getText();
    ItemType prodType = (ItemType) choiceBox.getValue();

    // Product mediaProduct = new Product(prodName,prodMan,prodType);

    produceView.getItems().add(new Product(prodName, prodMan, prodType));

    productLine.add(new Product(prodName, prodMan, prodType));
    productView.setItems(productLine);
  }

  /*
   * @author: Nicholis Wright
   *This method populates the combo box with decimal numbers 1-10
   * also sets up cell factory for observable list and tableview.
   * @param none: no parameters
   * */
  public void initialize() {
    productLine = FXCollections.observableArrayList();
    colProdName.setCellValueFactory(new PropertyValueFactory("Name"));
    colManName.setCellValueFactory(new PropertyValueFactory("Manufacturer"));
    colProdType.setCellValueFactory(new PropertyValueFactory("Type"));

    for (int i = 0; i <= 10; i++) {
      quantityCombo.getItems().add(i);
    }
    quantityCombo.getSelectionModel().selectFirst();
    quantityCombo.setEditable(true);
    for (ItemType it : ItemType.values()) {
      choiceBox.getItems().add(it);
    }
  }
  /*
   * method to insert new items into the database
   * @author: Nicholis Wright
   * @param:none
   * */
  public void insertDB(Product newItem) {
    final String jdbc_driver = "org.h2.Driver";
    final String dbUrl = "jdbc:h2:./res/Production";

    // data base credentials
    Connection conn;
    Statement stmt;

    try {
      // STEP 1: Register JDBC driver
      Class.forName(jdbc_driver);

      // STEP 2: Open a connection
      conn = DriverManager.getConnection(dbUrl);

      // STEP 3: Execute a query
      stmt = conn.createStatement();

      String prodName = txtName.getText();
      String prodMan = txtMan.getText();
      ItemType prodType = (ItemType) choiceBox.getValue();
      Widget newProduct = new Widget(prodName, prodMan, prodType);

      // this inserts the name, manufacturer, and type into product of the database
      String sql =
          "INSERT INTO PRODUCT(NAME,MANUFACTURER, TYPE) "
              + "VALUES (  '"
              + newProduct.getName()
              + "' ,   '"
              + newProduct.getManufacturer()
              + "' , '"
              + prodType
              + "')";
      System.out.println("sql is " + sql);
      stmt.executeUpdate(sql);

      // STEP 4: Clean-up environment
      stmt.close();
      conn.close();

      // catches/handles exception errors
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  public void insertDB() {
    final String jdbc_driver = "org.h2.Driver";
    final String dbUrl = "jdbc:h2:./res/Production";

    // data base credentials
    Connection conn;
    Statement stmt;

    try {
      // STEP 1: Register JDBC driver
      Class.forName(jdbc_driver);

      // STEP 2: Open a connection
      conn = DriverManager.getConnection(dbUrl);

      // STEP 3: Execute a query
      stmt = conn.createStatement();

      String prodName = txtName.getText();
      String prodMan = txtMan.getText();
      ItemType prodType = (ItemType) choiceBox.getValue();
      Widget newProduct = new Widget(prodName, prodMan, prodType);

      // this inserts the name, manufacturer, and type into product of the database
      String sql =
          "INSERT INTO PRODUCT(NAME,MANUFACTURER, TYPE) "
              + "VALUES (  '"
              + newProduct.getName()
              + "' ,   '"
              + newProduct.getManufacturer()
              + "' , '"
              + prodType
              + "')";
      System.out.println("sql is " + sql);
      stmt.executeUpdate(sql);

      // STEP 4: Clean-up environment
      stmt.close();
      conn.close();

      // catches/handles exception errors
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
