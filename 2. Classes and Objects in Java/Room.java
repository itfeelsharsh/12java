class Room
{
    float length, width, height;
    byte nWindows;

    void setAttr(float l, float w, float h, byte n)
    {
        length = l;
        width = w;
        height = h;
        nWindows = n;
    }

    double area()
    {
        return(length * width);
    }

    void display()
    {
        System.out.println("\n\n Length -" + length);
        System.out.println("Width -" + width);
        System.out.println("Height -" + height);
        System.out.println("Windows -"+ nWindows + "\n\n");
    }

    //end of room class.

}

/*Using room class to create objects and process the code */

class RoomDemo
{
    public static void main(String args[])
    {
        //creating a new room object, with assigned default values to attributes.
        Room r1; //giving ref
        r1=new Room(); // both declare and create in new statement
        Room r2 = new Room();

        //------
        //Display two Room objects with their default values
        //------
        {
            r1.display();
            r2.display();

            //Now assigning the values to room objects

            r1.setAttr(18,12.5f,10,(byte)2);
            r2.setAttr(14,11,10,(byte)1);

            //Now displaying newer updated objects

            r1.display();
            r2.display();

            // Display area

            System.out.println("\n\n Area of room 1 with length " + r1.length + "width" + r1.width + "is" + r1.area() + "\n\n");
            System.out.println("Area of room 2 with length " + r2.length + "width" + r2.width + "is" + r2.area() + "\n\n");
        }
    }
}
