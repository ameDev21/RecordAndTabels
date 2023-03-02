import RecordAndTabels.*;
class main {
  public static void main(String[] args) {
    Tables table = new Tables(2);
    System.out.println(table);
    Record record =
        new Record("ame", "rico"); // insert a record to search in the table
    if (table.linearSearch(record))
      System.out.println("everything works!");
  }
}
