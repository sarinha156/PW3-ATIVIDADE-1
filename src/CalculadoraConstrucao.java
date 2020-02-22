
public class CalculadoraConstrucao {
	public static void main(String[] args) {
		int largura = 20;
		int comprimento = 20;
		double porcentConst = 50;
		double diametro = 6;
		double custoCasa = Casa.Total(largura, comprimento, porcentConst);
		double custoPiscina= Piscina.Total(diametro);
		double total = custoCasa+custoPiscina;
		System.out.println("Custo da casa"+ String.format("R$ %.3f,R$ %.3f,R$ %.3f",custoCasa,custoPiscina,total ));
	
	}
	
}
