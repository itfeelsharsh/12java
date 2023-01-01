class TicketPrice
{
    public static void main(String[] args)
    {
        int age = 15;
        int ticket = 0;
        float showtime = 10;
        if((age>=13))
        {
            if((showtime>=10))
            {
                ticket=100;
            }
            else
            {
                ticket=50;
            }
        }
        else if((age<13))
        {
            if((showtime>=10))
            {
                ticket=50;
            }
            else
            {
                ticket=30;
            }
        }
        
    System.out.println("");
    System.out.println("--------------- WELCOME TO HARSH MULTIPLEX--------------");
    System.out.println("");
    System.out.println("");
    System.out.println("Customer's Age - " + age);
    System.out.println("ShowTime - " + showtime);
    System.out.println("Ticket Price -" + ticket);
    System.out.println("");
    System.out.println("");
    System.out.println("-------------------THANK YOU VISIT AGAIN-----------------");
    System.out.println("");
    
    }

}