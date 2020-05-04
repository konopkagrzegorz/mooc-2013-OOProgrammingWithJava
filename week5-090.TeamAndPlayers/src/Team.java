
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Team {
    
    private String name;
    private ArrayList<Player> team;
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
        this.team = new ArrayList<Player>();
    }

    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
            if (team.size() < this.maxSize)
            team.add(player);
    }
    
    public void printPlayers() {
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.team.size();
    }
    
    public int goals() {
        int sum = 0;
        for (int i = 0; i < team.size(); i++) {
            Player temp = team.get(i);
            sum += temp.goals();
        }
        return sum;
    }
}
