public class SkiingTrip {
// 1. INSTANCE VARIABLES (data)
private static int processFee = 100; // class variables 
private String travelerName; // provided by client  
private String destination; // provided by client 
private int durationalInDays; // provided by client 
private boolean isSkier; // provided by client 
private double totalCost; // calculated the totalCost 

// 2. CONSTRUCTORS (defualt + parameterized)
public SkiingTrip() {
    this.travelerName = "defaultClient";
    this.destination = "Northern Lights Village Saariselkä-Downhill Skiing and Aurora Après Ski";
    this.durationalInDays = 7;
    this.isSkier = true;
    this.totalCost = processFee *  durationalInDays; // calculation
}
public SkiingTrip(String n, String des, int dur, boolean t) {
    this.travelerName = n; // set instance variable to client-provieded value 
    this.destination = des;
    this.durationalInDays = dur;
    this.isSkier = true; 
    this.totalCost = processFee * this.durationalInDays; // calculation     
}

    

// Getters 
public String getTravelerName(){
    return travelerName;
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
        this.travelerName =  NewTN;
    }

    public void setDurationalInDays( int NewDuration){
        this.durationalInDays = NewDuration;
    }
    
    public void setDestination( String NewDes){
        this.destination = NewDes;
    }
    // Special setter for totalCost  
    public void setTotalCost(){
        this.totalCost = processFee * this.durationalInDays;
    }

    public void setIsSkier ( boolean NewIS){
        this.isSkier = NewIS;
    }
    

    // toString 
    public String toString() {
         String state = "SkiingTrip[" + travelerName + "," + destination + "," + durationalInDays + "," + totalCost + "]";
         return state; 
    }





}