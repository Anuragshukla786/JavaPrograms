//If the marks of Robort in three Subjects are entered through keyboard(each out of 100),
//Write a program to calculate his total marks and percentage marks
import java.util.Scanner;
public class marksof3subject{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int math=sc.nextInt();
    
    int hindi=sc.nextInt();
    int java=sc.nextInt();
    int total_marks=math+hindi+java;
    int percentage=(total_marks/3);
    System.out.println(total_marks);
    System.out.println(percentage +"%");
    sc.close();
  }
}