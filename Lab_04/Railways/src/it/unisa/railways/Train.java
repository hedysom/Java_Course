package it.unisa.railways;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final TrainStop departure;
    private final TrainStop arrival;
    private final int seats;
    private final int distance;
    private final List<TrainStop> intermediate;

    public Train(TrainStop departure, TrainStop arrival, List<TrainStop> intermediate, int seats, int distance ){
        this.departure = departure;
        this.arrival = arrival;
        this.seats = seats;
        this.distance = distance;
        this.intermediate = intermediate;
    }

    public int getTotalNumberOfStops(){
        return this.intermediate.size() + 2;
    }
    public double computeMaxRevenues(double price){
       return (this.seats * distance * price);
    }

}