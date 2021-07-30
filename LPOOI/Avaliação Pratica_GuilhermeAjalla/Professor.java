import java.util.Scanner;

public class Professor extends Pessoa
{
    private double salario;
    private Pessoa professor;
    
    public Professor(){
    
    }
    
    public Professor(double salario){
        this.salario = salario;
    }
    
    public void setSalario(){
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o salário: ");
       this.salario = s.nextDouble();     
    }
    
    public double getSalario() {
        System.out.println("Salário: " + this.salario);
        
        return this.salario;        
    }
    
    public String toString(){
        return "Professor\t{" + "\nNome: " + this.nome + "\nIdade: " + this.idade +
            "\nEndereco: " + this.endereco + "\nSalário: R$ " + this.salario + "\n\t}";
    }
}
