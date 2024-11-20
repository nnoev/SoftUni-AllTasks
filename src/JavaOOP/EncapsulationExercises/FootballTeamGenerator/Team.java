package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players=new ArrayList<>();
    }

    private void setName(String name) {
        if (name==null|| name.trim().isEmpty()){
            throw  new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }
    public void removePlayer(String name){
            if (!players.contains(name)){
                throw new IllegalArgumentException(String.format("Player %s is not in %s team.",name,this.getName()));
            }
            players.remove(name);
    }
    public double getRating(){
        double allSkills = 0.0;
        for (Player player:players){
            allSkills+= player.overallSkillLevel();
        }
        return allSkills/ players.size();
    }
}
