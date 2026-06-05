import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("PLACEMENT MANAGEMENT SYSTEM");


        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Department : ");
        String department = sc.nextLine();

        System.out.print("Enter CGPA : ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Year (1-4) : ");
        int year = sc.nextInt();

        Student student =
                new Student(
                        id,
                        name,
                        department,
                        cgpa,
                        year);

        while (true) {


            System.out.println("1. View Profile");
            System.out.println("2. Year-wise RoadMap");
            System.out.println("3. Placement Eligibility");
            System.out.println("4. Company Preparation");
            System.out.println("5. Interview Questions");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    student.display();
                    break;

                case 2:

                    RoadMap.showRoadMap(student.year);
                    break;

                case 3:

                    PlacementEligibility.check(student.cgpa);
                    break;

                case 4:
                    CompanyPreparation.showCompanies();
                    break;

                case 5:
                    InterviewQuestions.showQuestions();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}