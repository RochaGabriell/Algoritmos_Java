import java.util.*;

public class SJF{
	public static void main(String[] args) {
		Scanner wd = new Scanner (System.in);
    
		System.out.println("Escolha a quantidade de processos:");
    int x = wd.nextInt();
		int vet [] = new int [x];
		double media = 0;
		
		for(int i = 0; i < x; i++){
      System.out.println("Processos: " + i);
			vet [i] = wd.nextInt();
			media = media + vet[i];
		}

		int tempo = 0;
		Arrays.sort(vet);
		
		for(int i = 0; i < x; i++){
			System.out.print(i + "° = " + vet[i] + "; ");
		}

		System.out.println();
		
		for(int i = 0; i < x; i++) {
			System.out.println("P-[" + i + "] Executando em: " + tempo);
			vet[i] = vet[i]-1;
			tempo++;
			if(vet[i] == 0) {
				System.out.println("P-[" + i + "] Finalizado em: " + tempo);
				continue;
			}
			i--;
		}
		System.out.print("Média: " + media/x);
	}
}
