import java.util.*;
class SumDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        int n,rem,sum=0;
        System.out.println("Enter the Number: ");
        n=in.nextInt();
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}