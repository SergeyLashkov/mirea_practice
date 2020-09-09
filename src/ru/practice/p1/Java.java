package ru.practice.p1;

public class Java {
    public static void main(String[] args) {
        Dog d1 = new Dog ("Mike", 12);
        Dog d2 = new Dog ("Sharik");
        Dog d3 = new Dog();
        d1.intoHumanAge();
        d2.setAge(4);
        d2.intoHumanAge();
        Ball b1 = new Ball();
        b1.setRadius(13);
        b1.setColor("Red");
        b1.setName("Sharik");
        Book BK = new Book();
        BK.setAuthor("Tolstoy");
        BK.setName("War and Peace");
        BK.setPages(13152352);
        BK.getBookInfo();
    }
}
