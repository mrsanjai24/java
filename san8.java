import java.util.Scanner;
class san8{
    public static void main(String[]args){
    int []mark = new int[5];
    Scanner sk = new Scanner (System.in);
    mark[0] = sk.nextInt();
    mark[1] = sk.nextInt();
    mark[2] = sk.nextInt();
    mark[3] = sk.nextInt();
    mark[4] = sk.nextInt();
    System.out.println(mark[0]+mark[1]+mark[2]+mark[3]+mark[4]);
    }
}