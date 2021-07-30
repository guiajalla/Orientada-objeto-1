import java.util.Scanner;

public class Pessoa
{
     String nome;
     int idade;
     String endereco;
    public void lerDados()
    {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite o nome: ");
       this.nome = s.nextLine();
       
       System.out.println("Digite a idade: ");
       this.idade = s.nextInt();
       
       System.out.println("Digite o endereço: ");
       this.endereco = s.nextLine();
    }
    
    public void mostrarDados()
    {
        System.out.println("Nome: " + this.nome); 
        System.out.println("Idade: " + this.idade); 
        System.out.println("Endereço: " + this.endereco); 
    }
}
