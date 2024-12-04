    package basics.first.steps.in.coding.lab;

    import java.util.Scanner;

    public class YardGreening {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double n =Double.parseDouble(scanner.nextLine());
            System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.%n",(7.61*n)-7.61*n*0.18,7.61*n*0.18);

        }
    }
