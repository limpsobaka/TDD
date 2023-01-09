import java.util.*;

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

  public String findByNumber(String number) {
    if (PHONEBOOK.containsValue(number)) {
      return PHONEBOOK.entrySet().stream().filter(x -> x.getValue().contains(number)).findFirst().get().getKey();
    }
    return null;
  }

  public String findByName(String name) {
    return PHONEBOOK.get(name);
  }

  public List<String> printAllNames() {
    List<String> result = new ArrayList<>(PHONEBOOK.keySet());
    return result;
  }
}
