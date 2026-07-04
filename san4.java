import java.util.Scanner;
class san4{
    public static void main(String[]args)
    {
       Scanner sk = new Scanner(System.in);
       int num1 = sk.nextInt();
       int num2 = sk.nextInt();

       if(num1==num2)
       {
        System.out.print("yes it is equal");
       }
       else{
        System.out.print("No it is not equal");
       }
    }
}