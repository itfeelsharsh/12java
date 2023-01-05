class printLoin
{
    static void printline()
    {
        for (int i=0; i<40; i++)
        System.out.println("=");
        System.out.println();
    }

    static void printline(int n)
    {
        for (int i=0; i<n; i++)
        System.out.println("#");
        System.out.println();
    }
    {
        static void printline(char ch, int n);
        for (int i=0; i<n; i++)
        System.out.prinln(ch);
        System.out.println();
    }
}

public class methodOverloading
{
    public static void main(String[] s)
    {
        printLoin.printline();
        printLoin.printline(30);
        printLoin.printline('+', 20);
    }
}