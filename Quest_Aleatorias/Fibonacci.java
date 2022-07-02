import java.util.Scanner;
 
class Fibonacci {
  public static void main(String [] args) {
    Scanner WD = new Scanner(System.in);

    int n0, n1, n2;
    n0 = WD.nextInt(); 
    n1 = 0;
    n2 = 1;

    if(n0==0){
      System.out.println(n1);

      for(int i = 0; i<n0-1; i++){
        n2 = n1 + n2;
        n1 = n2 - n1;
        System.out.print(n2 + "\n");
      }
    }
    
    else{
      System.out.println(n1);
      System.out.println(n2);
  
      for(int i = 0; i<n0-1; i++){
        n2 = n1 + n2;
        n1 = n2 - n1;
        System.out.print(n2 + "\n");
      }
    }
  }
}
