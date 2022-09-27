package empregado;

public class Employee {
    
    private String Name;
    private double GrossSalary;
    private double Tax;

    public String setName(String Name2) {
        this.Name = Name2;
        return this.Name;
    }

    public double setGrossSalary(double GrossSalary2) {
        this.GrossSalary = GrossSalary2;
        return this.GrossSalary;
    }

    public double setTax(double Tax2) {
        this.Tax = Tax2;
        return this.Tax;
    }

    public double NetSalary(){
        return this.GrossSalary - this.Tax;
    }
   
    public void increaseSalary(double percentage) {
		this.GrossSalary += (this.GrossSalary * percentage / 100.0);
	}
    @Override
	public String toString() {
		return Name + ", $ " + String.format("%.2f", NetSalary());
	}
    }


        
        
    

