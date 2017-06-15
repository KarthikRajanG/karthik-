import java.util.Scanner;
public class nature {
public static void main(String[] args){
	  int i=1;
      int sum=0;
  Scanner read=new Scanner(System.in);
  System.out.println("enter the  number: ");
  int number= read.nextInt();
  while(i<=number){
  sum=sum+i;
  i++;
  }
 System.out.println("the sum is: "+sum);
}
}

