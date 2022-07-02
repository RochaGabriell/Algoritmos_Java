import java.util.Scanner;
 
public class Xadrez {
  
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int l = in.nextInt();
    int c = in.nextInt();
 
    if ( (l+c) % 2 == 0)
 	   System.out.println(1);
    else
 	   System.out.println(0);
   }
}
