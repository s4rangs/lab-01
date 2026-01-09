package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{
    public HappyMood() {
        super();
    }
    public HappyMood(Date date){
        super(date);
    }
    @Override
    public String MoodRepresentation() {
        return "Happy";
    }
}
