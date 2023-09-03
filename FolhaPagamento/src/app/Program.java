package app;

// PROGRAMA DE TESTE DE HIERARQUIA
public class Program {

	public static void main(String[] args) {
		// CRIANDO OBJETOS PARA CADA UMA DAS QUATRO CLASSES DE FUNCIONÁRIOS, POR MEIO DOS CONSTRUTORES.
		SalariedEmployee assalariado= new SalariedEmployee("Cristiane", "Pitana", "22777459", 300.00);
		HourlyEmployee horista = new HourlyEmployee("Paula", "Silva", "77785598", 15.00, 40);
		CommissionEmployee comissionado = new CommissionEmployee("Sandro", "Tavares", "787878787", 1500.00, .05);
		BasePlusCommissionEmployee salarioEComissao = new BasePlusCommissionEmployee("Alice", "Pitana", "01918423", 15000, .05, 300); 
		
		// IMPRIMINDO NA TELA CHAMANDO OS METODOS DE TOSTRING E EARNINGS
		System.out.println("LISTA DE FUNCIONÁRIOS ");
		System.out.println(assalariado.toString() + " \nGANHOS : R$ " +  assalariado.earnings());
		
		System.out.println(horista.toString() + " \nGANHOS : R$ " + horista.earnings());
		System.out.println(comissionado.toString() + " \nGANHOS : R$ " + comissionado.earnings());
		System.out.println(salarioEComissao.toString() + " \nGANHOS : R$ " + salarioEComissao.earnings());
	}
}
