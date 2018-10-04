import java.io.*;
public class Area
{
    int area(int s)
    {
        return(s*s);
    }
    int area(int l, int b)
    {
        return(l*b);
    }
    double area(double r)
    {
        return(3.14*r*r);
    }
     public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double a,radius;
        int side,len,breadth;
        int ch;
        System.out.println("Enter your choice to find the area of:-\n 1. Square\n 2. Rectangle\n 3. Circle");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
            System.out.println("Enter the side of the square: ");
            side=Integer.parseInt(br.readLine());
            Area a1 = new Area();
            a=a1.area(side);
            System.out.println("The area of the square is "+a);
            break;
            case 2:
            System.out.println("Enter the length and breadth of the rectangle: ");
            len=Integer.parseInt(br.readLine());
            breadth=Integer.parseInt(br.readLine());
            Area a2 = new Area();
            a=a2.area(len, breadth);
            System.out.println("The area of the rectangle is "+a);
            break;
            case 3:
            System.out.println("Enter the radius of the circle: ");
            radius=Double.parseDouble(br.readLine());
            Area a3 = new Area();
            a=a3.area(radius);
            System.out.println("The area of the circle is "+a);
            break;
            default:
            System.out.println("Invalid Choice !");
            break;
        }
    }
}
            
            
            
    

   