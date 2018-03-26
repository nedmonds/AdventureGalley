package com.company;

public class Book extends Item {

    public Book() {
        super("Book", "A super boring book written by Karl Marx and Friedrich Engels", false);
    }

    @Override
    public String handle(String s) {
        if (s.equalsIgnoreCase("examine")) {
            return this.getDescription();
        }
        if (s.equalsIgnoreCase("vandalise")) {
            this.setDescription("A book containing something");
        } else {
            return "I don't know how to" + s + "a book.";
        }
        return null;
    }
}
