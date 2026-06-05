public class PlacementEligibility {

    public static void check(double cgpa) {

        System.out.println("\n===== ELIGIBLE COMPANIES =====");

        if (cgpa >= 8.5) {

            System.out.println("Google");
            System.out.println("Microsoft");
            System.out.println("Amazon");
            System.out.println("TCS Digital");
        }

        else if (cgpa >= 7.0) {

            System.out.println("TCS");
            System.out.println("Infosys");
            System.out.println("Accenture");
            System.out.println("Cognizant");
            System.out.println("Wipro");
        }

        else {

            System.out.println("Focus on Skill Development");
        }
    }
}