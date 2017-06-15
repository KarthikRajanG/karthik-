import java.util.Scanner;
public class power {
public static void main(String[] args){
	int answer=0;
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number: ");
	int n = input.nextInt();
	if(n!=0){
	answer=n*n;
	}
	System.out.println("the total number of the digit is: "+answer);
}
}
