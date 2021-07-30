import java.util.Scanner;
public class Cliente extends Pessoa
{
 
    String produto;
    double valor;
    
    public void lerDadosClinte(){
       Scanner s = new Scanner(System.in);        
         
       System.out.println("Digite o produto: ");
       this.produto = s.nextLine();
       
       System.out.println("Digite a valor: ");
       this.valor = s.nextDouble();
    }
        
    public String toString(){
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Endereço: " + this.endereco + 
        "Produto: "+ this.produto+ ",Valor:" + this.valor;
    }
        
}
