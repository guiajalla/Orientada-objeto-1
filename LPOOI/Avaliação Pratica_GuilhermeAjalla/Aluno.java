import java.util.Scanner;

public class Aluno extends Pessoa
{
    private double nota;
    private Pessoa aluno;
    
    public Aluno(){
        
    }
    
    public Aluno(double nota){
        this.nota = nota;
            
    }
    
    public void setNota() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite a nota: ");
       this.nota = s.nextDouble();
    }
    
    public double getNota() {
        System.out.println("Nota: " + this.nota);
        
        return this.nota;        
    }
    
    public String toString(){
        return "Aluno\t{" + "\nNome: " + this.nome + "\nIdade: " + this.idade +
            "\nEndereco: " + this.endereco + "\nNota: " + this.nota + "\n\t}";
    }
}
