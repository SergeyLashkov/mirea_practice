package ru.practice.p2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Sergey", "sergey230102@yandex.ru", 'm');
        System.out.println(a1.getName());
        a1.setEmail("sergey230102@gmail.com");
        a1.ToString();
    }
}
