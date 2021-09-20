/*
package ru.java.annotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("ru.java.annotation.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;
        System.out.println("Annotation info "
                + sm1.OS() + " " + sm1.yearOfCompany());

        Class iphoneClass = Class.forName("ru.java.annotation.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info "
                + sm2.OS() + " " + sm2.yearOfCompany());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int yearOfCompany() default 2010;

}

@SmartPhone(yearOfCompany = 2010)
class Xiaomi {
    String mode;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompany = 1976)
class Iphone {
    String model;
    double price;
}
*/
