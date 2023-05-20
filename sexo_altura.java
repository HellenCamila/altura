import java.util.Scanner;

class Altura {
	
    public static void main (String args []){
   
		Scanner teclado = new Scanner(System.in);
	  
		int sexo ;
		double altura;
		  
		System.out.println("por favor insira o seu sexo(1 - para feminino oun 2- pra masculino):");
		sexo = teclado.nextInt();
		 
		System.out.println("Por Favor insira a sua altura:");
		altura = teclado.nextDouble();
		
		if (sexo == 2){
		 System.out.println("masculino");
		 System.out.printf("o peso ideal é:%f", (72.7 * altura) - 58);
		}
		if (sexo == 1){
	     System.out.println("femnino");
		 System.out.printf("o peso ideal é:%f", (62.1 * altura) - 44.7);
	}
  
  
      
    System.exit(0);
		
  
  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



















