import java.util.Scanner;

public class binario {
  public static void main(String[] args){
    Scanner wd = new Scanner(System.in);
    
    int n; String bi;
    n = wd.nextInt();
    bi= Integer.toBinaryString(n);

    System.out.println(bi);
  }
}
