package ru.practice.p1;

public class Java {
    public static void main(String[] args) {
        Dog d1 = new Dog ("Mike", 12);
        Dog d2 = new Dog ("Sharik");
        Dog d3 = new Dog();
        d1.intoHumanAge();
        d2.setAge(4);
        d2.intoHumanAge();
    }
}
