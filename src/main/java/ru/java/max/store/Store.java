package ru.java.max.store;

import java.awt.dnd.DragSourceListener;

public class Store implements StoreInterface {
    private User[] userStore = new User[100];
    private int index = 0;

    @Override
    public User add(User user) {
        userStore[index] = user;
        index++;
        return user;
    }

    @Override
    public boolean delId(int id) {
        int temp = searchIndex(id);
        boolean rsl = temp != -1;
        int ostat = index - temp;
        if (rsl) {
            System.arraycopy(userStore, temp + 1, userStore, temp, ostat);
            index--;
        }
        return rsl;
    }

    public int searchIndex(int id) {
        int rsl = -1;
        for (int i = 0; i < index; i++) {
            if (userStore[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    @Override
    public User searchId(int id) {
 /*       int temp = searchIndex(id);
        return temp!=-1? userStore[temp]:null;*/
        User rsl = null;
        int temp = searchIndex(id);
        if (temp != -1) {
            rsl = userStore[temp];
        }
        return rsl;
    }
}
