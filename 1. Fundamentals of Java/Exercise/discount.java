public class discount
{
    public static void main(String[] args)
    {
        double purchase = 10000;
        double discount;
        double rate = 10; // on shopping above 5000
        double netpurchase = 0;

        /*Computing*/

        if(purchase>=5000)
        {
            discount = 5000*.10;
            netpurchase = purchase-discount;
        }

        /*Showing results */
        System.out.println("");
        System.out.println("");
        System.out.println("---------------shop.itfeelsharsh.dev----------------");
        System.out.println("");
        System.out.println("Purchase Amount is - " + purchase);
        System.out.println("");
        System.out.println("");
        System.out.println("Purchase Amount After Discounts is - " + netpurchase);
        System.out.println("");
        System.out.println("");
        System.out.println("---------Thank you for shopping, visit again-----------");
        System.out.println("");
        System.out.println("");
        
    }
}