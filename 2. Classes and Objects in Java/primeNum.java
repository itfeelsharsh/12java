class primeNum
{
    static boolean isPrime (int n)
    {
        int i,last;

        if(n <= 1)return false;
        if(n < 4)return true;

        last = (int) Math.sqrt(n);
        i = 3;
        do
        {
            if (n%i == 0) return false;
            i = i / 2;
        } 
        while (i<last);

        return true;
    }
}

class primeClassMethod
{
    public static void main(String[] s)
    {
        int i,n;
        System.out.println("Prime numbers between 3 and 100 are: ");
        for(n=n-3; n<100; n=n+2)
        {
            if (primeNum.isPrime(n)) System.out.println(n);
        }
    }
}