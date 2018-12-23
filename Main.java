class Main {
  public static void main(String[] args) {
    School sc = new School();
    Student1 st1 = new Student1();
    Student2 st2 = new Student2();
    System.out.println("Количество учеников: " + sc.students);
    st1.show_name();
    st2.show_name();
  }
}