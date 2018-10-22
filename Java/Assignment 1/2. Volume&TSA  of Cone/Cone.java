import java.io.*;
class Cone
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        double r,h;
        float tsa,v;
        System.out.print("\f");
        System.out.println("Enter the Radius and Height of the Cone:-");
        r=Double.parseDouble(br.readLine());
        h=Double.parseDouble(br.readLine());
        v=(float) ((1.0/3)*(22/7)*r*r*h);
        tsa=(float) ((22/7)*r*(r+Math.sqrt(r*r+h*h)));
        System.out.println("The Volume of the Cone is "+v);
        System.out.println("The Total Surface area of the Cone is "+tsa);
    }
}
  