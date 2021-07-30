import java.util.Scanner;

public class Pessoa
{
   public String nome;
   public int idade;
   public String endereco;
   
   public Pessoa(String nome, int idade, String endereco){
       this.nome = nome;
       this.idade = idade;
       this.endereco = endereco;       
    }
    
   public Pessoa(){
    }
   
   public void setNome() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o Nome: ");
       this.nome = s.nextLine();
    }
    
   public void setIdade() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite a idade: ");
       this.idade = s.nextInt();
    }
    
   public void setEndereco() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o endereço: ");
       this.endereco = s.nextLine();
    }
    
   public String getNome(){
        System.out.println("Nome: " + this.nome);
        
        return this.nome;
    }
    
   public int getIdade(){
        System.out.println("Idade: " + this.idade);
        
        return this.idade;
    }
   
   public String getEndereco(){
        System.out.println("Endereço: " + this.endereco);
        
        return this.endereco;
    } 
}
