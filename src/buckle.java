import java.util.Scanner;
public class buckle
{
    public static void main (String [] args)
    {
        int count, number;
        System.out.println ("Enter a number");
        Scanner keyboard = new Scanner (System.in);
        number = keyboard.nextInt ();
        count = 1;
        while (count <= number)
        {
            System.out.print (count + ", ");
            if (count==2)
            	System.out.println("buckle my shoes");
            else if (count==4)
            	System.out.println("shut the door ");
            else if (count==6)
            	System.out.println("pick up sticks ");
            else if(count==8)
            	System.out.println(" lay them straight ");
            else if	(count==10)
            	System.out.println(" begin again ");
            count++;
        }

        {
        	
        }

        	{

        	
        }
    }
}