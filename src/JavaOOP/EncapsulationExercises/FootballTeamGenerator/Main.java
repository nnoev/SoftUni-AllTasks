package FootballTeamGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Team> teamMap =new HashMap<>();
        while (!input.equals("END")){
            String command = input.split(";")[0];
            String teamName = input.split(";")[1];
            switch (command){
                case "Team":
                        teamMap.putIfAbsent(teamName,new Team(teamName));
                    break;
                case "Add":
                    Team team = teamMap.get(teamName);
                    String playerName= input.split(";")[2];
                    int endurance = Integer.parseInt(input.split(";")[3]);
                    int sprint = Integer.parseInt(input.split(";")[4]);
                    int dribble = Integer.parseInt(input.split(";")[5]);
                    int passing = Integer.parseInt(input.split(";")[6]);
                    int shooting = Integer.parseInt(input.split(";")[7]);
                    Player player = new Player(playerName,endurance,sprint,dribble,passing,shooting);
                    team.addPlayer(player);
                    break;
                case "Remove":
                    playerName=input.split(";")[2];
                    break;
                case "Rating":
                    break;

            }
        }
    }
}
