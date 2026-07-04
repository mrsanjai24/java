import java.util.Scanner;
class san9{
    public static void main(String[]args){

        Scanner sk = new Scanner(System.in);
        int[] mark = new int[5];

        for(int i =0;i<=4;i =i+1)
        {
            mark[i] = sk.nextInt();
        }
        for(int i =0;i<=4;i=i+1)
        {
        System.out.println(mark[i]);
        }
    }
}