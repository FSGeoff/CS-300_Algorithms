package Module3;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

  @Test
  void testAddContactsWithUniqueId() {
    Contact student = new Contact(
            "ewy764geuy",
            "Tom",
            "Jones",
            "7706751235",
            "555 Mockingbird Lane"
    );
    assertTrue(student.getContactId() == "ewy764geuy");
    assertTrue(student.getFirstName() == "Tom");
    assertTrue(student.getLastName() == "Jones");4
    assertTrue(student.getPhone() == "7706751235");
    assertTrue(student.getAddress() == "555 Mockingbird Lane");

  }

  @Test
  void testDeleteContactsPerContactId() {
    ContactService student = new ContactService(
            "ewy764geuy",
            "Tom",
            "Jones",
            "7706751235",
            "555 Mockingbird Lane"
    );

    assertTrue(student.deleteContactById(student.getContactId()));
  }







  @Test
  void testUpdateContactFirstNamePerId() {
    ContactService student = new ContactService(
            "ewy764geuy",
            "Tom",
            "Jones",
            "7706751235",
            "555 Mockingbird Lane"
    );

    assertTrue(student.updateContactFirstName("ewy764geuy", "Bob"));

  }

  @Test
  void testUpdateContactLastNamePerId() {
    ContactService student = new ContactService(
            "ewy764geuy",
            "Tom",
            "Jones",
            "7706751235",
            "555 Mockingbird Lane"
    );

    assertTrue(student.updateContactLastName("ewy764geuy", "Smith"));

  }

  @Test
  void testUpdateContactAddressPerId() {
    ContactService student = new ContactService(
            "ewy764geuy",
            "Tom",
            "Jones",
            "7706751235",
            "555 Mockingbird Lane"
    );

    assertTrue(student.updateContactAddress("ewy764geuy", "123 1st Street"));

  }

  @Test
  void testUpdateContactPhonePerId() {
    ContactService student = new ContactService(
            "ewy764geuy",
            "Tom",
            "Jones",
            "7706751235",
            "555 Mockingbird Lane"
    );

    assertTrue(student.updateContactPhone("ewy764geuy", "2125551212"));

  }
}






