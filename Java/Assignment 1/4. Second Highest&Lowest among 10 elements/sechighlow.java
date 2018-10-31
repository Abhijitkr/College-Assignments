import java.io.*;
class sechighlow
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("\f");
        int sh=0,sl=0,l=0,h=0,n;
        System.out.println("Enter 10 Numbers:-");       
        for(int i=1;i<=10;i++)
        {
            n= Integer.parseInt(br.readLine());
            if(i==1)
            {
                l=n;
                h=n;
            }
            if(n<=l)
            {
                sl=l;
                l=n;
            }
            else if(n>=h)
            {
                sh=h;
                h=n;
            }
        }
        System.out.println("Second Hghest: "+sh+"\nSecond Lowest: "+sl);
    }
}
