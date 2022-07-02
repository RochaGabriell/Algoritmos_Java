import java.util.Scanner;

public class Sub_Prime {
    public static void main(String[] args) {
        Scanner wd = new Scanner(System.in);

        int Bancos, debentures, db, cb, v;
        boolean Sera;

        while (true) {
            Bancos = wd.nextInt();
            debentures = wd.nextInt();
            if (Bancos == 0 && debentures == 0) {
                break;
            }
            int[] vet = new int[Bancos];
            for (int i = 0; i < Bancos; i++) {
                vet[i] = wd.nextInt();
            }
            for (int i = 0; i < debentures; i++) {
                db = wd.nextInt();
                cb = wd.nextInt();
                v = wd.nextInt();
                vet[db - 1] -= v;
                vet[cb - 1] += v;
            }
            Sera = true;
            for (int i = 0; i < Bancos; i++) {
                if (vet[i] < 0) {
                    Sera = false;
                    break;
                }
            }
            if (Sera) {
                System.out.println("S");
            } 
            else {
                System.out.println("N");
            }
        }
    }
}
