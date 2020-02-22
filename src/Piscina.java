
public class Piscina {

	public static void main(String[] args) {
		double diametro = 6;

		double resultado = Area(diametro);
		System.out.println(resultado);
		
		double resultado1 = Raio(diametro);
		System.out.println(resultado1);
		
		double resultado2 = Total(diametro);
		System.out.println(resultado2);
		
	}
	
	public static double Area(double diametro){
		double resultado = Math.PI * Math.pow(Raio(diametro), 2);
		return resultado;
	}

	public static double Raio(double diametro){
		double resultado1 = diametro / 2;
		return resultado1;
	}
	
	public static double Total(double diametro){
		double custo = 75;		
		double raio = Raio(diametro);
		double area = Area(raio);
		double resultado2 = area * custo;
		return resultado2;
	}
}



