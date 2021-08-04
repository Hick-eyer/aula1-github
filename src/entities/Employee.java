package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	
	
	public Employee(String name, double grossSalary, double tax) {
		Name = name;
		GrossSalary = grossSalary;
		Tax = tax;
	}

	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(double tax) {
		Tax = tax;
	}
	
	

	public void IncreaceSalary(double percentage) {
		GrossSalary += (GrossSalary*percentage)/100;
	}
	public void DecreaceSalary(double percentage) {
		GrossSalary -= (GrossSalary*percentage)/100;
	}
	public String toString() {
		return "Nome:"+
				Name +
				"\nSalário:"+
				this.NetSalary();
	}
}
