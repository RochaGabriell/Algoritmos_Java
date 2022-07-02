import java.util.Scanner;
public class Alarme_Despertador {
	public static void main(String[] args) {
		Scanner wd = new Scanner (System.in);
		
		int h1, m1, h2, m2, t1, t2;
		
		while (true){
			
   		h1 = wd.nextInt();
   	 	m1 = wd.nextInt();
  	  	h2 = wd.nextInt();
	   	m2 = wd.nextInt();
    
   		 if (h1==0 && h2==0 && m1==0 && m2==0){
   	  	   break;
 		   }
    
	   	 t1 = (h1 * 60) + m1;
		    t2 = (h2 * 60) + m2;
        
		    if (t1 < t2){
 	   	    System.out.println(t2-t1);
		    }
 		   else{
        		System.out.println(1440+(t2-t1));
	    	}
    	}
	}
}
