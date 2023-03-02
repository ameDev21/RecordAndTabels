package RecordAndTabels;

public class Record {
  private String name;
  private String surname;
  public Record() {}
  public Record(final String name, final String surname) {
    this.name = name;
    this.surname = surname;
  }
  public String getName() { return this.name; }
  public void setName(final String name) { this.name = name; }
  public String getSurname() { return this.surname; }
  public void setSurname(final String surname) { this.surname = surname; }

  public boolean isEqualTo(Record record_to_compare) {
    if (this.name.equals(record_to_compare.getName()) &&
        this.surname.equals(record_to_compare.getSurname()))
      return true;
    else
      return false;
  }
  @Override
  public String toString() {
    return "Record [name=" + this.getName() + ", surname=" + this.getSurname() +
        "]";
  }
}
