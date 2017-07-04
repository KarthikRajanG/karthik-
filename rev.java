package guvi;
import java.util.Scanner;
public class rev {
	public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	String s1=num.next();
    String s2=new StringBuffer(s1).reverse().toString();
   System.out.println(s2);
	}
}
