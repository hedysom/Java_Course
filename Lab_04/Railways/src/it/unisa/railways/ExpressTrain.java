package it.unisa.railways;

import java.util.ArrayList;
import java.util.List;

public class ExpressTrain {
    private final TrainStop departure;
    private final TrainStop arrival;
    private final int seats;
    private final int restaurantSeats;
    private final int distance;
    private final List<TrainStop> intermediate;

    public ExpressTrain(TrainStop departure, TrainStop arrival, List<TrainStop> intermediate, int seats, int restaurantSeats, int distance ){
        this.departure = departure;
        this.arrival = arrival;
        this.seats = seats;
        this.restaurantSeats = restaurantSeats;
        this.distance = distance;
        this.intermediate = intermediate;
    }

    public int getTotalNumberOfStops(){
        return this.intermediate.size()+2;
    }
    public double computeMaxRevenues(double price, double restarantPrice){

        return (this.seats * this.distance * price + this.restaurantSeats*restarantPrice * this.distance);
    }

}