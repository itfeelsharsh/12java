class Rectangle
{
double length, width;
void setAttributes(double x, double y)
{
length = x; width = y;
}
double area()
{
return(length * width);
}
void display()
{
System.out.println("Rectangle with length = " + length + "width = " + width);
}
}

class RectangleDemo
{
public static void main(String[] s)
{
Rectangle rect1;
rect1 = new Rectangle();
Rectangle rect2 = new Rectangle();
}
}