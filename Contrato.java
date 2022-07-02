import java.util.Scanner;
class Contrato{
  public static void main(String[]args){
    Scanner wd = new Scanner (System.in);
	
	  int t, c;
	  String tec, con, rev;
	  boolean z = false;
	  t = wd.nextInt();
	  c = wd.nextInt();
	  tec = "" + t;
	  con = "" + c;
	  rev = "";
	
	  if(tec.equals("0") && con.equals("0")){
	  }
	  else{
		  for(int i = 0; i < con.length(); i++){
			  if(con.charAt(i) != tec.charAt(0){
				  rev += con.charAt(i);
			  }
		  }
	  	if(rev.equals("")){
		  	System.out.println("0");
	  	}
	  	else{
		  	for(int i = 0; i < rev.length(); i++){
		  		if(rev.charAt(i) == '0'){
		  			z = true;
		  		}
		  		else{
		  			z = false;
		  		}
	  		}
		  	if(z == true){
		  		System.out.println("0");
	  		}
	  		else{
	  			System.out.println(rev);
	  		}
	  	}
  	}
  }
}
