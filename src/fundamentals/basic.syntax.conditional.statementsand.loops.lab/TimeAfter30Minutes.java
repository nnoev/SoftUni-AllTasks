package fundamentals.basic.syntax.conditional.statementsand.loops.lab;

import java.util.Scanner;

public class TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        if (m>=30){
            h=h+1;
            if(h>23){
                h=0;
            }
            m=m-30;
            System.out.printf("%d:%02d",h,m);
        }else {
            m=m+30;
            System.out.printf("%d:%02d",h,m);
        }

    }
}
