import java.util.Scanner;

class Op_Vetor {
  public static void main(String[] args) {
    Scanner wd = new Scanner(System.in);

    int n[] = new int[10];
    int cont = 0;
    boolean D = false;

    while(true){
      String x = wd.next();
      if(x.equals("S")){
        break;
      }
      else if(x.equals("A")){
        n[cont] = wd.nextInt();
        System.out.println(n[cont]);
        cont++;
      }
      else if(x.equals("L")){
        if(cont > 0){
          for(int i = 0; i < cont; i++){
            System.out.print(n[i] + ", ");
          }
          System.out.println("");
        }
        else{
          System.out.println("Vazio");
        }
      }
      else if(x.equals("B")){
        D = false;
        int d = wd.nextInt();
        for(int i = 0; i < cont;i++){
          if(d == n[i]){
            D = true;
            break;
          }
        }
        if(D == true){
          System.out.println("S");
        }
        else{
          System.out.println("N");
        }
      }
    }
  }
}//Gabril Rocha
