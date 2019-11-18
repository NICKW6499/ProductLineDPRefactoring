package nickw64;

import java.util.Date;

/*
 *Production record class contains methods and constructors
 * to enable production recording
 * @author: Nicholis Wright
 * extends product to gain access to product vars
 * */
public class ProductionRecord extends Product {
  private int productionNumber;
  private int productID;
  private String serialNumber;
  private Date dateProduced;

  /*
   * Default constructor for production records
   * @author: Nicholis Wright
   * @param -none
   * */
  ProductionRecord() {
    this.productionNumber = 0;
    this.productID = 0;
    this.serialNumber = "1";
    setProdDate(new Date());
  }

  /*
   *constructor using a product id
   * @author: Nicholis Wright
   * @param int productID: used to get info of a specific product
   * */
  public ProductionRecord(int productID) {
    setProductID(productID);
    setProdDate(new Date());
  }

  /*
   * Constructor using a product and count to make unique serial numbers
   * @author: Nicholis Wright
   * @param Product product: passes in a product to use unique info for a serial number
   * @param int count: control the "count" of a specific type of product
   * */
  public ProductionRecord(Product product, int count) {
    for (int i = 0; i < count; i++) {
      setProdDate(new Date());
      this.productionNumber = getProductionNum() + i;
      setProductID(product.getId()+ i);

      String idNumber = String.format("%05d", productID);

      this.serialNumber =
          product.getManufacturer().substring(0, 3) + product.getType().getCodes() + idNumber;
      }
    }


  /*
   * Constructor for 4 parameters
   * @author: Nicholis Wright
   * @param int ProductionNumber: product number
   * @param int productID: product ID
   * @param String serialNumber: serial number
   * @param Date dateProduced: current date
   * */
  public ProductionRecord(
      int productionNumber, int productID, String serialNumber, Date dateProduced) {
    setProductionNum(productionNumber);
    setProductID(productID);
    setSerialNum(serialNumber);
    setProdDate(dateProduced);
  }

  /*
   * toString method compiles info into a product statement
   * @author: Nicholis Wright
   * @param: none
   * */
  @Override
  public String toString() {

    return "Prod. Num: "
        + getProductionNum()
        + " Product ID: "
        + getProductID()
        + " Serial Num: "
        + getSerialNum()
        + " Date: "
        + getProdDate();
  }

  /*
   *Retrieves dateProduced var
   * @author: Nicholis Wright
   * @return dateProduced: returns current date.
   * */
  public Date getProdDate() {
    return dateProduced;
  }
  /*
   * assign a value to dateProduced
   * @author: Nicholis Wright
   * @param Date date: passes in current date
   * */
  public void setProdDate(Date date) {
    this.dateProduced = date;
  }

  /*
   * assign value to serialNumber
   * @author: Nicholis Wright
   * @param String serialNumber: passes in serialNumber for class var.
   * */
  public void setSerialNum(String s) {
    this.serialNumber = s;
  }

  /*
   * return serialNumber
   * @author: Nicholis Wright
   * @return serialNumber: return value of serialNumber.
   * */
  public String getSerialNum() {
    return serialNumber;
  }

  /*
   * assign value to productID
   * @author: Nicholis Wright
   * @param int productID: assigns argument to productID var.
   * */
  public void setProductID(int productID) {
    this.productID = productID;
  }

  /*
   * return product ID
   * @author: Nicholis Wright
   * @return productID: return value of productID.
   * */
  public int getProductID() {
    return productID;
  }

  /*
   * return product number
   * @author: Nicholis Wright
   * @return productionNumber: return value of productionNumber.
   * */
  public int getProductionNum() {
    return productionNumber;
  }

  /*
   * assign production number
   * @author: Nicholis Wright
   * @param int productionNumber: assign parameter to class var.
   * */
  public void setProductionNum(int i) {
    this.productionNumber = i;
  }
}
