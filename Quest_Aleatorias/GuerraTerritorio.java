import java.util.*;
public class GuerraTerritorio {
	public static void main(String[] args) {
		Scanner wd = new Scanner (System.in);
		
		int secao[];
		secao = new int [100];
		int A, soma, n;
		A = 0;
		soma = 0;
		
		n = wd.nextInt();
		
		for(int i=1; i<=n; i++){
			secao[i]=wd.nextInt();
			A+=secao[i];
		}
		
		for(int i=1; i<=n; i++){
			soma+=secao[i];
			if(2*soma==A){
				System.out.print(i);
				break; 
			}
		}
	}
}
