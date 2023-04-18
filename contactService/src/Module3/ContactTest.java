package Module3;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

  @Test
  void testContactClass() {
    Contact student = new Contact(
      "2h4jd7dt27",
      "Tom",
      "Jones",
      "7706751235",
      "555 Mockingbird Lane"
    );

    assertTrue(student.getContactId() == "2h4jd7dt27");
    assertTrue(student.getFirstName() == "Tom");
    assertTrue(student.getLastName() == "Jones");
    assertTrue(student.getPhone() == "7706751235");
    assertTrue(student.getAddress() == "555 Mockingbird Lane");
  }

  @Test
  void testFirstNameLengthTooLong() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact(
          "465464",
          "JohnnyeRays",
          "Green",
          "7702367652",
          "123 1st Street"
        );
      }
    );
  }

  @Test
  void testFirstNameNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact("465464", null, "Green", "7702367652", "123 1st Street");
      }
    );
  }

  @Test
  void testLastNameLengthTooLong() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact(
          "465464",
          "Johnny",
          "Constantinople",
          "7702367652",
          "123 1st Street"
        );
      }
    );
  }

  @Test
  void testLastNameNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact("465464", "Johnny", null, "7702367652", "123 1st Street");
      }
    );
  }

  @Test
  void phoneNumberExactlyTen() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact("465464", "Johnny", "Cons", "770236765", "123 1st Street");
      }
    );
  }

  @Test
  void phoneNumberNotNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact("465464", "Johnny", "Cons", null, "123 1st Street");
      }
    );
  }

  @Test
  void addressFieldTooLong() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact(
          "465464",
          "Johnny",
          "Cons",
          "7702367652",
          "2987 Alpharetta Highway, Canton"
        );
      }
    );
  }

  @Test
  void addressFieldNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact("465464", "Johnny", "Cons", "7702367652", null);
      }
    );
  }

  @Test
  void contactIdGreaterThanTenChars() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact(
          "mo9uht546t9",
          "Johnny",
          "Cons",
          "7702367652",
          "555 MockingBird Lane"
        );
      }
    );
  }

  @Test
  void contactIdNotNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Contact(
          null,
          "Johnny",
          "Cons",
          "7702367652",
          "555 MockingBird Lane"
        );
      }
    );
  }
}
