import java.util.Scanner;
class q9{
    public static void main(String[]args)
    {
        Scanner sk = new Scanner (System.in);
        int tamil = sk.nextInt();
        int eng = sk.nextInt();
        int maths = sk.nextInt();
        int science = sk.nextInt();
        int social = sk.nextInt();
        int Mark = (tamil+eng+maths+science+social);
        int Total = (Mark/5);

        if(Total<35)
        {
            System.out.print(" Additional class is required");
        }
        else{
            System.out.print("You are good");
        }

    }
}