public class squareRoot
{
    public static void main(String[] args)
    {
        int q = 6;
        for(int p = 5; p < q; p ++)
        {
            if(Math.sqrt(p) < 50)
            {
                System.out.println("SquareRoot of " + p + " is - " + Math.sqrt(q));
            }
            else
            {
                break;
            }
            p++;
        }
    }
}