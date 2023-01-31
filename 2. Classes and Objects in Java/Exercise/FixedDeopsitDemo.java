class FixedDeposit
{
    int principle,rate,year;
    void setAttr(int p, int r, int n)
    {
        principle = p;
        rate = r;
        year = n;
    }

    int compint()
    {
        return(principle * (1 + rate/100) * year);
    }

    void display()
    {
        System.out.println("\n ----------------BANK---------------- \n\n Principle = " + principle);
        System.out.println("\n Rate = " + rate);
        System.out.println("\n Year =  " + year + "\n\n --------------------------------");
    }
}

class FixedDepositDemo
{
    FixedDeposit f1 = new FixedDeposit();
    FixedDeposit f2 = new FixedDeposit();

    f1.setAttr(1500,10,2);
    f2.setAttr(1000,9,3);   

    System.out.println("\n\n Principle Amount = " + f1.principle + "Rate = " f1.rate + "Year = " f1.year + "Compound amount is = " + f1.compint());
    System.out.println("\n Principle amount = " + f2.principle + "Rate = " + f2.rate + "Year = " + f2. year + "Compound amout is = " + f2.compint());
}