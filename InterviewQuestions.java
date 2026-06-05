import java.util.Scanner;

public class InterviewQuestions {

    public static void showQuestions() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== INTERVIEW QUESTIONS =====");
        System.out.println("1. Java");
        System.out.println("2. DBMS");
        System.out.println("3. HR Questions");

        System.out.print("Choose Topic : ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:

                System.out.println("\nJAVA QUESTIONS");
                System.out.println("1. What is OOP?");
                System.out.println("2. What is Inheritance?");
                System.out.println("3. What is Polymorphism?");
                System.out.println("4. Difference between Interface and Abstract Class?");
                System.out.println("5. What is Exception Handling?");
                System.out.println("6. What is Collection Framework?");
                break;

            case 2:

                System.out.println("\nDBMS QUESTIONS");
                System.out.println("1. What is DBMS?");
                System.out.println("2. What is Primary Key?");
                System.out.println("3. What is Foreign Key?");
                System.out.println("4. What is Normalization?");
                System.out.println("5. Difference between DELETE and TRUNCATE?");
                break;

            case 3:

                System.out.println("\nHR QUESTIONS");
                System.out.println("1. Tell me about yourself.");
                System.out.println("2. What are your strengths?");
                System.out.println("3. Why should we hire you?");
                System.out.println("4. Where do you see yourself in 5 years?");
                System.out.println("5. Why do you want to join our company?");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}