import java.util.Scanner;
class q5
{
    public static void main(String[]args)
    {
       Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        if(a%3 == 0&&a%5==0)
        {
            System.out.print("Divisible");
        }
        else{
            System.out.print("Not Divisible");
                   }
    }
}