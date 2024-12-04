package fundamentals.objects.and.classes.lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrey = text.split(" ");
        Random rnd = new Random();
        for (int i = 0; i <= arrey.length-1; i++) {
          int random=  rnd.nextInt(arrey.length-1);
            System.out.println(arrey[random]);
        }



    }
}
