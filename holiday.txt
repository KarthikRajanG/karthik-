import java.util.Scanner;
public class holiday {
   public static void main (String[] args){
	   Scanner scan=new Scanner(System.in);
	   String day=scan.next();
	  if((day.equals("saturday"))||(day.equals("sundaty"))){
		  System.out.println("false");
	  }
	  if((day.equals("monday"))||(day.equals("tuesday"))||(day.equals("wednesday"))||(day.equals("thursday"))||(day.equals("friday"))){
		  System.out.println("true");
	  }
   }
}
 