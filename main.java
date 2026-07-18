import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA AGE CALCULATOR =====");

        System.out.print("Enter Your Birth Year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter Current Year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;

        if (age >= 0) {
            System.out.println("Your Age is: " + age + " years");
        } else {
            System.out.println("Invalid Year Entered!");
        }

        sc.close();
    }
}