package nickw64;

/*
 * This class builds movie players.
 * @author: Nicholis Wright
 * */
public class MoviePlayer extends Product implements MultimediaControl {
  private Screen screen;
  private MonitorType monitorType;

  /*
   * This is the default constructor for MoviePlayer
   * @author: Nicholis Wright
   * */
  MoviePlayer() {
    setScreen(getScreen());
  }

  /*
   * This is a 4 parameter constructor for MoviePlayer
   * @author: Nicholis Wright
   * @param String name: product name
   * @param String manufacturer: manufacturer name
   * @param Screen screen: screen object
   * @param MonitorType monitorType: type of monitor
   * */
  MoviePlayer(Screen screen) {
    super("DBPOWER MK101", "OracleProduction", ItemType.VISUAL);
    setScreen(screen);
    setMonitorType(MonitorType.LCD);
  }

  /*
   * toString method compiles an item statement.
   * @author: Nicholis Wright
   * @param: none
   * */
  public String toString() {
    return super.toString() + getScreen() + "\n" + "Monitor Type: " + getMonitorType();
  }

  /*
   * play method plays movie.
   * @author: Nicholis Wright
   * @param: none
   * */
  public void play() {
    System.out.println("Playing movie");
  }

  /*
   * stop method stops movie.
   * @author: Nicholis Wright
   * @param: none
   * */
  public void stop() {
    System.out.println("Stopping movie");
  }

  /*
   *previous method plays last movie
   * @author: Nicholis Wright
   * @param: none
   * */
  public void previous() {
    System.out.println("Previous movie");
  }

  /*
   * next method plays next movie.
   * @author: Nicholis Wright
   * @param
   * */
  public void next() {
    System.out.println("Next movie");
  }

  /*
   * getScreen method returns screen info
   * @author: Nicholis Wright
   * @return screen: returns screen object
   * */

  private Screen getScreen() {
    return screen;
  }

  /*
   * This method assigns a passed in value to screen
   * @author: Nicholis Wright
   * @param Screen screen: assigns parameter value to screen
   * */
  private void setScreen(Screen screen) {
    this.screen = screen;
  }

  /*
   * This method returns the monitor type
   * @author: Nicholis Wright
   * @return monitorType: returns attribute of monitorType
   * */
  private MonitorType getMonitorType() {
    return monitorType;
  }

  /*
   * This sets a passed in value to monitorType
   * @author: Nicholis Wright
   * @param MonitorType monitorType: type of monitor
   * */
  private void setMonitorType(MonitorType monitorType) {
    this.monitorType = monitorType;
  }
}
