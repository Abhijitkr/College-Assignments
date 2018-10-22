import java.io.*;
class Electricityboard
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(in);
        String nm;
        float unit, amount;
        System.out.print("\f");
        System.out.print("Enter the Name: ");
        nm= br.readLine();
        System.out.print("Enter the Unit consumed: ");
        unit= Float.parseFloat(br.readLine());
        if(unit<=100)
        amount=(float) unit*1;
        else if(unit<=200)   
        amount=(float) ((100*1)+((unit-100)*1.75));
        else
        amount=(float) ((100*1)+(100*1.75)+((unit-200)*3));
        System.out.print("The Bill Amount is "+amount);
    }
}