
//Given Two numbers ,Return their sum  in the following format:
//Int t representing number of test cases T lines of Two integers
//Representing the number to be Added
import java.util.Scanner;

public class main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a + b);
    
    }
  }

}