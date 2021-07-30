import java.util.Scanner;

public class Disciplina
{
    int codigo;
    String nome;
    int carga_horaria;
    Curso curso;
    Professor professor;
    
    public void lerDados(){
        Scanner s = new Scanner(System.in);
        System.out.println ("Digite o nome da disciplina: ");
        this.nome = s.nextLine();
        
        System.out.println ("Digite o código da disciplina: ");
        this.codigo = s.nextInt();
        
        System.out.println ("Digite a carga horária da disciplina: ");
        this.carga_horaria = s.nextInt();
    }
    public void mostrarDados(){
        System.out.println("Nome da disciplica: " + this.nome);
        System.out.println("Carga horária: " + this.carga_horaria);
        System.out.println("Código: " + this.codigo);
    }
    
}