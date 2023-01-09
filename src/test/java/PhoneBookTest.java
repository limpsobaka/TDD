import org.junit.jupiter.api.Test;
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
}
