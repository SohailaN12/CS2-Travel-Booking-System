public class SkiingTrip {
// 1. INSTANCE VARIABLES (data)
private static in processFee = 100; // class variables 
private String travelerName; // provided by client  
private String destination; // provided by client 
private int durationalInDays; // provided by client 
private boolean isSaariselka; // provided by client 
private double totalCost; // calculated the totalCost 

// 2. CONSTRUCTORS (defualt + parameterized)
public SkiingTrip() {
    this.travelerName = "defaultClient";
    this.destination = "Northern Lights Village Saariselkä-Downhill Skiing and Aurora Après Ski";
    this.durationalInDays = 7;
    this.isSaariselka = t;
    this.totalCost = processFee *  durationalInDays; // calculation
}
public SkiingTrip(String n, String des, int dur, boolean t) {
    this.travelerName = n; // set instance variable to client-provieded value 
    this.destination = des;
    this.durationalInDays = dur;
    this.isSaariselka = t; 
    this.totalCost = processFee * this.durationalInDays; // calculation     
}

    

// Getters 
public String getTravelerName(){
    return travelername;
}

public String getDestination(){
    return destination;
}

public int getDurationalInDays(){
    return durationalInDays;
}

public double getTotalCost(){
    return totalCost;
}


    // Setters 
    public void setTravelerName( String NewTN){
        this.travelername =  NewTN;
    }

    public void setDurationalInDays( int NewDuration){
        this.durationalInDays = NewDuration;
    }
    // Special setter fir totalCost 
    public void serTotalCost(){
        this.totalCost = processFee * this.durationalInDays;


    // toString 
    public String toString() {
         String state = "SkiingTrip[" + travelerName + "," + destination + "," + durationalInDays + "," + totalCost + "]";
         return state; 
    }





}