package app;

// SUBCLASSE CONCRETA FUNCIONARIO HORISTA HERDA DA CLASSE PAI FUNCIONARIO
public class HourlyEmployee extends Employee{
	
	// VARIAVEIS DE INSTANCIA
	private double wage; // valor da hora
	private double hours; // horas trabalhadas

	// CONSTRUTOR RECEBE OS DADOS GERAIS DA SUPERCLASSE E MAIS OS DADOS DO FUNCIONARIO HORISTA 
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage,
			double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	// RETORNA SALARIO
	public double getWage() {
		return wage;
	}
	
	// GRAVA SALARIO
	public void setWage(double salario) {
		this.wage = salario;
	}
	
	// RETORNA HORAS
	public double getHours() {
		return hours;
	}
	
	// GRAVA HORAS
	public void setHoras(double hours) {
		this.hours = hours;
	}

	// CALCULA OS RENDIMENTOS DE ACORDO COM OS DADOS DE SALARIO E HORAS TRABALHADAS
	public double earnings() {
		if (getHours() <= 40) return getWage() * getHours();
		else return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}

	// RETORNA STRING COM DADOS DO FUNCIONARIO HORISTA. (inclusive o toString da classe pai com dados gerais do funcionario)
	@Override
	public String toString() {
		return  "\nFUNCIONARIO HORISTA \n" +
				super.toString() + "\nValor da hora R$ " + getWage() + " \nHoras Trabalhadas : " + getHours();
		}

}
