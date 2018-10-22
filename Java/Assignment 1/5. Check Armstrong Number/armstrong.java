import java.io.*;
class armstrong
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int n,check,arm=0,rem;
        System.out.print("\f");
        System.out.print("Enter the Number: ");
        n=Integer.parseInt(br.readLine());
        check=n;
        while(n>0)
        {
            rem=n%10;
            arm=arm+rem*rem*rem;
            n=n/10;
        }
        if(arm==check)
        System.out.println(check+" is an Armstrong Number.");
        else
        System.out.println(check+" is not an Armstrong Number.");
    }
}
            
       