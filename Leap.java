import java.util.*;
public class Ooc
{
    public static void main(String args[])
    {
        int n;
        Scanner io=new Scanner(System.in);
        n=io.nextInt();
        boolean flag=false;
        if(n%400==0)
        {
            flag=true;
        }
        else if(n%100==0)
        {
            flag=false;    
        }
        else if(n%4==0)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
