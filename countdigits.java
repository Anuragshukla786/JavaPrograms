//Divide n by 10 until n>0 and count the no of division
import java.util.Scanner;
class countdigits{
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int numofdigits=0;
  int original_n=n;
  while(n>0){
  n=n/10;
  numofdigits++;

  }
System.out.println(+numofdigits+" = "+original_n);
  }  
}