import java.util.Scanner;
class sumofdigits{
  public static void  main (String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sumofdigits=0;
    int original_n=n;
    while(n>0){
      sumofdigits +=n%10;
      n=n/10;
      System.out.println(+sumofdigits+ "="+original_n );
    }
    
  }
}