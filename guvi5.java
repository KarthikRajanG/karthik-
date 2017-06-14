import java.util.Scanner;
public class greater {
	public static void main(String[] args){
		System.out.println("Enter the input: ");
		Scanner read=new Scanner(System.in);
		int a= read.nextInt();
		int b= read.nextInt();
		int c= read.nextInt();
		if((a>b)&&(a>c)){
			System.out.println("the number which is greater is "+a);
		}
		else if(b>c){
			System.out.println("the number which is greater is "+b);
		}
		else{
			System.out.println("the number which is greater is "+c);
		}
		}

	}
