import java.util.*;
class prime1to1000
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");        
        for(int i=2;i<=1000;i++)
        {
            int flag=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                flag=1;
            }
            if(flag==0)
            System.out.print(i+" ");
        }
    }
}
      
        
