package first.and.reserve.team;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private final List<Person> firstTeam;
    private final List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }
    public void addPlayer(Person person){
        if (person.getAge()<40){
            firstTeam.add(person);
        }else {
            reserveTeam.add(person);
        }
    }

    public String getName() {
        return name;
    }
    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(firstTeam);
    }
    public List<Person> getReserveTeam(){
        return Collections.unmodifiableList(reserveTeam);
    }
}
