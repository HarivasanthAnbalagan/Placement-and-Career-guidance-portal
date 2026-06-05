import java.util.Scanner;

public class CompanyPreparation {

    public static void showCompanies() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== COMPANY PREPARATION =====");
        System.out.println("1. TCS");
        System.out.println("2. Infosys");
        System.out.println("3. Accenture");
        System.out.println("4. Cognizant");

        System.out.print("Choose Company : ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:

                System.out.println("\n===== TCS JAVA FULL STACK =====");

                System.out.println("Skills Required:");
                System.out.println("- Core Java");
                System.out.println("- OOP");
                System.out.println("- Collections");
                System.out.println("- Exception Handling");
                System.out.println("- JDBC");
                System.out.println("- MySQL");
                System.out.println("- HTML");
                System.out.println("- CSS");
                System.out.println("- JavaScript");
                System.out.println("- Spring Boot");

                System.out.println("\nInterview Questions:");
                System.out.println("1. What is JVM?");
                System.out.println("2. Difference between JDK and JRE?");
                System.out.println("3. What is Collection Framework?");
                System.out.println("4. What is Spring Boot?");
                System.out.println("5. What is REST API?");
                break;

            case 2:

                System.out.println("\n===== INFOSYS SYSTEM ENGINEER =====");
                System.out.println("Skills Required:");
                System.out.println("- Java/Python");
                System.out.println("- SQL");
                System.out.println("- Aptitude");
                System.out.println("- DBMS");
                System.out.println("- Operating System");
                break;

            case 3:

                System.out.println("\n===== ACCENTURE ASE =====");
                System.out.println("Skills Required:");
                System.out.println("- Java");
                System.out.println("- SQL");
                System.out.println("- Cloud Basics");
                System.out.println("- Aptitude");
                break;

            case 4:

                System.out.println("\n===== COGNIZANT PROGRAMMER ANALYST =====");
                System.out.println("Skills Required:");
                System.out.println("- Java");
                System.out.println("- DSA");
                System.out.println("- SQL");
                System.out.println("- Web Development");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}