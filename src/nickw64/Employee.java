package nickw64;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class creates employees.
 *
 * @author: Nicholis Wright
 */
public class Employee {

  private StringBuilder name;
  private String username;
  private String password;
  private String email;

  /**
   * @author: Nicholis Wright
   * @param name : name of employee
   * @param password : password entered
   */
  public Employee(String name, String password) {
    this.name = new StringBuilder(name);
    if (checkName(name)) {

      setUsername(name);
      setEmail(name);

    } else {

      username = "default";
      email = "user@oracleacademy.Test";
    }
    this.password = password;
  }

  /**
   * This method sets the email of the user.
   *
   * @author: Nicholis Wright
   * @param name: name of user
   */
  private void setEmail(String name) {

    Pattern nameBeforeSpace =
        Pattern.compile("(.*)\\s", Pattern.MULTILINE); // passes in regex to check for spaces

    Matcher nameBeforeSpaceMatch =
        nameBeforeSpace.matcher(name); // passes in name to compare with regex codes

    nameBeforeSpaceMatch.find();
    String firstName = nameBeforeSpaceMatch.group(1);

    Pattern nameAfterSpace = Pattern.compile("\\s(.*)", Pattern.MULTILINE);
    Matcher nameAfterSpaceMatch = nameAfterSpace.matcher(name);

    nameAfterSpaceMatch.find();
    String lastName = nameAfterSpaceMatch.group(1);

    this.email = firstName + "." + lastName + "@oracleacademy.Test";
  }

  /**
   * This method sets the username after checking if it complies to standards.
   *
   * @author: Nicholis Wright
   * @param name : name entered by employee
   */
  private void setUsername(String name) {

    Pattern afterSpace =
        Pattern.compile("\\s(.*)", Pattern.MULTILINE); // creates a pattern to check for spaces
    Matcher afterSpaceMatcher =
        afterSpace.matcher(name); // compares pattern to name for space checking

    afterSpaceMatcher.find();
    String lastName = afterSpaceMatcher.group(1);

    this.username = name.substring(0, 1) + lastName;
  }

  /**
   * This method checks the name entered by the user for a space.
   *
   * @author: Nicholis Wright
   * @param name: Name entered by user
   * @return
   */
  private boolean checkName(String name) {

    Pattern pattern = Pattern.compile("\\s");
    Matcher matcher = pattern.matcher(name);

    return matcher.find();
  }

  /**
   * This method returns a string of employee attributes
   *
   * @author: Nicholis Wright
   * @return
   */
  public String toString() {
    return "Employee Details\n"
        + "Name : "
        + name
        + "\n"
        + "Username : "
        + username
        + "\n"
        + "Email : "
        + email
        + "\n"
        + "Initial Password : "
        + password;
  }
}
