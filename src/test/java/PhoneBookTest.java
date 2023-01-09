import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
  PhoneBook phoneBook = PhoneBook.getINSTANCE();
  @Test
  public void testAdd() {
    //assert
    int expected = 2;
    int result;

    //act
    phoneBook.add("Petya", "79102356789");
    result = phoneBook.add("Vasya", "79102356489");

    //assert
    assertEquals(expected, result);
  }

  @Test
  public void testAddDublicatedNames() {
    //assert
    int expected = 2;
    int result;

    //act
    phoneBook.add("Petya", "79102356789");
    phoneBook.add("Petya", "79252356782");
    result = phoneBook.add("Vasya", "79102356489");

    //assert
    assertEquals(expected, result);
  }

  @Test
  public void testFindByNumber() {
    //assert
    String expected = "Petya";
    String result;
    phoneBook.add("Petya", "79102356789");
    phoneBook.add("Petya", "79252356782");
    phoneBook.add("Vasya", "79102356489");

    //act
    result = phoneBook.findByNumber( "79102356789");

    //assert
    assertEquals(expected, result);
  }

  @Test
  public void testFindByName() {
    //assert
    String expected = "79102356489";
    String result;
    phoneBook.add("Petya", "79102356789");
    phoneBook.add("Petya", "79252356782");
    phoneBook.add("Vasya", "79102356489");

    //act
    result = phoneBook.findByName("Vasya");

    //assert
    assertEquals(expected, result);
  }

  @Test
  public void testPrintAllNames() {
    //assert
    List<String> expected = new ArrayList<>();
    expected.add("Vasya");
    expected.add("Petya");
    expected.sort(Comparator.naturalOrder());

    List<String> result;
    phoneBook.add("Petya", "79102356789");
    phoneBook.add("Petya", "79252356782");
    phoneBook.add("Vasya", "79102356489");

    //act
    result = phoneBook.printAllNames();

    //assert
    assertEquals(expected, result);
  }
}
