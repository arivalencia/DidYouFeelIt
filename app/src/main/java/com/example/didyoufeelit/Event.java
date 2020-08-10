package com.example.didyoufeelit;

public class Event {
    public final String title;
    public final String numOfPeople;
    public final String perceivedStrength;

    public Event(String eventTitle, String eventNumOfPeople, String eventPerceivedStrength) {
        title = eventTitle;
        numOfPeople = eventNumOfPeople;
        perceivedStrength = eventPerceivedStrength;
    }
}