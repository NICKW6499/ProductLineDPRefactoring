package nickw64;

import java.util.Date;

/**
 * Production record class contains methods and constructors. to enable production recording
 *
 * @author: Nicholis Wright
 */
public class ProductionRecord extends Product {
  private int productionNumber;
  private int productID;
  private String serialNumber;
  private Date dateProduced;

  /**
   * Default constructor for production records.
   *
   * @author: Nicholis Wright
   */
  ProductionRecord() {
    this.productionNumber = 0;
    this.productID = 0;
    this.serialNumber = "1";
    setProdDate(new Date());
  }

  /**
   * Constructor using a product id.
   *
   * @author: Nicholis Wright
   * @param productID : used to get info of a specific product
   */
  public ProductionRecord(int productID) {
    setProductID(productID);
    setProdDate(new Date());
  }

  /**
   * Constructor using a product and count to make unique serial numbers.
   *
   * @author: Nicholis Wright
   * @param product : passes in a product to use unique info for a serial number
   * @param count : control the "count" of a specific type of product
   */
  public ProductionRecord(Product product, int count) {
    for (int i = 0; i < count; i++) {
      setProdDate(new Date());
      this.productionNumber = getProductionNum() + i;
      setProductID(product.getId() + i);

      String idNumber = String.format("%05d", productID);
      try {
        this.serialNumber =
            product.getManufacturer().substring(0, 3) + product.getType().getCodes() + idNumber;
      } catch (Exception e) {
        System.out.println("Invalid object");
      }
    }
  }

  /**
   * Constructor for 4 parameters.
   *
   * @author: Nicholis Wright
   * @param productionNumber : product number
   * @param productID : product ID
   * @param serialNumber : serial number
   * @param dateProduced : current date
   */
  public ProductionRecord(
      int productionNumber, int productID, String serialNumber, Date dateProduced) {
    setProductionNum(productionNumber);
    setProductID(productID);
    setSerialNum(serialNumber);
    setProdDate(dateProduced);
  }

  /**
   * ToString method compiles info into a product statement.
   *
   * @author: Nicholis Wright
   */
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

  /**
   * Retrieves dateProduced var.
   *
   * @author: Nicholis Wright
   * @return dateProduced: returns current date.
   */
  public Date getProdDate() {
    return dateProduced;
  }

  /**
   * Assign a value to dateProduced.
   *
   * @author : Nicholis Wright
   * @param date : passes in current date
   */
  public void setProdDate(Date date) {
    this.dateProduced = date;
  }

  /**
   * Return serialNumber.
   *
   * @author: Nicholis Wright
   * @return serialNumber: return value of serialNumber.
   */
  public String getSerialNum() {
    return serialNumber;
  }

  /**
   * Assign value to serialNumber.
   *
   * @author : Nicholis Wright
   * @param s : passes in serialNumber for class var.
   */
  public void setSerialNum(String s) {
    this.serialNumber = s;
  }

  /**
   * Return product ID.
   *
   * @author: Nicholis Wright
   * @return productID: return value of productID.
   */
  public int getProductID() {
    return productID;
  }

  /**
   * Assign value to productID.
   *
   * @author: Nicholis Wright
   * @param productID : assigns argument to productID var.
   */
  public void setProductID(int productID) {
    this.productID = productID;
  }

  /**
   * Return product number.
   *
   * @author: Nicholis Wright
   * @return productionNumber: return value of productionNumber.
   */
  public int getProductionNum() {
    return productionNumber;
  }

  /**
   * Assign production number.
   *
   * @author : Nicholis Wright
   * @param i : assign parameter to class var.
   */
  public void setProductionNum(int i) {
    this.productionNumber = i;
  }
}
