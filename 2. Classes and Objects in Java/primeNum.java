class PrimeNum
{
    static boolean isPrime(int n)
    {
        int i, last;

        if (n <= 1) return false;
        if (n < 4) return true;

        last = (int) Math.sqrt(n);
        for (i = 2; i <= last; i++)
        {
            if (n % i == 0) return false;
        }

        return true;
    }
}

class PrimeClassMethod
{
    public static void main(String[] args)
    {
        int i, n;
        System.out.println("Prime numbers between 3 and 100 are: ");
        for (n = 3; n < 100; n++)
        {
            if (PrimeNum.isPrime(n)) System.out.println(n);
        }
    }
}
