import java.util.Scanner;
publi class fact{
public static void main(String[] args){
	  int fact=1;
	  Scanner read=new Scanner(System.in);
	  System.out.println("enter the  number: ");
	  int number= read.nextInt();
	  for(int i=1;i<=number;i++){
	  fact=fact*i;
	  }
	 System.out.println("the factorial of given number is: "+fact);
	}
	}


  