import java.io.*;
class CheckArmstrong
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int n,rem,arm=0,check;
        System.out.print("\f");
        System.out.print("Enter the Number: ");
        n=Integer.parseInt(br.readLine());
        check=n;
        while(check>0)
        {
            rem=check%10;
            arm=arm+(rem*rem*rem);
            check=check/10;
        }
        if(arm==n)
           System.out.println(n+" is an Armstrong Number.");
        else
            System.out.println(n+" is not an Armstrong Number."); 
    }
}
       
            