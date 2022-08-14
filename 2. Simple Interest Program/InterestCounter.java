// compute simple interest

public class InterestCounter
{
    public static void main(String[] args)
    {
    /* declaring variables */

    double principal;       // principal amount in rupees
    double rate;            // interest rate in percentage
    double duration;        // duration in years
    double maturity;        // maturity amount in rupees
    double interest;        // interest amount in rupees

    /* initialize variables */

    principal = 20000;       // initial principal amount
    rate = 9.50; // rate of interest in percentage
    duration = 2; // duration in years

    /* computations */

    interest = principal * duration * rate / 100; // counting interest amount by multiplying the principal amount by the duration by the rate and dividing it by 100
    maturity = principal + interest; // counting maturity amount by adding the principal amount by the interest amount by multiplying the duration by the rate and dividing it by 100

    /** display results */

    System.out.println("Principal amount:= " + principal + " Rupees"); //display the principal amount
    System.out.println("Deposit for duration of " + duration + " years"); //display the duration of the deposit
    System.out.println("Interest Rate " + rate + "%"); //display the interest rate
    System.out.println("Interest Amount:= " + interest + " Rupees"); //display the interest amount
    System.out.println("Maturity Amount:= " + maturity + " Rupees"); //display the maturity amount
}
}