import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        int youngestAge = (7 + (age / 2));
        String result = "The youngest person you can date is " + youngestAge + " years old.";
        System.out.println(result);

    }
}
