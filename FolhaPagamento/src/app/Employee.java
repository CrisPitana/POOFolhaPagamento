package app;

// SUPER CLASSE FUNCIONARIO
public abstract class Employee {

	// VARIAVEIS DE INSTANCIA
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	
	// CONSTRUTOR RECEBE OS DADOS GERAIS DO FUNCIONARIOS, QUE SERÃO COMPARTILHADAS NAS OUTRAS SUBCLASSES
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	//RETORNA NOME
	public String getFirstName() {
		return firstName;
	}

	// RETORNA SOBRENOME
	public String getLastName() {
		return lastName;
	}

	// RETORNA NUMERO DO SEGURO SOCIAL
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// RETORNA DADOS GERAIS DO FUNCIONARIO
	@Override
	public String toString() {
		return  getFirstName() + " " + getLastName() + " \nNº Seguro Social :" + getSocialSecurityNumber();
	}
	
	// INDICA QUE CADA SUBCLASSE DEVE FORNECER A IMPLEMENTAÇÃO APROPRIADA PARA CADA TIPO DE FUNCIONARIO
	public abstract double earnings() ;
		

}
