import java.util.*;
class StringAbbrivate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        String name,str="";
        char ch;
        int len,c=0,i;
        System.out.print("Enter your Full Name: ");
        name=in.nextLine();
        name=" "+name;
        len=name.length();
        for(i=0;i<len-1;i++)
        {
            ch=name.charAt(i);
            if(ch==' ')
            {
                c++;
                if(c<=2)
                    System.out.print(name.charAt(i+1)+".");   
            }
            if(c>2) 
                str=str+name.charAt(i+1); 
        }
        System.out.print(str);
    }
}