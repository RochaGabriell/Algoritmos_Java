import java.util.*;

public class OrdenacaoCrescente{
  public static void main(String[]args){
    Scanner wd = new Scanner(System.in);

    int [] vet = new int [10];
    int n;

    for(int cont = 0; cont < 10; cont++){
        n = wd.nextInt();
        vet [cont] = n;
    }

    Arrays.sort(vet);
    
    for(int cont = 0; cont < 10; cont++){
        System.out.println(vet[cont]);
    }
  }
}
