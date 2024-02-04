
//input name, roll number and field of interest from user and print the format below
//name:xyz,Roll number:xyz,Field of interest:xyz
import java.util.Scanner;

public class Fieldof {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String first_name = sc.next();
    String last_name = sc.next();
    int rollno = sc.nextInt();
    String fieldofinterest = sc.next();
    System.out.println("Name : " + first_name + "" + last_name);
    System.out.println("Roll number: " + rollno);
    System.out.println("fieldofinterest: " + fieldofinterest);
  }
}