package com.company;
public class Sickle extends Item{

    public Sickle (String name, String description, boolean edible) {
        super("sickle", "Communism is not love. Communism is a hammer which we use to crush the enemy", false);
    }
    @Override
    public String handle (String s) {
        if(s.equalsIgnoreCase("examine")){
            return this.getDescription();
        }
        else{
            return "I don't know how to" + s + "a sickle.";
        }
    }
}