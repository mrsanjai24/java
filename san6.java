import java.util.Scanner;
class san6{
    public static void main(String[]args)
    {
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        int b = sk.nextInt();
        String mark = (a>b)? "A is greater":"B is greater";
        System.out.print(mark);
    }
}