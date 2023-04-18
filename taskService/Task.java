package Module4;

public class Task {

  public static void main(String[] args) {}

  private String Id;
  private String name;
  private String description;

  public Task(String Id, String name, String description) {
    if (Id == null || Id.length() > 10) {
      throw new IllegalArgumentException(
        "Id cannot be longer than 5 characters"
      );
    }
    if (name == null || name.length() > 20) {
      throw new IllegalArgumentException(
        "Value cannot be null"
      );
    }
    if (description == null || description.length() > 50) {
      throw new IllegalArgumentException(
        "Description cannot be longer than 50 characters"
      );
    }

    this.Id = Id;
    this.name = name;
    this.description = description;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
