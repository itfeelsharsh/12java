import java.io.*;
class Rectangle
{
    int length,breadth;
}
class Box extends Rectangle
{
    int height,vol;

    public void getData() throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter Length of Rectangle Box");
        length=Integer.parseInt(dis.readLine());
        System.out.println("Enter breadth of Rectangle Box");
        breadth=Integer.parseInt(dis.readLine());
        System.out.println("Enter height of rectangle box");
        height=Integer.parseInt(dis.readLine());
    }

    public void volume()
    {
        vol=length*breadth*height;
    }
    public void displayVolume()
    {
        System.out.println("volume of rectangle is : " + vol);
    }
}

public class RectangleBoxDemo
{
        public static void main(String[] args)throws Exception
        {
            Box box1=new Box();
            box1.getData();
            box1.volume();
            box1.displayVolume();
        }
}