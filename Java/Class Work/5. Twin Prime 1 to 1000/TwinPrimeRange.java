import java.util.*;
class TwinPrimeRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        int i;    
        TwinPrimeRange obj = new TwinPrimeRange();
        for(i=1;i<=1000;i++)
        {
            if(obj.prime(i)==true && obj.prime(i+2)==true)
                System.out.println(i+","+(i+2));        
        }
    }
    boolean prime(int n)
    {
        int i,flag=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                flag++;
        }
        if(flag==2)
            return true;
        else
            return false;
    }
}