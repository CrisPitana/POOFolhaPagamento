package app;

// SUBCLASSE CONCRETA ASSALARIADO HERDA DA CLASSE PAI FUNCIONARIO
public class SalariedEmployee extends Employee{

	//VARIAVEL DE INSTANCIA SALARIO SEMANAL
	private double weeklySalary;

	//CONSTRUTOR, RECEBE OS DADOS DA CLASSE PAI E MAIS O SALARIO SEMANAL DO ASSALARIADO. 
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	// METODOS GETS E SETS DO SALARIO SEMANAL 
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	// CALCULA OS RENDIMENTOS DO FUNCIONARIO ASSALARIADO, COMO NÃO POSSUI ADICIONAIS RETORNA O PROPRIO SALARIO.
	public double earnings() {
		return getWeeklySalary();
	}

	// RETORNA O TOSTRING DA CLASSE PAI COM OS DADOS GERAIS DO FUNCIONARIO E ACRESCENDA O SALARIO SEMANAL
	@Override
	public String toString() {
		return  "\nFUNCIONARIO ASSALARIADO \n" +
				super.toString() + " \nSalario Semanal R$ " + getWeeklySalary();
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}
