public class Student {

    int id;
    String name;
    String department;
    double cgpa;
    int year;

    public Student(int id, String name,
                   String department,
                   double cgpa,
                   int year) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        this.year = year;
    }

    public void display() {

        System.out.println("\n================================");
        System.out.println("STUDENT PROFILE");
        System.out.println("================================");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Year : " + year);
    }
}
