class Rectangle
{
    private double length,width;

    Rectangle(double x, double y)
    {
        length = x; width = y;
    }
    Rectangle(){};

    double area(){return length * width;}
    void display()
    {
        System.out.println("Rectangle with length = " + length + "width = " + width);
    }
    double getLength(){return length;}
    double getWidth(){return width;}
    boolean isLarge(Rectangle rect)
    {
        if(area() > rect.area()) return true;
        else return false;
    }

}

class ObjectParameter
{
    public static void main(String[] s)
    {
        Rectangle rect1 = new Rectangle(8,20);
        Rectangle rect2 = new Rectangle(10,15);

        rect1.display();
        System.out.println("Area of Rectangle is " + rect1.area() + "\n");
        rect2.display();
        System.out.println("Area of Rectangle 2 is " + rect2.area() + "\n");
   
    }
}