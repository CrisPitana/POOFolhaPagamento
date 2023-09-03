package app;

// Estende da classe CommissionEmployee, e é uma subclasse indireta da classe Employee
public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	// VARIAVEL DE INSTANCIA
	private double baseSalary; // Base salarial

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	// RETORNA A BASE SALARIAL
	public double getBaseSalary() {
		return baseSalary;
	}

	// GRAVA A BASE SALARIAL
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// CALCULA OS RENDIMENTOS, SOBRESCREVE O METODO EARNINGS EM COMMISSIONEMPLOYEE
	// NESSE CASO O FUNCIONARIO GANHA O SALARIO BASE E MAIS A COMISSÃO DAS VENDAS
	public double earnings() {
		// Soma o valor da comissão ao salario base.
		return getBaseSalary() + super.earnings(); 
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalario R$ " + getBaseSalary();
	}
	
	
	
	
	
	
	
	
	
	

}
