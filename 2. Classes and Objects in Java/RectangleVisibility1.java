class Rectangle
{
    private double length, width;
    Rectangle(double x, double y)
    {
        length=x; width=y;
    }
    Rectangle(){};
    double area()
    {
        return(length*width);
    }
    void display()
    {
        System.out.println("Rectangle with length = " + length + "width = " + width);
    }
}

class RectangleVisibility1
{
    public static void mail(String[]s)
    {
        Rectangle rect1;
        rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10,15);

        rect1.display();
        rect2.display();
        System.out.println("Area of Rectangle with length " + rect2.length + "width = " + rect2.width + "is" + rect2.area());
    }
}
