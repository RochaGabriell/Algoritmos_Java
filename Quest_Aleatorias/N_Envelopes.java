import java.util.Scanner;
public class N_Envelopes {
	public static void main(String[] args) {
    Scanner WD = new Scanner(System.in);

    int quant, cont, menor, x;
    quant = WD.nextInt();
    menor = 10000;
    cont = 0;

    
		while(cont<quant){
      x = WD.nextInt();
      
			if(x<menor){
        menor=x;	
      }
      cont++;
    }
    System.out.println(menor);
  }
}