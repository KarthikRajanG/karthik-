import java.util.Scanner;
public class alpha {
	public static void main(String[] args){
		System.out.println("Enter the input: ");
		Scanner read=new Scanner(System.in);
		char ch= read.next().charAt(0);
		if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))){
			
				System.out.println("the given  is alphabet ");
		}
		else{
			System.out.println("the given is not a  alphabet");
		}
		}

	}
