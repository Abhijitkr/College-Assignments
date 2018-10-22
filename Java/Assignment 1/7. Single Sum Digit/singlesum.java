import java.util.*;
class singlesum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,s=0,temp;
        System.out.print("\f");
        System.out.print("Enter the Number: ");
        n=in.nextInt();
        temp=n;
        while(n>0)
        {
            int rem=n%10;           
            s=s+rem;
            n=n/10;
            if(n==0 && s>9)
            {
                n=s;
                s=0;
            }
        }
        System.out.println("The Single Sum of "+temp+" is "+s);
    }
}