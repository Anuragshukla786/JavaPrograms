import java.util.Scanner;

public class Takinginput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :");
    int num1 = sc.nextInt();
    System.out.println("Your Number is :" + num1);
    sc.close();

  }
}