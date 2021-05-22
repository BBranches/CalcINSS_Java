import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoInss {
	
	public static void main(String[] args) {
		Funcionario[] novoFuncionario = new Funcionario[10];
		DecimalFormat decimal = new DecimalFormat("#.###");
	
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<novoFuncionario.length; i++) {
			String nome = "";
			int matricula = 0;
			double salario = 0.0;
			
			System.out.println("Insira o nome do funcionário: ");
			nome = scanner.nextLine();
			
			while(true) {
			  try {
					System.out.println("Insira a matrícula do funcionário(a) "+nome+": ");
					matricula = Integer.parseInt(scanner.nextLine());
					break;
				} 
			  catch (Exception e) {
					System.out.println("Valor inválido!");
				}
			}
		  while(true) {
		    try {
				  System.out.println("Insira o salário do funcionário(a) "+nome+": ");
				  salario = (Double.parseDouble(scanner.nextLine()));
				  novoFuncionario[i] = new Funcionario(nome, matricula, salario);
				  break;
				} 
				catch (Exception e) {
				  System.out.println("Valor inválido!");
				}
		  }    	    	           
		}
		scanner.close();
			 
		for(int i=0; i<novoFuncionario.length; i++) {
			Funcionario funcionarios = novoFuncionario[i];
			System.out.println("\nFuncionario(a): "+funcionarios.getNome()+"\nMatrícula: "+funcionarios.getMatricula()+"\nValor de "+funcionarios.getTaxaInss(funcionarios.getSalario()) +"% do INSS: R$"+decimal.format(funcionarios.calcularInss()));
		}		 
	}  
}
