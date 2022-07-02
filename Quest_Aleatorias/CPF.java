import java.util.Scanner;
import java.lang.*;
class CPF {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        String a = tecla.nextLine();
        int cont = 10;
        int uu = 0;
        int total = 0;
        while(a.length() > uu){
          if(uu == 0 || uu == 1 || uu == 2 || uu == 4 || uu == 5 || uu == 6 || uu == 8 || uu == 9 || uu == 10){
            char t = a.charAt(uu);
            String b = Character.toString(t);
            int y = Integer.parseInt(b);
            total += y * cont;
            cont--;
          }
          uu++;
    }
    total *= 10;
    total %= 11;
    char h = a.charAt(12);
    String raimundo = Character.toString(h);
    int hh = Integer.parseInt(raimundo);
    int ba = 0;
    cont = 11;
    uu = 0;
   
    if(total == hh || (total == 10 && hh == 0)){
      while(a.length() > uu){
        if(uu == 0 || uu == 1 || uu == 2 || uu == 4 || uu == 5 || uu == 6 || uu == 8 || uu == 9 || uu == 10 || uu == 12){
          char t = a.charAt(uu);
          String b = Character.toString(t);
          int y = Integer.parseInt(b);
          ba += y * cont;
          cont--;
        }
        uu++;
    }
    ba *= 10;
    ba %= 11;
    char bb = a.charAt(13);
    String raimun = Character.toString(bb);
    int hu = Integer.parseInt(raimun);
    if(ba == hu || (total == 10 && hh == 0)){
      System.out.println("VALIDO");
    }else if(ba != hu || total != hh || (total == 10 && hh != 0)){
      System.out.println("INVALIDO!");
    }}
    else if(total != hh || (total == 10 && hh != 0)){
      System.out.println("INVALIDO!");
    }
   
   
  }
}
