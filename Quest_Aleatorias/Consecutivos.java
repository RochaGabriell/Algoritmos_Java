import java.util.Scanner;

class Consecutivos {
  public static void main(String[]args){
    Scanner WD = new Scanner(System.in);

    int N, SeqAtual, SeqMaior, Num, Ant;
    N = WD.nextInt();
    SeqAtual=1;
    SeqMaior=1;
    Ant = 0;

    for(int Cont=0; Cont<N; Cont++){
      Num = WD.nextInt();

      if(Cont>0){
        if(Ant == Num){
          SeqAtual++;
        }
      }

      if(Cont == N-1 || Ant != Num){
        if(SeqAtual > SeqMaior){
          SeqMaior = SeqAtual;
          SeqAtual = 1;
        }
      }
      Ant = Num;
    }
    System.out.println(SeqMaior);
  }
}
