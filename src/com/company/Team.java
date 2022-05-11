package com.company;

import com.company.classes.ArenaBase;
import com.company.classes.CharacterClass;
import com.company.classes.MonsterClass;
import com.company.classes.monsters.RetardedBat;
import com.company.classes.monsters.Goblin;

public class Team {
    private CharacterClass[] teamMembers;
    public static int i = 0;
    private ArenaBase arena;

    public void setArena(ArenaBase arena) {
        this.arena = arena;
    }

    public Team(CharacterClass... members) {
        teamMembers = new CharacterClass[members.length];

        for (int i = 0; i < teamMembers.length; i++) {
            teamMembers[i] = members[i];
        }
    }

    public CharacterClass[] getTeamMembers() {
        return teamMembers;
    }

    public void info(){
        for(CharacterClass teamMembers : teamMembers){
            teamMembers.info();
        }
    }

    public boolean enterArena(ArenaBase arena1) {
        return arena1.open(this);
    }

    //public void runArena() {
      //  MenuWindow menuWindow = new MenuWindow(200, 200);
    //}

    public void start() {
        MonsterClass[] monsters = new MonsterClass[999];
        monsters[i] = new RetardedBat(this.teamMembers);
        MainWindow mw = new MainWindow(375, 438, this, monsters);
        this.spawnMonsters();
    }

    public void spawnMonsters() {
        Team thisTeam = this;
        if (MonsterClass.currentMonsters <= 3) {
            i++;
            GameField.monsters[i] = new Goblin(this.teamMembers);
            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            thisTeam.spawnMonsters();
                        }
                    }, 5000
            );
        }
    }

    public ArenaBase getArena() {
        return arena;
    }
}
