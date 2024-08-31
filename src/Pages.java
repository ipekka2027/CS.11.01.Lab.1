import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        int pages = 100 - age;
        String result = "The number of pages you should read before giving up on a book is " + pages;
        System.out.println(result);

    }
}
