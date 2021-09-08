package ru.java.nested.local;

public class Localinner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(9, 3);
    }
}

class Math {
    public void getResult(final int delimoe, final int delitel) {
        class Delenie {
            private int delimoe;
           /* private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }*/


            public int getChastnoe() {
                return delimoe / delitel;
            }
        }
        /*Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println(delenie.getDelimoe());
        System.out.println(delenie.getDelitel());
        System.out.println(delenie.getChastnoe());*/
    }
}
