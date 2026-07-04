import java.util.Scanner;
class q11{
    public static void main(String[]args)
    {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        int Salary = sk.nextInt();
        System.out.println("Enter Your Age");
        int Age = sk.nextInt();
       
       if(Salary>=20000|| Age<25)
       {
        System.out.println("Elidgible");
        System.out.println("Enter the loan Amount");
        int loan = sk.nextInt();
        if(loan>50000)
        {
            System.out.print("Maximum loan amount is 50000");
        }
            else if (loan<50000)
            {
                System.out.print("loan available");
            }
        
       
       else{
        System.out.print("Not elidgible");
       }

    }
    }
}
