
public class Casa {

	public static void main(String[] args) {
		int largura = 20;
		int comprimento = 20;
		double porcentConst = 50;	
		
		double resultado = Area(largura,comprimento);
		System.out.println(resultado);
		
	
		double resultado1 = Porcentagem(400,porcentConst);
		System.out.println(resultado1);
		
		double resultado3 = Total(largura,comprimento,porcentConst);
		System.out.println(resultado3);
	}
	
	public static double Area(double largura, double comprimento){
		double resultado = largura * comprimento;
		return resultado;
	}

	
	public static double Porcentagem(double Area, double porcentConst ){
		double resultado1 = Area * porcentConst /100 ;
		return resultado1;
	}
	
	public static double Total(int largura, int comprimento, double porcentConst   ){
		int custo = 60;
		double resultado2 = Area(largura, comprimento) ;
		double resultado3 = Porcentagem(resultado2, porcentConst);
		return resultado3 * custo;
	}
	


	
}
