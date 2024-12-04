package javaOPP.encapsulation.exercises.football.team.generator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Team> teams =new LinkedHashMap<>();
        while (!input.equals("END")){
            String command = input.split(";")[0];
            String teamName = input.split(";")[1];
            switch (command){
                case "Team":
                        teams.putIfAbsent(teamName,new Team(teamName));
                    break;
                case "Add":
                    try {
                        Team team = teams.get(teamName);
                        if (team == null) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                            break;
                        }
                        String playerName = input.split(";")[2];
                        int endurance = Integer.parseInt(input.split(";")[3]);
                        int sprint = Integer.parseInt(input.split(";")[4]);
                        int dribble = Integer.parseInt(input.split(";")[5]);
                        int passing = Integer.parseInt(input.split(";")[6]);
                        int shooting = Integer.parseInt(input.split(";")[7]);
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        team.addPlayer(player);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex   .getMessage());
                    }
                    break;
                case "Remove":
                       String playerName = input.split(";")[2];
                       try {

                        teams.get(teamName).removePlayer(playerName);
                       }catch (NoSuchElementException ex ){
                           System.out.println(ex.getMessage());
                       }
                    break;
                case "Rating":
                    if (teams.containsKey(teamName)){
                        System.out.printf("%s - %.0f\n",teamName,teams.get(teamName).getRating());
                    }else {
                        System.out.printf("Team %s does not exist.",teamName);
                    }
                    break;
            }
            input=scanner.nextLine();
        }
    }
}
