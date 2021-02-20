/*
 get date in format of mm/dd/yyyy
 */
import java.util.Scanner;
public class Date_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Keyboard = new Scanner( System.in);
		String yes,no, string;
		int date;
		System.out.println("enter date");
	string = Keyboard.nextLine();
	string=string.trim();
	System.out.println(string);
	if (string.length()<10 || string.length()>10)
	{System.out.println(" wrong size , re-enter in format of mm/dd/yyyy ");
	System.exit(0);
	}
	else if (string.charAt(2)!='/' || string.charAt(5)!='/')
	{
		System.out.println(" enter in format of mm/ dd/yyyy");
	}
	int m=Integer.parseInt(string.substring(0, 2));
	
	int d=Integer.parseInt(string.substring(3, 5));
	int y=Integer.parseInt(string.substring(6));

	switch (m) //it has 30 days"
	{

	case 2:
		if( (y%4==0)||((y%400==0)&&!(y%100==0)))
		{
			
			if(d<1 || d >29) {
				System.out.println(" invaild entry , re-enter date as 1-29");
			}
			
		}
		else 
		{if (d<1||d>28)
			
			{System.out.println(" invaild entry , re-enter date as 1-28");
		}}
	break;
	case 4:
	case 6:
     case 9:
     case 11:
    	  if (d<1||d>30)
    	  {
    		  System.out.println(" invaild entry , re-enter date as 1-30");
    	  }
	break;
     case 1:
     case 3:
     case 5:
     case 7:
     case 8:
     case 10:
     case 12:
    	 if (d<1||d>31)
    	 {
    		 System.out.println(" invaild entry , re-enter date as 1-31");
    	 }
    break;
	default:; 
	System.out.println("invaild month , enter month as 1-12");
	System.exit(0);
	break;
	
	}
	System.out.println("the date is valid ");

	}}