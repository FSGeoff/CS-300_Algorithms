package Module4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class TaskTest {

  @org.junit.jupiter.api.Test
  void testIdTooLong() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        Task task = new Task("12345678901", "Geoff", "A top notch student");
      }
    );
  }

  @org.junit.jupiter.api.Test
  void testIdNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Task(null, "Geoff", "A top notch student");
      }
    );
  }

  @org.junit.jupiter.api.Test
  void testNameTooLong() {
    assertThrows(
      IllegalArgumentException.class,
      () -> {
        Task task = new Task(
          "34527t5",
          "GeoffreyInikoInityKik",
          "A top notch student"
        );
      }
    );
  }

  @org.junit.jupiter.api.Test
  void testNameNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Task("34527t5", null, "A top notch student");
      }
    );
  }

  @org.junit.jupiter.api.Test
  void testAddressTooLong() {
    assertThrows(
      IllegalArgumentException.class,
      () -> {
        Task task = new Task(
          "34527t5",
          "Geoff",
          "Now is the time for all men to come together as one"
        );
      }
    );
  }

  @org.junit.jupiter.api.Test
  void testAddressNull() {
    Assertions.assertThrows(
      IllegalArgumentException.class,
      () -> {
        new Task(null, "Geoff", "A top notch student");
      }
    );
  }
}
