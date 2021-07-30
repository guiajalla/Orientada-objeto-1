import java.util.Scanner;

public class Funcionario
{
    String nome;
    String endereco;
    String telefone;
    String cpf;
    String ctps;
    double salario;
    
    public void lerDados () {
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Digite o nome do funcionário: ");
        this.nome = s.nextLine ();
        
        System.out.println ("Digite o endereço do funcionário: ");
        this.endereco = s.nextLine();
        
        System.out.println ("Digite o telefone do funcionário: ");
        this.telefone = s.nextLine();
        
        System.out.println ("Digite o CPF do funcionário: ");
        this.cpf = s.nextLine();
        
        System.out.println ("Digite a CTPS do funcionário: ");
        this.ctps = s.nextLine();
        
        System.out.println ("Digite o salário do funcionário: ");

        
        
    }
    public void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Esdereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CPF: " + this.cpf);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salário: " + this.salario);
    }
}