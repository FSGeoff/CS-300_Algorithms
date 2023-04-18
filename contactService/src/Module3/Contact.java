package Module3;


public class Contact {

  public static void main(String[] args) {


  }

  private String contactId;
  public String firstName;
  public String lastName;
  public String phone;
  public String address;

  public Contact(
    String contactId,
    String firstName,
    String lastName,
    String phone,
    String address
  ) {
    if (contactId == null || contactId.length() > 10) {
      throw new IllegalArgumentException("No more than 10 characters");
    }
    if (firstName == null || firstName.length() > 10) {
      throw new IllegalArgumentException("No more than 10 characters");
    }
    if (lastName == null || lastName.length() > 10) {
      throw new IllegalArgumentException("No more than 10 characters");
    }
    if (phone == null || phone.length() != 10) {
      throw new IllegalArgumentException("Must be exactly 10 digits");
    }
    if (address == null || address.length() > 30) {
      throw new IllegalArgumentException(
        "Address cannot be more than 30 characters"
      );
    }

    this.contactId = contactId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.address = address;
  }

  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
