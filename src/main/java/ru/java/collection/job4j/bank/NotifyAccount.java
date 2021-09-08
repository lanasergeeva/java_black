package ru.java.collection.job4j.bank;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Acc> sent(List<Acc> accounts) {
        HashSet<Acc> rsl = new HashSet<>();
        for (Acc ac : accounts) {
            rsl.add(ac);
        }
        return rsl;
    }
}
