package nickw64;

/**
 * Class ItemType is an enum for the type of a product.
 * @author: Nicholis Wright
 * */
public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  private final String codes;

  /**
   * Constructor turns item type into a string var.
   * @author: Nicholis Wright
   * @param  c: assigns c to class var.
   * */
  ItemType(String c) {
    codes = c;
  }

  /**
   * getCodes method returns item codes.
   * @author : Nicholis Wright
   * @return codes : represents item code.
   * */
  public String getCodes() {
    return this.codes;
  }
}
