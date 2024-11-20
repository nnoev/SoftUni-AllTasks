package JavaFundamentals.BasicSyntaxConditionalStatementsAndLoopsMoreExercises;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messageLength  = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <messageLength ; i++) {
            String [] letter =scanner.nextLine().split("");
            int numberOfDigits = letter.length;
            int mainDigit = Integer.parseInt(letter[0]);
            int offset = (mainDigit-2)*3;
            if (mainDigit==8||mainDigit==9){
                offset+=1;
            }
            int letterIndex = (offset+numberOfDigits-1);
            if (letterIndex==-6){
                System.out.print(" ");
            }else {
                System.out.printf("%c", (char) (letterIndex + 97));
            }
        }
    }


}
