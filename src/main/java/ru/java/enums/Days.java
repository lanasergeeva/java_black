package ru.java.enums;

enum Days {
    MONDAY("amazing"),
    TUESDAY("amazing"),
    WEDNSDAY("nice"),
    THURSDAY("nice"),
    FRIDAY("good"),
    SATURDAY("amazing"),
    SUNDAY("amazing");

    private String mood;

    Days(String mood) {
        this.mood = mood;
    }

    String getMood() {
        return mood;
    }
}

class Today {
    private Days days;

    public Today(Days days) {
        this.days = days;
    }

    void daysInfo() {
        switch (days) {
            case MONDAY:
            case TUESDAY:
            case WEDNSDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Let's go work");
            case SATURDAY:
            case SUNDAY:
                System.out.println("Let's relax");
            default:
                System.out.println("Wrong");
        }
        System.out.println(days.getMood());
    }

    public static void main(String[] args) {
        Today today = new Today(Days.SATURDAY);
        today.daysInfo();
        Days d1 = Days.MONDAY;
        Days d2 = Days.SATURDAY;
        System.out.println(d1 == d2);
    }
}
