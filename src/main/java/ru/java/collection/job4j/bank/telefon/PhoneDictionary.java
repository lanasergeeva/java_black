package ru.java.collection.job4j.bank.telefon;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        if (!persons.contains(person)) {
            persons.add(person);
        }
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        if (key != null) {
            for (Person p : persons) {
                if ((p.getPhone().equals(key) || p.getAddress().equals(key)
                        || p.getName().equals(key) || p.getSurname().equals(key))) {
                    result.add(p);
                    break;
                }
            }
        }
        return result;
    }
}
