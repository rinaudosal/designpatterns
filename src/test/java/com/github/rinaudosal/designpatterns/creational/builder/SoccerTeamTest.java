package com.github.rinaudosal.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SoccerTeamTest {

    @Test
    void checkBuilderWorksCorrectly() {
        SoccerTeam soccerTeam = new SoccerTeam.Builder()
                .goalKeeper("Buffon")
                .addDefender("Zambrotta")
                .addDefender("Cannavaro")
                .addDefender("Materazzi")
                .addDefender("Grosso")
                .addMidFielder("Camoranesi")
                .addMidFielder("Gattuso")
                .addMidFielder("Pirlo")
                .addStriker("Totti")
                .addStriker("Del Piero")
                .addStriker("Toni")
                .coach("Lippi")
                .result("Campioni del mondo!")
                .build();

        assertThat(soccerTeam.getGoalKeeper()).isEqualTo("Buffon");
        assertThat(soccerTeam.getDefenders()).containsExactly("Zambrotta", "Cannavaro", "Materazzi", "Grosso");
        assertThat(soccerTeam.getMidfielders()).containsExactly("Camoranesi", "Gattuso", "Pirlo");
        assertThat(soccerTeam.getStrikers()).containsExactly("Totti", "Del Piero", "Toni");
        assertThat(soccerTeam.getCoach()).isEqualTo("Lippi");
        assertThat(soccerTeam.getResult()).isEqualTo("Campioni del mondo!");
    }
}