package day2;


public class Driver {

    public static void main(String[] args) {
        Student student1 = new Student("Steve", 17, "1126804", 3.5, "Computer Science", 2025, true);
        Student student2 = new Student("Mahoraga", 16, "777778", 3.8, "Psychology", 2026, true);

        String info1 = student1.getInfo();

        System.out.println(info1);

        // System.out.println(student1.age); // age is private and is not visible

        student2.study(5); // study did not return anything


    } 

}
  

