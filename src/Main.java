import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static void registerUser(String name, int age)
            throws InvalidAgeException {

        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Yas yanlisdir!");
        }

        System.out.println(name + " qeydiyyatdan kecdi.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Birinci ededi daxil edin: ");
                int a = scanner.nextInt();

                System.out.print("Ikinci ededi daxil edin: ");
                int b = scanner.nextInt();

                int result = a / b;

                System.out.println("Netice: " + result);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Xeta: Eded daxil etmelisiniz!");
                scanner.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("Xeta: Sifira bolmek olmaz!");
            }
        }


        Scanner sc = new Scanner(System.in);

        String[] names = {"Ali", "Vusal", "Aysel"};

        try {
            System.out.print("Indeks daxil edin: ");
            int index = sc.nextInt();

            System.out.println("Ad: " + names[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Yalnis indeks ");
        }

        String values[] = {"12", "abc", "7", " ", "3.5", "-4"};
        int sum = 0;
        for (String value : values) {

            try {
                int number = Integer.parseInt(value);

                System.out.println(value + " -> " + number);
                sum += number;

            } catch (NumberFormatException e) {
                System.out.println(value + ": reqem deyil");
            }
        }

        System.out.println("Cem: " + sum);

        try {
            registerUser("Ali", 20);
            registerUser("Nurlan", 15);

        } catch (InvalidAgeException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}
