package encapsulation.exercises.football.team.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Team {
    private String name;
    private final List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players=new ArrayList<>();
    }

    private void setName(String name) {
        if (name==null|| name.trim().isEmpty()){
          throw new IllegalArgumentException("A name should not be empty.");
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
        Player player = players.stream().filter(player1 -> player1.getName().equals(name)).findAny().orElse(null);
            if (player==null){
                throw new NoSuchElementException(String.format("Player %s is not in %s team.",name,this.name));
            }
            this.players.remove(player);
    }
    public double getRating(){
        return this.players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}
