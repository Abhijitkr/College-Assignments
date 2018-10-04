import java.util.*;
class armstrong
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n,s=0,temp,rem;
        System.out.print("Enter the number : ");
        n=in.nextInt();
        temp=n;
        while(n!=0)
        {
            rem=n%10;
            s=s+(rem*rem*rem);
            n=n/10;
        }
        if(s==temp)
        System.out.println(temp+" is an Armstrong number.");
        else
        System.out.println(temp+" is not an Armstrong number.");
    }
}
      
            
        