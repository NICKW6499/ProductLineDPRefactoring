package nickw64;
/**
 * * This class is for building products
 *
 * @author: Nicholis Wright
 */
public class Product implements Item {
  public int id;
  private ItemType type;
  private String manufacturer;
  private String name;

  /**
   * * Default constructor for Product
   *
   * @author: Nicholis Wright
   */
  Product() {
    setId(1);
    setType(ItemType.AUDIO);
    setManufacturer("unknown");
    setName("unknown");
  }

  /**
   * * 3 param constructor for Product (overloaded)
   *
   * @author: Nicholis Wright
   * @param name: name of product
   * @param manufacturer: name of manufacturer
   * @param type: type of product
   */
  Product(String name, String manufacturer, ItemType type) {
    setName(name);
    setManufacturer(manufacturer);
    setType(type);
    setId(1);
  }

  /**
   * * toString method compiles a product statement
   *
   * @author: Nicholis Wright
   */
  public String toString() {
    return "Name: "
        + getName()
        + "\n"
        + "Manufacturer: "
        + getManufacturer()
        + "\n"
        + "Type: "
        + getType()
        + "\n";
  }

  /**
   * * Gets id of product
   *
   * @author: Nicholis Wright
   * @return Id: id of product
   */
  public int getId() {
    return id;
  }

  /**
   * * This method sets id of product.
   *
   * @author: Nicholis Wright
   * @param id: id code of product
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * * This returns the manufacturer name.
   *
   * @author: Nicholis Wright
   * @return Manufacturer: return manufacturer name
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * * This sets the manufacturer name.
   *
   * @author: Nicholis Wright
   * @param manufacturer: name of manufacturer passed in.
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * * This returns the name of a product.
   *
   * @author: Nicholis Wright
   * @return Name: returns product name
   */
  public String getName() {
    return name;
  }

  /**
   * * This sets a name for the product.
   *
   * @author: Nicholis Wright
   * @param name: passed in name of product to set.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * * This method returns the item type of a product
   *
   * @author: Nicholis Wright
   * @return Type: returns type of product
   */
  public ItemType getType() {
    return type;
  }

  /**
   * * This method sets the item type
   *
   * @author: Nicholis Wright
   * @param type: assigns the passed info to the new type.
   */
  public void setType(ItemType type) {
    this.type = type;
  }
}

/**
 * * This class builds a "widget" like a test product
 *
 * @author: Nicholis Wright
 */
class Widget extends Product {

  /**
   * * This Constructor builds a 4 param object and calls constructor of superClass.
   *
   * @author: Nicholis Wright
   */
  Widget(String name, String manufacturer, ItemType type) {
    super(name, manufacturer, type);
  }
}
