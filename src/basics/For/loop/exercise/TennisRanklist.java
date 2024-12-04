package basics.For.loop.exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int tournamentpoint = 0;
        int win = 0;
        for (int i = 1; i <=tournaments ; i++) {
            String text = scanner.nextLine();
            switch (text){
                case "W":
                    tournamentpoint=tournamentpoint+2000;
                    win=win+1;
                    break;
                case "F":
                    tournamentpoint=tournamentpoint+1200;
                    break;
                case "SF":
                    tournamentpoint=tournamentpoint+720;
                    break;
                default:
                    break;
            }
        }
        double a= (double) win /tournaments*100;
        double b = (double) tournamentpoint /tournaments;
        System.out.printf("Final points: %d%n",points+tournamentpoint);
        System.out.printf("Average points: %.0f%n",Math.floor(b) );
        System.out.printf("%.2f%%",a);
    }
}
