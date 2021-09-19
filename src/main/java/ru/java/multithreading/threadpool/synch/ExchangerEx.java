package ru.java.multithreading.threadpool.synch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendOneAction = new ArrayList<>();
        friendOneAction.add(Action.NOGNICU);
        friendOneAction.add(Action.BUMAGA);
        friendOneAction.add(Action.NOGNICU);

        List<Action> friendSecondAction = new ArrayList<>();
        friendSecondAction.add(Action.BUMAGA);
        friendSecondAction.add(Action.KAMEN);
        friendSecondAction.add(Action.KAMEN);

        new BestFriend("Oleg", friendOneAction, exchanger);
        new BestFriend("Petr", friendSecondAction, exchanger);

    }
}

enum Action {
    KAMEN, NOGNICU, BUMAGA
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAct) {
        if (myAction == Action.KAMEN && friendsAct == Action.NOGNICU
                || myAction == Action.NOGNICU && friendsAct == Action.BUMAGA
                || myAction == Action.BUMAGA && friendsAct == Action.KAMEN) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}