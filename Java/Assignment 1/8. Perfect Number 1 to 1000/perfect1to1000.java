import java.util.*;
class perfect1to1000
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        System.out.println("The Perfect Numbers from 1 to 1000 are:-");
        for(int i=2;i<1000;i++)
        {
            int s=1;
            for(int j=2;j<i;j++)
            {   
                if(i%j==0)
                s=s+j;                
            }
            if(i==s)
            System.out.println(s);
        }
    }
}