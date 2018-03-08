package com.company;

public class Jacket extends Item {

    public Jacket(){
        super("jacket", "A worn bomber jacket. Looks surprisingly warm.", true);
    }

    public String handle (String n){
        if (n.equalsIgnoreCase("examine")){
            return this.getDescription();
        }
        else{
            return (" ");
        }
    }
}
