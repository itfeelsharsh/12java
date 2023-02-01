class FixedDeposit
{
    double princi_amt, intr, dur, comp_intr;
    public FixedDeposit()
    {
        princi_amt=1000;
        intr=5;
        dur=3;
    }
    FixedDeposit(double p, double i, double d)
    {
        princi_amt=p;
        intr=i;
        dur=d;
    }
    double calculateCompoundInterest()
    {
        comp_intr=(princi_amt)*(Math.pow(1+(intr/100), dur));
        return(comp_intr);
    }
}

class FixedDepositDemo2
{
    public static void main(String args[])
    {
        FixedDeposit depo1=new FixedDeposit();
        System.out.println("Compound Interest for first object is :" + depo1.calculateCompoundInterest());

        FixedDeposit depo2=new FixedDeposit(1500,4.5,4);
        System.out.println("Compound Interest for Second object is :" + depo2.calculateCompoundInterest());
    }
}