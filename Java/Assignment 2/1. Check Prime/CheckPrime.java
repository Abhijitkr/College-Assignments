import java.util.*;
class CheckPrime
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        int n,i,c=0;
        System.out.print("\f");
        System.out.print("Enter the Number: ");
        n=in.nextInt();
        for(i=1;i<=n;i++)        
            if(n%i==0)
                c++;
        if(c==2)
            System.out.println(n+" is a Prime Number.");
        else
            System.out.println(n+" is not a Prime Number.");
    }
}
       
            