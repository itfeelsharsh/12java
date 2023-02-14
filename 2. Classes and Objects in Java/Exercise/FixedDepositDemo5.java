import java.io.*;
class FixedDeposit
{
    double princi_amt, intr, dur,comp_intr,totdeposit;
    public double calculateCompoundInterest()
    {
        comp_intr=(princi_amt)*(Math.pow(1+(intr/100), dur));
        return(comp_intr);
    }
    public void get() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Principal Amount");
        princi_amt=Double.parseDouble(dis.readLine());
        System.out.println("Enter Interest Rate");
        intr=Double.parseDouble(dis.readLine());
        System.out.println("Enter Duration");
        dur=Double.parseDouble(dis.readLine());
    }
    public void calculateTotalDeposit()
    {
        totdeposit=princi_amt+comp_intr;
    }
    public void displayTotalDeposit()
    {
        System.out.println("Total Deposit Is: " + totdeposit);
    }
    public void display()
    {
        System.out.println("principal amount is :" + princi_amt);
        System.out.println("interest amount is: " + intr);
        System.out.println("Duration is: " + dur);
        System.out.println("Compound Interest is: " + comp_intr);
    }
}

class FixedDepositDemo5
{
    public static void main(String[] args)throws Exception
    {
        FixedDeposit depo1 = new FixedDeposit();
        depo1.get();
        depo1.calculateCompoundInterest();
        depo1.calculateTotalDeposit();
        depo1.displayTotalDeposit();
        depo1.display();
    }
}