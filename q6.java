import java.util.Scanner;
class q6{
    public static void main(String[]args)
    {
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt();
        if(num%2 == 0)
        {
            System.out.print("Even");
        }
        else{
            System.out.print("odd");
        }
    }
}