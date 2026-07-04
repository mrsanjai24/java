import java.util.Scanner;
class q3{
    public static void main (String[]args)
    {
        Scanner sanjai = new Scanner(System.in);
        String Name = sanjai.nextLine();
        double Mark = sanjai.nextDouble();
        sanjai.nextLine();
        String Department = sanjai.nextLine();
        System.out.println("My Name is "+Name);
        System.out.println("My mark is "+Mark/10+"/10");
        System.out.print("My Department is "+Department);
    }
}