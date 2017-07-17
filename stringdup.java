import java.util.*;
public class stringdup {
	public static void main(String[] args) {
    String str1="aaaabcdee";
    char[] char1=str1.toCharArray();
    Set<Character> cset1= new LinkedHashSet<Character>();
    for(char c: char1){
    	cset1.add(c);
    }
    StringBuilder sb=new StringBuilder();
    for(char char2:cset1){
    	sb.append(char2);
    }
    System.out.println(sb);
	}
}