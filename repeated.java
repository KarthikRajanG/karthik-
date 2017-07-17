import java.util.*;
import java.util.Scanner;
public class repeated {
  public static void main(String[] args){
	  Scanner scan=new Scanner(System.in);
      int len=scan.nextInt();
	  int[] a=new int[len];
     for(int i=0;i<a.length;i++){
    	  a[i]=scan.nextInt();
      }
      HashSet<Integer> hash =new HashSet<Integer>();
      for(int j=0;j<a.length;j++){
    	  for(int k=j+1;k<a.length;k++){
    		  if(a[j]==a[k]){
    			  hash.add(a[j]);
    		  }
    	  }
      }
      System.out.println(hash);
  }
}