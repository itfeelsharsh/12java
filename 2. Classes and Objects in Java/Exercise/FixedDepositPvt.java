import java.io.*;
class FixedDeposit
{
    private double princi_amt, intr, dur, comp_intr;
    public double calculateCompoundInterest()
    {
        comp_intr = (princi_amt) * (Math.pow(1 + (intr / 100), dur));
        return (comp_intr);

    }
    public void get() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter principal amount");
        princi_amt = Double.parseDouble(dis.readLine());
        System.out.println("Enter Interest Rate");
        intr = Double.parseDouble(dis.readLine());
        System.out.println("Enter duration");
        dur = Double.parseDouble(dis.readLine());
    }
    public void display()
    {
        System.out.println("Principal Amount is = " + princi_amt);
        System.out.println("Interest Rate is = " + intr);
        System.out.println("Duration is =" + dur);
        System.out.println("Compound Interest is = " + comp_intr);
    }
}

class FixedDepositPvt
{
    public static void main(String[] args) throws Exception
    {
        FixedDeposit depo1 = new FixedDeposit();
        depo1.get();
        depo1.calculateCompoundInterest();
        depo1.display();
    }
}
