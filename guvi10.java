import java.util.Scanner;
public class digit {
public static void main(String[] args){
	int n,t,i=0;
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number: ");
	n = input.nextInt();
	while(n!=0){
		t=n-(n-1);
		i=i+t;
		n/=10;
	}
	System.out.println("the total number of the digit is: "+i);
}
}
