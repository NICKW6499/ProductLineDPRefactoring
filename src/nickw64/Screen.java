package nickw64;

/**
 * Class screen builds a screen object
 *
 * @author: Nicholis Wright
 */
public class Screen implements ScreenSpec {
  private String resolution;
  private int refreshRate;
  private int responseTime;

  /**
   * 3 parameter constructor to build a screen
   *
   * @author: Nicholis Wright
   * @param resolution: resolution of screen
   * @param refreshRate: refresh rate of screen
   * @param responseTime: response time of screen
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    setResolution(resolution);
    setRefreshRate(refreshRate);
    setResponseTime(responseTime);
  }

  /**
   * This returns the resolution
   *
   * @author: Nicholis Wright
   * @return resolution: returns resolution of screen
   */
  public String getResolution() {
    return resolution;
  }

  /**
   * This method assigns the resolution of a screen
   *
   * @author: Nicholis Wright
   * @param resolution: assigns resolution value
   */
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  /**
   * This method returns the refreshRate
   *
   * @author: Nicholis Wright
   * @return refreshRate: returns refresh rate value
   */
  public int getRefreshRate() {
    return refreshRate;
  }

  /**
   * Set refresh rate.
   *
   * @author: Nicholis Wright
   * @param refreshRate: assigns passed value to refreshRate
   */
  public void setRefreshRate(int refreshRate) {
    this.refreshRate = refreshRate;
  }

  /**
   * This method returns the response time of a screen
   *
   * @author: Nicholis Wright
   */
  public int getResponseTime() {
    return responseTime;
  }

  /**
   * Sets the response time of a screen to responseTime
   *
   * @author: Nicholis Wright
   * @param responseTime: assigns parameter value to class attribute.
   */
  public void setResponseTime(int responseTime) {
    this.responseTime = responseTime;
  }

  /**
   * toString method compiles an item statement about the screen.
   *
   * @author: Nicholis Wright
   */
  public String toString() {
    return "Screen: \n"
        + "Resolution : "
        + getResolution()
        + "\n"
        + "Refresh rate : "
        + getRefreshRate()
        + "\n"
        + "Response time : "
        + getResponseTime();
  }
}
