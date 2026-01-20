public class SkiingTrip {
// 1. INSTANCE VARIABLES (data)
private static in processFee = 100; // class variables 
private String travelerName; // provided by client  
private String destination; // provided by client 
private int durationalInDays; // provided by client 
private boolean isCabins; // provided by client 
private double totalCost; // calculated the totalCost 

// 2. CONSTRUCTORS (defualt + parameterized)
public SkiingTrip() {
    this.travelerName = "defaultClient";
    this.destination = "Northern Lights Village Saariselkä-Downhill Skiing and Aurora Après Ski";
    this.durationalInDays = 7;
    this.isSaariselkä = ture;
    this.totalCost = processFee *  durationalInDays; // calculation
}
public SkiingTrip(String name, String destination, int duration, boolean Saariselkä) {
    this.travelerName = name; // set instance variable to client-provieded value 
    this.totalCost = processFee * this.durationalInDays; // calculation 
     
}




}