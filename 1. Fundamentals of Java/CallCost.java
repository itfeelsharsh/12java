public class CallCost{
    public static void main(String[] args){
        double balance;
        double rate;
        double duration;
        double cost;

        balance=170;
        rate=1.02;
        duration=37;

        cost = duration * rate;
        balance= balance - cost;

        System.out.println("");
        System.out.println("--------CALL INFORMATION----------");
        System.out.println("Call Time: " + duration + " seconds");
        System.out.println("Class Cost: " + cost + " rupees");
        System.out.println("Balance: " + balance + " rupees");
        System.out.println("----------------------------------");
        System.out.println("");
    }
}