class Room
{
    float length, width, height;
    byte nWindows;
    static int totWindows;
    Room() {};
    Room (float l, float w, float h, byte n)
    {
        length = l; width = w; height = h;
        nWindows = n; totWindows+=n; 
    }
    Room(float l, float w)
    {
        length = l; width = w; height = 10;
        nWindows =1; totWindows=++;
    }
    double area()
    {
        return(length * width)
    }
    void display()
    {
        System.out.println("\n Length: " + length + "\n Width" + width);
        System.out.println()
    }
}