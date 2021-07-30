import java.util.Scanner;

public class Aluno extends Curso
{
    String nome;
    String matricula;
    String cpf;
    Curso curso;
    
    public void lerDados(){
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Digite o nome do aluno: ");
        this.nome = s.nextLine ();
        
        System.out.println ("Digite a matricula do aluno: ");
        this.matricula = s.nextLine();
        
        System.out.println ("Digite o CPF do aluno: ");
        this.cpf = s.nextLine();        
    }
    
    public void mostrarDados(){
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula: " + this.matricula); 
        System.out.println("CPF: " + this.cpf);
    }
}