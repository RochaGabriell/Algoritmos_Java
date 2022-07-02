import java.util.Scanner;

class SequenciaPA{
    public static void main(String[] args){
        Scanner WD = new Scanner(System.in);
        
        int N1, N2, Quant, Rz, Cont, Seq;
        N1 = WD.nextInt();
        N2 = WD.nextInt();
        Quant = WD.nextInt();
        Cont = 0;
        
        if(N1>=N2){
            Rz = N2-N1;
            Seq = N1+Rz;
            while(Cont<Quant){
                System.out.println(Seq-Rz);
                Seq+=Rz;
                Cont++;
            }
        }  
        
        else if(N2>=N1){
            Rz = N2-N1;
            Seq = N1+Rz;
            while(Cont<Quant){
                System.out.println(Seq-Rz);
                Seq+=Rz;
                Cont++;
            }
        }  
    }
}
