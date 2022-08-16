package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {

        Book obj = new Book();
        obj.setAuthorName("DAVID ALABA");
        obj.setIsbn(12345789);
        obj.setTitle("Power");
        obj.setYearOfPublication(2017);
        System.out.println("obj.getTitle() = " + obj.getTitle());
        System.out.println("obj.getYearOfPublication() = " + obj.getYearOfPublication());
        System.out.println("obj.getIsbn() = " + obj.getIsbn());
        System.out.println("obj.setAuthorName = " + obj.getAuthorName());
    }
}
