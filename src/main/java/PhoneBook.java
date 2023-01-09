import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBook {
  private static PhoneBook INSTANCE;
  private final SortedMap<String, String> PHONEBOOK = new TreeMap<>();

  private PhoneBook() {
  }

  public static PhoneBook getINSTANCE() {
    if (INSTANCE == null) {
      INSTANCE = new PhoneBook();
    }
    return INSTANCE;
  }

  public int add(String name, String number) {
    if (PHONEBOOK.get(name) == null) {
      PHONEBOOK.put(name, number);
    }
    return PHONEBOOK.size();
  }
}
