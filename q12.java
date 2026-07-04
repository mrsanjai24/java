import java.util.Scanner;
class q12{
    public static void main (String[]args)
    {
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        int b = sk.nextInt();
        for(int i=a;b>=i;i =i+1)
        {
            System.out.println(i);
        }
    }
}