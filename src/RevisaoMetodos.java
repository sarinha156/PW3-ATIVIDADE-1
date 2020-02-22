
public class RevisaoMetodos {

	public static int Proximo(int num) {
		return num + 1;
	}

	public static int dobroProximo(int num) {
		int resultado2 = Proximo(num) *2;
		return resultado2; 
	}
 
	
	public static void main(String[] args) {
		int resultado = Proximo(5);
		System.out.println(resultado);
		
		int resultado2 = dobroProximo(5);
		System.out.println(resultado2);


	}


	
}
