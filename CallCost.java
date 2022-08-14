/** This class implements a simple program that will compute the cost of phone call and update balance */

public class CallCost {
    public static void main(String[] args)
    {
        /* declare variables */

        double balance;        // balance amount in rupees 
        double rate;           // call rate, rupees per second
        double duration;       // call duration in seconds
        double cost;           // cost of last call

        /* initialize variables */

        balance = 200;       // initial balance
        rate = 0.05; // rate of call in rupees per second
        duration = 37; // duration of call in seconds        

        /* camputations */


        cost = duration * rate;  //this will compute the cost of the call in rupees by multiplying the duration by the rate
        balance = balance - cost; //this will update the balance by subtracting the cost from the balance

        /** display results */
        
        System.out.println("Call Duration:= " + duration + " seconds"); //display the duration of the call
        System.out.println("Balance:= " + balance + " rupees"); //display the balance

    }
}