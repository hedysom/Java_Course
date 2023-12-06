package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
    private final String name;
    private final GregorianCalendar date;
    private final String message;
    private int ID = 0;
    public SMS(String name, GregorianCalendar date, String message){
        this.name = name;
        this.date = date;
        this.message = message;
        ID++;
    }

    public String getSender(){
        return this.name;
    }

    public GregorianCalendar getDate(){
        return this.date;
    }
}