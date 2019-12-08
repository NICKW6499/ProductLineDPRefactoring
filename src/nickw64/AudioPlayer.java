package nickw64;

/**
 * This class constructs audioplayers.
 *
 * @author: Nicholis Wright
 */
public class AudioPlayer extends Product implements MultimediaControl {

  private static String supportedAudioFormats;
  private static String supportedPlaylistFormats;

  /**
   * Default constructor for audio players.
   *
   * @author: Nicholis Wright
   */
  AudioPlayer() {
    setSupportedAudioFormats();
    setSupportedPlaylistFormats();
  }

  /**
   * 4 parameter constructor for audio players.
   *
   * @author: Nicholis Wright
   * @param supportedPlaylistFormat supportedPlaylistFormat: supported playlist formats
   */
  AudioPlayer(@SuppressWarnings("SameParameterValue") String supportedPlaylistFormat) {
    super("DP-X1A", "Onkyo", ItemType.AUDIO);
    AudioPlayer.supportedAudioFormats = "DSD/FLAC/ALAC/WAV/AIFF/MQA/Ogg-Vorbis/MP3/AAC";
    AudioPlayer.supportedPlaylistFormats = supportedPlaylistFormat;
  }

  /**
   * Method to print playing.
   *
   * @author: Nicholis Wright
   */
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Method to print stopping.
   *
   * @author: Nicholis Wright
   */
  public void stop() {
    System.out.println("Stopping");
  }

  /**
   * Method to print previous.
   *
   * @author: Nicholis Wright
   */
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Method to print next.
   *
   * @author: Nicholis Wright
   */
  public void next() {
    System.out.println("Next");
  }

  /**
   * accessor for supported audio formats var.
   *
   * @author: Nicholis Wright
   */
  public String getSupportedAudioFormats() {
    return supportedAudioFormats;
  }

  /**
   * This is the mutator method for audio formats.
   *
   * @author: Nicholis Wright
   */
  public void setSupportedAudioFormats() {
    supportedAudioFormats = "unknown";
  }

  /**
   * This is accessor for playlist formats variable.
   *
   * @author: Nicholis Wright
   */
  public String getSupportedPlaylistFormats() {
    return supportedPlaylistFormats;
  }

  /**
   * This is the mutator for the playlist formats var.
   *
   * @author: Nicholis Wright
   */
  public void setSupportedPlaylistFormats() {
    supportedPlaylistFormats = "unknown";
  }

  /**
   * toString method to compile an object statement.
   *
   * @author: Nicholis Wright
   */
  public String toString() {
    return super.toString()
        + "Supported Audio Formats: "
        + getSupportedAudioFormats()
        + "\n"
        + "Supported Playlist Formats: "
        + getSupportedPlaylistFormats();
  }
}
