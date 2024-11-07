package JavaOOP.WorkingWithAbstractionLab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputRectangle = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Point bottom = new Point(inputRectangle[0],inputRectangle[1]);
        Point top = new Point(inputRectangle[2],inputRectangle[3]);
        Rectangle rectangle = new Rectangle(bottom,top);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(input[0],input[1]);
            if (rectangle.contains(point)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
