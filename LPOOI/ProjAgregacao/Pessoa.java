import java.util.Scanner;

public class Pessoa {
    public String nome;
    public int idade;
    private String sexo;
    
    
    
    public void setNome() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o nome: ");
       this.nome = s.nextLine();               
    }
    
    public void setIdade() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite a idade: ");
       this.idade = s.nextInt();               
    }
    
    public void setSexo() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o sexo: ");
       this.sexo = s.nextLine();               
    }
    
    public String getNome(){
        System.out.println("Nome: " + this.nome);
        
        return this.nome;
    }
    
    public int getIdade(){
        System.out.println("Idade: " + this.idade);
        
        return this.idade;
    }
    
    public String getSexo(){
        System.out.println("Sexo: " + this.sexo);
        
        return this.sexo;
    }
    
    public Pessoa(){
       
    }
    
    public void fazerAniversario(){
        
        this.idade++;
    }
}