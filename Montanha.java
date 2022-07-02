import java.util.Scanner;

class Montanha {
  public static void main(String [] args) {
    Scanner WD = new Scanner(System.in);  

    int N;
    int A[];
    N = WD.nextInt();                        
    A = new int[N];
        
    for (int G=0; G<N; G++){
      A[G] = WD.nextInt();                 
    }
    for (int G=2; G<N; G++) {              
      if (A[G-2]>A[G-1] && A[G]>A[G-1]) {
        System.out.print("S");
        return;
      }
    }
    System.out.print("N");                
  }
}
