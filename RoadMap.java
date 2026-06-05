public class RoadMap {

    public static void showRoadMap(int year) {

        switch (year) {

            case 1:

                System.out.println("\n===== FIRST YEAR ROADMAP =====");
                System.out.println("1. Communication Skills");
                System.out.println("2. Spoken English");
                System.out.println("3. Presentation Skills");
                System.out.println("4. Basic Aptitude");
                System.out.println("5. MS Office");
                System.out.println("6. Introduction to Programming");
                break;

            case 2:

                System.out.println("\n===== SECOND YEAR ROADMAP =====");
                System.out.println("1. Aptitude");
                System.out.println("2. Logical Reasoning");
                System.out.println("3. Verbal Ability");
                System.out.println("4. Data Structures Basics");
                System.out.println("5. Problem Solving");
                break;

            case 3:

                System.out.println("\n===== THIRD YEAR ROADMAP =====");
                System.out.println("1. Core Java");
                System.out.println("2. OOP Concepts");
                System.out.println("3. Data Structures");
                System.out.println("4. DBMS");
                System.out.println("5. SQL");
                System.out.println("6. HTML");
                System.out.println("7. CSS");
                System.out.println("8. JavaScript");
                System.out.println("9. Git & GitHub");
                System.out.println("10. Mini Projects");
                break;

            case 4:

                System.out.println("\n===== FOURTH YEAR ROADMAP =====");
                System.out.println("1. Placement Preparation");
                System.out.println("2. Mock Interviews");
                System.out.println("3. Coding Practice");
                System.out.println("4. Resume Building");
                System.out.println("5. Project Presentation");
                break;

            default:

                System.out.println("Invalid Year");
        }
    }
}