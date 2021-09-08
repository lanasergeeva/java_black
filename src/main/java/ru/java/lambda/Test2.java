package ru.java.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet"));
    }
  /* static void def(I i) {
       System.out.println(i.abc());
   }*/
  /*  static void def(I i) {
        System.out.println(i.abc("privet"));
    }*/

    public static void main(String[] args) {
        def((String s) -> {
            return s.length();
        });
    }
}

interface I {
    int abc(String s);
}
/*interface I {
    int abc();
}*/
