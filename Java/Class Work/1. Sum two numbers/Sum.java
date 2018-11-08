import java.io.*;
class Sum
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("\f");
        System.out.println("Enter 2 nos: ");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("Sum: "+(a+b));
    }
}