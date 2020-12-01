package com.github.rinaudosal.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class SoccerTeam {
    private final String goalKeeper;
    private final List<String> defenders;
    private final List<String> midfielders;
    private final List<String> strikers;
    private final String result;
    private final String coach;

    private SoccerTeam(Builder builder) {
        this.goalKeeper = builder.goalKeeper;
        this.defenders = builder.defenders;
        this.midfielders = builder.midfielders;
        this.strikers = builder.strikers;
        this.result = builder.result;
        this.coach = builder.coach;
    }

    public static class Builder {
        private String goalKeeper;
        private final List<String> defenders = new ArrayList<>();
        private final List<String> midfielders = new ArrayList<>();
        private final List<String> strikers = new ArrayList<>();
        private String result;
        private String coach;

        public Builder() {
        }

        public SoccerTeam build() {
            return new SoccerTeam(this);
        }

        public Builder coach(String coach) {
            this.coach = coach;
            return this;
        }

        public Builder goalKeeper(String goalKeeper) {
            this.goalKeeper = goalKeeper;
            return this;
        }

        public Builder addDefender(String defender) {
            this.defenders.add(defender);
            return this;
        }

        public Builder addMidFielder(String midFielder) {
            this.midfielders.add(midFielder);
            return this;
        }

        public Builder addStriker(String striker) {
            this.strikers.add(striker);
            return this;
        }

        public Builder result(String result) {
            this.result = result;
            return this;
        }
    }

    public String getGoalKeeper() {
        return goalKeeper;
    }

    public List<String> getDefenders() {
        return defenders;
    }

    public List<String> getMidfielders() {
        return midfielders;
    }

    public List<String> getStrikers() {
        return strikers;
    }

    public String getResult() {
        return result;
    }

    public String getCoach() {
        return coach;
    }
}
