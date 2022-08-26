public class Interest{
    public static void main(String[] args){

        double principal;
        double rate;
        double duration;
        double maturity;
        double interest;

        principal=10000;
        rate=8;
        duration=12;

        interest = principal * rate * duration / 100;
        maturity = principal + interest;

        System.out.println("");
        System.out.println("----------SCHOOL BANK----------");
        System.out.println("Principal amount: " + principal + " rupees");
        System.out.println("Depostie for duration of: " + duration + " months");
        System.out.println("Interest Amount: " + interest + " rupees");
        System.out.println("Maturity Amount: " + maturity + " rupees");
        System.out.println("");
    }
}