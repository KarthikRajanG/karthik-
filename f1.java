import java.util.Scanner;
class posneg{
public static void main(String[] args){
 Scanner s=new Scanner(System.in);
 int num=s.nextInt();                                       // 0 is assumed to be neither positive nor negative//
  if(num>0){
   System.out.println("The given number is Positive");
   }
   else if(num<0){
   System.out.println("The given number is negative");
   }
   else{
   System.out.println("The given number is neither positive nor negative");
  }
 }
} 
      