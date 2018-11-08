import java.io.*;
class RevDigit
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("\f");
        int n,rev=0,rem;
        System.out.print("Enter the Number: ");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
            