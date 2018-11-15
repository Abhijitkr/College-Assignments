import java.util.*;
class CheckPerfect
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        int n,i,p=0;
        System.out.print("\f");
        System.out.print("Enter the Number: ");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
                p=p+i;
        }
        if(p==n)
            System.out.println(n+" is a Perfect Number.");
        else
            System.out.println(n+" is not a Perfect Number.");
    }
}
       
            