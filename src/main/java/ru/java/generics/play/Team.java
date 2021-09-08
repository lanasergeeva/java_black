package ru.java.generics.play;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T> {
    private String name;
    private List<Participant> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant participant) {
        participantList.add(participant);
        System.out.println("Comanda" + name + "add uchastnic"
                + ((Participant) participant).getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Pobedili -------" + winnerName);
    }
}
