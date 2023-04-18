package Module3;

import java.util.ArrayList;
import java.util.List;

public class ContactService extends Contact {

  private static List<Contact> allContacts = new ArrayList<Contact>();

  public ContactService(
    String contactId,
    String firstName,
    String lastName,
    String phone,
    String address
  ) {
    super(contactId, firstName, lastName, phone, address);
    addContact(contactId, firstName, lastName, phone, address);
  }

  public void addContact(
    String contactId,
    String firstName,
    String lastName,
    String phone,
    String address
  ) {


    Contact myContact = new Contact(contactId, firstName, lastName, phone, address);
    allContacts.add(myContact);
  }

  public int getIndexById(String contactId) {

    for (int i = 0; i < allContacts.size(); i++) {
      Contact foundContact = allContacts.get(i);
      String foundContactId = foundContact.getContactId();

      System.out.println(foundContact.getContactId());

      if (contactId.equals(foundContactId)) {
        return i;
      }
    }

    return -1;
  }
  public Contact getContactById(String contactId) {
    for (int i = 0; i < allContacts.size(); i++) {
      Contact foundContact = allContacts.get(i);
      String foundContactId = foundContact.getContactId();

      if (contactId.equals(foundContactId)) {
        return foundContact;
      }
    }

    return null;
  }


  public boolean deleteContactById(String contactId) {
    int foundIndex = getIndexById(contactId);

    if (foundIndex != -1) {
      allContacts.remove(foundIndex);
      return true;
    }

    return false;
  }




  public boolean updateContactFirstName(String contactId, String newFirstName) {
    Contact foundContact = getContactById(contactId);

    if (foundContact == null) {
      return false;
    }

    foundContact.setFirstName(newFirstName);
  return true;
  }

  public boolean updateContactLastName(String contactId, String newLastName) {
    Contact foundContact = getContactById(contactId);

    if (foundContact == null) {
      return false;
    }

    foundContact.setLastName(newLastName);
    return true;
  }

  public boolean updateContactAddress(String contactId, String newAddress) {
    Contact foundContact = getContactById(contactId);

    if (foundContact == null) {
      return false;
    }

    foundContact.setAddress(newAddress);
    return true;
  }

  public boolean updateContactPhone(String contactId, String newPhone) {
    Contact foundContact = getContactById(contactId);

    if (foundContact == null) {
      return false;
    }

    foundContact.setAddress(newPhone);
    return true;
  }


}
