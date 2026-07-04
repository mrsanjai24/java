class q14{
    public static void main(String[]args)
    {
        int count = 0;
        for(int i=1;i<=10;i =i+1){
        if(i%2==0)
        {
           count = count+1;
           System.out.println("Even number - "+i);
        }
        else
        {
            // count = count+1;
             //System.out.println("odd number"+i);
        }
        }
         System.out.println(count);
    }
}