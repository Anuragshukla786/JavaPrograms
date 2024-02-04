import java.util.Scanner;

public class SI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter principal");
    float p = sc.nextFloat();

    System.out.println("Enter Rate of interest:");
    float r = sc.nextFloat();

    System.out.println("Enter the Time of interest:");
    float t = sc.nextFloat();
    float si = (p * r * t) / 100;
    System.out.println("Principal:" + p);
    System.out.println("Rate" + r);
    System.out.println("Time: " + t);
    System.out.println("Simpple interest:" + si);
    sc.close();
  }
}