import java.io.*;
class highlow
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int i,h=0,l=0,n;
        System.out.print("\f"); 
        System.out.println("Enter 10 number:- ");
        for(i=1;i<=10;i++)
        {            
            n=Integer.parseInt(br.readLine());
            if(i==1)
            {
                l=n;
                h=n;
            }      
            if(n<=l)
            l=n;
            else if(n>=h)
            h=n;
        }
        System.out.println("Highest: "+h+"\nLowest: "+l);
    }
}
            
                
            
            
