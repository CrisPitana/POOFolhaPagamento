package app;

//SUBCLASSE CONCRETA FUNCIONARIO COMISSIONADO HERDA DA CLASSE PAI FUNCIONARIO
public class CommissionEmployee extends Employee {
	
	// VARIAVEIS DE INSTANCIA
	private double grossSales; // vendas Brutas
	private double commissionRate; // % comissão

	// CONSTRUTOR RECEBE DADOS GERAIS DA SUPERCLASSE FUNCIONARIO MAIS O SALARIO E COMISSÃO DA SUBCLASSE.
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// RETORNA VENDAS BRUTAS
	public double getGrossSales() {
		return grossSales;
	}
	
	//GRAVA VENDAS BRUTAS
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
  
	// RETORNA PORCENTAGEM DE COMISSÃO 
	public double getCommissionRate() {
		return commissionRate;
	}
	
	// GRAVA PORCENTAGEM DE COMISSÃO
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	// CALCULA RENDIMANTOS, SOBRESCREVE O METODO ORIGINAL EM EMPLOYEE
	// VENDAS BRUTAS X TAXA DE COMISSÃO
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	// RETORNA TOSTRING PRINCIPAL COM DADOS GERAIS DO FUNCIONÁRIO E MAIS VALOR DAS VENDAS E TAXA DE COMISSÃO
	@Override
	public String toString() {
		return "\nFUNCIONARIO COMISSIONADO \n" +
				super.toString() + " \nVendas Brutas: R$ " + getGrossSales() + "\nTaxa de Comissão: " + getCommissionRate() + "%";
	}
	
}
