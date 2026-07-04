import java.util.Scanner;
class q1{
    public static void main (String[]args)
    {
     Scanner sanjai = new Scanner(System.in);
     String Name = sanjai.nextLine();
     int Age = sanjai.nextInt();
     sanjai.nextLine();
     String Address = sanjai.nextLine();
     System.out.println("my name is - " +Name);
     System.out.println("my age is - " +Age);
     System.out.print("my address is - "+Address);
    
    }
}                      