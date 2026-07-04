import java.util.Scanner;
class q16{
    public static void main(String[]args)
    {
        System.out.print("Enter the  value:");
        Scanner sk = new Scanner(System.in);
        int k = sk.nextInt();
       // System.out.print("Enter the  value:");

        for(int i = k;i<=10;i=i+1){
            System.out.println(i+"x"+k+"="+i*k);

        }
    }
    //System.out.println(i+"x2");
}