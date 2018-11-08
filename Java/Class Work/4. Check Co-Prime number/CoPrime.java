import java.util.*;
class CoPrime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        int a,b,min,hcf=1,i;
        System.out.println("Enter 2 Nos.: ");
        a=in.nextInt();
        b=in.nextInt();
        min=a<b?a:b;
        for(i=1;i<=min;i++)
        if(a%i==0 && b%i==0)
        {
            hcf=i;
        }
        if(hcf==1)
        System.out.println("Co-Prime.");
        else
        System.out.println("Not Co-Prime.");
    }
}