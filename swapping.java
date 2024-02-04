//Write a program to Swap two numbers With the help of Third varible
public class swapping {
  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 4;
    System.out.println("The First number is Before Swapping :" + num1);
    System.out.println("The Second is number before Swapping :" + num2);
    int temp;
    temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("The First number after Swap is :" + num1);
    System.out.println("The Second is After swap :" + num2);

  }
}