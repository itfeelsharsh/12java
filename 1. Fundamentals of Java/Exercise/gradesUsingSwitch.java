class gradesUsingSwitch
{
    public static void main(String[] args)
    {
        int choice = 0;
        int marks = 600; // outta 700
        if (marks>599)
        choice = 1;
        else if(marks>500)
        choice = 2;
        else if(marks>300)
        choice = 3;
        switch(choice)
        {
            
            case 1:
            System.out.println("Your Grade is A+");
            break;
            
            case 2:
            System.out.println("Your Grade is B+");
            break;

            case 3:
            System.out.println("Your Grade is C+");
            break;

            default:
            System.out.println("Your Grade is D");
            
        }

    }
}