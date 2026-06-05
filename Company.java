public class Company {

    String companyName;
    String role;
    double minCgpa;

    public Company(String companyName,
                   String role,
                   double minCgpa) {

        this.companyName = companyName;
        this.role = role;
        this.minCgpa = minCgpa;
    }

    public void display() {

        System.out.println("\nCompany : " + companyName);
        System.out.println("Role : " + role);
        System.out.println("Minimum CGPA : " + minCgpa);
    }
}