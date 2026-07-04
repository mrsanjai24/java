import java.util.Scanner;
class q2{
    public static void main (String[]args)
    {
        Scanner sanjai = new Scanner(System.in);
        int a = sanjai.nextInt();
        int b = sanjai.nextInt();
        int c = sanjai.nextInt();
        int d = (a*b*c);
        int e = (a+b+c);
        System.out.print(d/e);
    }
}