import java.util.Scanner;
public class leap {
	public static void main(String[] args){
		System.out.println("Enter the input: ");
		Scanner read=new Scanner(System.in);
		int a= read.nextInt();
         if(a%4==0){
        	 System.out.println("leap year");
         }
         else{
        	 System.out.println("not leap year");
         }
		}

	}
