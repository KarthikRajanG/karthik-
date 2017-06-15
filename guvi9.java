import java.util.Scanner;
public class n {
public static void main(String[] args){
      int sum=0;
  Scanner read=new Scanner(System.in);
  System.out.println("enter the  number: ");
  int number= read.nextInt();
  for(int i=0;i<=number;i++){
  sum=sum+i;
  }
 System.out.println("the sum is: "+sum);
}
}

