package java.basics.While.loop.exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int space = a*b*c;
        String text= scanner.nextLine();
        while (!text.equals("Done")){
            int box = Integer.parseInt(text);
            space = space-box;
            if (space<0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(space));
                break;
            }
            text=scanner.nextLine();
        }
        if (space>0){
            System.out.printf("%d Cubic meters left.",space);
        }

    }
}
