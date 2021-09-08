package ru.java.generics.play;

public class Test {
    public static void main(String[] args) {
        Schoolar sc1 = new Schoolar("Iban", 13);
        Schoolar sc2 = new Schoolar("Ipman", 11);

        Studant st1 = new Studant("Kolya", 20);
        Studant st2 = new Studant("Tolya", 22);

        Employee em1 = new Employee("Pasha", 33);
        Employee em2 = new Employee("Petr", 37);

        Team<Schoolar> schoolTeam = new Team<>("Shkolotron");
        Team<Studant> stTeam = new Team<>("Vpered");
        Team<Employee> emp = new Team<>("Rabotaut professionalu");
        schoolTeam.addNewParticipant(sc1);
        schoolTeam.addNewParticipant(sc2);
        /*stTeam.addNewParticipant(st1);
        stTeam.addNewParticipant(st2);
        emp.addNewParticipant(em1);
        emp.addNewParticipant(em2);
*/
        Team<Schoolar> schoolTeam2 = new Team<>("Mudrecu");
        Schoolar sc3 = new Schoolar("Natasha", 7);
        Schoolar sc4 = new Schoolar("Oleg", 10);
        schoolTeam2.addNewParticipant(sc3);
        schoolTeam2.addNewParticipant(sc4);
        schoolTeam.playWith(schoolTeam2);



    }
}
