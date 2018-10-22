import java.io.*;
class special
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int n,f,rem,s=0,temp;
        System.out.print("\f");
        System.out.print("Enter the Number: ");
        n=Integer.parseInt(br.readLine());
        temp=n;
        while(n>0)
        {
            f=1;
            rem=n%10;
            for(int i=1;i<=rem;i++)
            f=f*i;
            s=s+f;
            n=n/10;
        }
        if(s==temp)
        System.out.println(temp+" is a Special Number.");
        else
        System.out.println(temp+" is not a Special Number.");
    }
}
           
            