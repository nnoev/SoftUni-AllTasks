    package basics.first.steps.in.coding.lab;

    import java.util.Scanner;

    public class TextAndNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String first = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String town = scanner.nextLine();
            System.out.printf("You are %s %s, a %d-years old person from %s.",first,lastName,age,town);
        }
    }
