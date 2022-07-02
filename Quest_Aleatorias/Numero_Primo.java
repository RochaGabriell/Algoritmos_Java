import java.util.Scanner;

class Numero_Primo {
  public static void main(String[]args){
    Scanner WD = new Scanner(System.in);

    int NunPrimo, X, Cont;
    NunPrimo = WD.nextInt();
    X = 0;
    Cont = 1;

    while(Cont<=NunPrimo){
      if(NunPrimo%Cont == 0){
        X++;
      }
      Cont++;
    }

    if(X == 2){
      System.out.println("É primo");
    }else{
      System.out.println("Não é primo");
    }
  }
}
