import java.util.Scanner;

public class Main {

   public static void main(String []args) {

      // Test out the constructor for Trip object 
       SkiingTrip trip1 = new SkiingTrip("Sohaila", "LeviFinland", 7, true); 
       Scanner input = new Scanner(System.in);
       // LOOP for booking trips with client input
       boolean continueBooking = true; // flag to control loop 
       while (continueBooking) {
            // 1. Call static bookTravel method to create object
            SkiingTrip currentTrip = bookTrip(input);
            // 2. Display the object's details 
            System.out.println(currentTrip);
            // 3. Ask the user if they want to countinue booking
            System.out.println("Do you want to book another Skiing trip? (yes/no)");
            String response = input.nextLine();
            if ( response.equals("no") ) {
                  continueBooking = false;
            }
            
       }
         
   } // end main method

   // Methods dont have to be just be for object classess!
   // Write a reusable process for creating objects
   public static SkiingTrip bookTrip(Scanner scan) {
      // 1. Create a blank travel object
      SkiingTrip newTrip = new SkiingTrip();


      // 2. Ask client for details
      System.out.println("What is your name?");
      String clientName = scan.nextLine(); 
      System.out.println("Where do you want to go?");
      String clientDestination = scan.nextLine();
      System.out.println("How many days?");
      int clientDuration = scan.nextInt();
      System.out.println("Are you a good skier? Type true or false");
      boolean clientSkier = scan.nextBoolean();
      scan.nextLine();
 
      // 3. Call mutator methods (setters) to update the object
      newTrip.setTravelerName(clientName);
      newTrip.setDestination(clientDestination);
      newTrip.setDurationalInDays(clientDuration);
      newTrip.setIsSkier(clientSkier);
      newTrip.setTotalCost();




      // 4. Return the completed travel object
      return newTrip;
   }


} // end Main class
