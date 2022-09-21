import java.util.Scanner;

public class votacao {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1, n2, n3, x;

		System.out.println("Deputado presentes na sessão: ");
		n1= sc.nextInt();

		if( n1 < 100); {
			System.out.println("Sessão cancelada, números de deputados é inferiores do necessitado ");
		}  if(n1 >= 100) {

			System.out.println("Quantidade de votos favoraveis a lei:");
			n2= sc.nextInt();

			System.out.println("Escolha 1 para maioria simples e 2 para maioria qualificada: ");
			n3= sc.nextInt();

			x= (2/3) * n2;

			switch(n3) {
			case 1: 
				if (n2 > 50 ){
					System.out.print( "Lei aprovada ");
					break;	

				}else {
					System.out.println("Lei reprovada ");
					break;
				}

			case 2: 
				if (x > 50 ){
					System.out.print( "Lei aprovada ");
					break;	

				}else {
					System.out.println("Lei reprovada ");
					break;	

				}

			}

		} 
	}
}

