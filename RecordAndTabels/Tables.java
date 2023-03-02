package RecordAndTabels;
import java.util.Scanner;

public class Tables {
  private final int size;
  Scanner sc = new Scanner(System.in); // System.in is a standard input stream
  Record[] Tabels;
  public Tables(final int sizeOfTheTables) {
    this.size = sizeOfTheTables;
    Tabels = new Record[sizeOfTheTables];
    for (int i = 0; i < this.getSize(); i++) {
      Tabels[i] = new Record();
      System.out.println("write the information of the " + (i + 1) +
                         " element");

      System.out.println("name: ");
      Tabels[i].setName(sc.nextLine());
      System.out.println("surname: ");
      Tabels[i].setSurname(sc.nextLine());
      // System.out.println("surname: ");
      // Tabels[i].setSurname(sc.nextLine());
    }
  }

  public int getSize() { return this.size; }
  // there won't be no setter
  // 'cause we cannot set the size
  // of an array dynamically

  public boolean linearSearch(Record record_to_find) {
    for (int i = 0; i < this.getSize(); i++) {
      if (Tabels[i].isEqualTo(record_to_find))
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    String str = "Tables: "
                 + "\n";
    for (int i = 0; i < this.getSize(); i++) {
      str += "Tabels"
             + "[" + i + "]"
             + " = " + Tabels[i].toString() + "\n";
    }
    return str;
  }
}
