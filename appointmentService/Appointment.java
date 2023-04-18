package Module5;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Appointment {
  public static void main(String[] args) {


  }

  private final String Id;
  LocalDate date;
  private String description;

  public Appointment(String Id, String date, String description) {
    LocalDate current = LocalDate.now();
    this.Id = Id;
    if (Id.length() > 10) {
      throw new IllegalArgumentException(
        "Id cannot be longer than 10 characters"
      );
    }
    if (Id == null) {
      throw new NullPointerException("Id cannot be null");
    }
    if(LocalDate.parse(date).isBefore(LocalDate.now())){
      throw new DateTimeException("Cannot enter a date earlier than today");
    }

    if(LocalDate.parse(date).equals(null)) {
      throw new NullPointerException("Date cannot be null");
    }
    if (description.length() > 50) {
      throw new IllegalArgumentException(
        "Description cannot be longer than 50 characters"
      );
    }
    if (description == null) {
      throw new NullPointerException("Description cannot be null");
    }

    this.date = LocalDate.parse(date);
    this.description = description;
  }

  public String getId() {
    return Id;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = LocalDate.parse(date);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
