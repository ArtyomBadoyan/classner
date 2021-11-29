package HomeWorck;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("poxos",
                "poxosyan", 23, "093105453",
                "java");

        System.out.println(student.getName());
        student.setName("poxosik");
        System.out.println(student.getName());

    }
}
