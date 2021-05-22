public class Funcionario {
	private String nome;
	private int matricula;
	private double salario;
	private static double salarioMaximo = 2400.0;
	
	public Funcionario (String nome, int matricula, double salario) {
		setNome(nome);
		setMatricula(matricula);
		setSalario(salario);
	}
	private void setMatricula(int matricula) {
		this.matricula = matricula;
		
	}
		
	private void setNome(String nome) {
		if(nome == null || nome == "") {
			this.nome = "(sem nome)";
		} else {
			this.nome = nome;          
		}
	}
		
	private void setSalario(double s) {
		if(s < 0) { 
			salario = 0;
		} else if(s > salarioMaximo) {
			salario = salarioMaximo;
		} else {
			salario=s;
		}
	}
		
	public int getMatricula() { 
		return matricula; 
	}
		
	public String getNome() { 
		return nome.toUpperCase(); 
	}
		
	public double getSalario() { 
		return salario; 
	}
		
	public double getTaxaInss(double salario) {
	    if(salario <= 720)  {
	    	return 7.65;
	    } else if(salario <= 1200) {
	    	return 9.0;
	    } else {
	    	return 11.0;
	    }
	  }
	  
	public double calcularInss() {
		double salario = this.getSalario();
	    return this.getTaxaInss(salario) * salario / 100;
	  }
	}