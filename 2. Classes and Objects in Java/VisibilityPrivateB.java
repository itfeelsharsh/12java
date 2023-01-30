class Rectangle
{
    private double length,width;
    Rectangle(double x, double y)
    {
        length=x; width=y;
    }
    double area()
    {
        Return(length*width);
    }
    void display()
    {
        System.out.println("Rectangle with length = " + length + "Width = " + width);
    }
    double getLength() {return length;}
    double getWidth() {return width;}
}

class VisibilityPrivateB
{
    public static void main(String[] s)
    {
        Rectangle rect1;
        rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10,15);

        rect1.display();
        rect2.display();
        System.out.println("Area od Rectangle with length " + rect2.getLength() + "width = " + rect2.getWidth() + "is" + rect2.area());
    }
}