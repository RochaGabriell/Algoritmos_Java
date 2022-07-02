import java.util.*;

class RoundRobin{
  public static void main(String[]args){
    Scanner wd= new Scanner(System.in);

    int maiorvalor=0;
    int condicao=0;
    int tempo=0;
    
    System.out.println("INFORME O NUMERO DE PROCESSOS: ");
    int numerodeprocessos = wd.nextInt();
    int vetor[] = new int[numerodeprocessos];

    for(int i=0;i<numerodeprocessos;i++){
        System.out.println("DURAÇÃO DO  PROCESSO " + (i+1));
        vetor[i] = wd.nextInt();
    }
    
    System.out.println("INFORME O QUANTUM: ");
    int quantum= wd.nextInt();

    for(int i=0;i<numerodeprocessos;i++){
        if(vetor[i]>maiorvalor){
            maiorvalor = vetor[i];
            condicao=i;
        }
    }

    while(true){
        for(int i=0;i<numerodeprocessos;i++){
            for(int ii=0;ii<=quantum;ii++){
                if(vetor[i]>=0){
                    System.out.println("PROCESSO ["+(i+1)+"] - EXECUTADO EM: "+tempo);
                    vetor[i]--;
                    }
                    tempo++;
                }
                tempo--;
            }
            if(vetor[condicao]==0){
                break;
            }
        }
    }
}
