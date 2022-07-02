import java.util.*;

public class Primos_Intervalo{
	public static void main(String[] args) {
		Scanner wd = new Scanner (System.in);
	
		int ni, nf, i, j;
		
		ni = wd.nextInt();
		nf = wd.nextInt();
		
		boolean p;
		
		for(i = 0; i <= nf; i++){
			p = true;
			if(i == 1){
				p = false;				
			}if (p){
				if(i%2 == 0 && i != 2){
					p = false;
				}
			}if (p){
				for (j = 2; j <=(i/2); j++){
					if(i%j == 0){
						p = false;
						break;
					}
				}
			}if (p){
				System.out.print(i + " ");
			}
		}
	}
}
