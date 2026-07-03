import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("prem: ");
        String name = sc.nextLine();

        System.out.print("18: ");
        int age = sc.nextInt();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}