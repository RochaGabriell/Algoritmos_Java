import java.util.Scanner;

public class SubstituicaoVetor {
    public static void main(String[] args) {
        Scanner wd = new Scanner(System.in);

        int vet[] = new int[10];
        int pos[] = new int[10];
        int aux, pont, z;

        for (int i = 0; i <= 9; i++) {
            vet[i] = wd.nextInt();
        }

        aux = vet[0];
        pos[0] = 0;
        pont = 0;

        for (int i = 1; i <= 9; i++) {
            if (aux > vet[i]) {
                aux = vet[i];
                pos[i - 1] = i;
            }
            if (aux == vet[i]) {
                pos[pont + 1] = i;
                pont++;
            }
        }

        System.out.println("Menor: " + aux);
        System.out.print("Ocorrencias: ");

        for (int i = 0; i <= pont; i++) {
            if(i<pont){
                System.out.print(pos[i] + " ");
            }
            else{
                System.out.print(pos[i]);
            }
        }

        for (int i = 0; i <= pont; i++) {
            z = pos[i];
            vet[z] = -1;
        }

        System.out.println();

        for (int i = 0; i <= 9; i++) {
            if(i <9){
                System.out.print(vet[i] + " ");
            }
            else{
                System.out.print(vet[i]);
            }
        }
    }
}
