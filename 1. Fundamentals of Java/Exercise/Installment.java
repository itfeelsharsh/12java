public class Installment
{
    public static void main(String[] args)
    {
        double p,q;
        double rate = 12;
        double interest = 0, m_installment=0;
        int month = 36;
        for(p=10000;p<=100000;p=p+10000)
        {
            interest=(p*rate*month)/1200;
            q=p+interest;
            m_installment=q/36;
            System.out.println("");
            System.out.println("-----------BANK OF EARTH-----------");      
            System.out.println("");
            System.out.println("Principle Amount - " + p);      
            System.out.println("36 Monthls Installment - " + m_installment);
        }
    }
}