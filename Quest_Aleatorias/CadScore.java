import java.util.Scanner;

class CadScore {
  public static void main(String[]args){
    Scanner WD = new Scanner(System.in);

    int P, N, F, X, Cont;
    P = WD.nextInt();
    N = WD.nextInt();
    X = 0;
    Cont = 0;

    while(Cont<N){
      F = WD.nextInt();
      X+=F;
      if(Cont==0){
        X+=P;
      }if(X>=100){
        X=100;
      }if(X<0){
        X=0;
      }
      Cont++;
    }
      System.out.println(X);
  }
}
