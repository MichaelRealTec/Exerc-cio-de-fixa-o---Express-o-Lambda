package entities;

import java.util.List;

public class Employee {
	// Atributos
	private String name;
	private String email;
	private Double salary;
	
	// Método Getter e Setter	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	// Método Construtor
	public Employee() {
		
	}
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	// Método
	public String toString() {
		return name + ","
				+ email + ","
				+ String.format("%.2f",salary) ;
	}
	
	public Double salaryIf(Double salary) {
		for(List list : l) {
			
		}
	}
}
