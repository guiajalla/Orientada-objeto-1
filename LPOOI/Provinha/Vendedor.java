import java.util.Scanner;
public class Vendedor extends Pessoa
{
   double salario;
   Cliente cliente;
   
   public void lerDadosVendedor()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o salario: ");
        this.salario = s.nextDouble();
    }
   
   public void mostrarDados(){
        System.out.println("Salario: " + this.salario);  
   }
   
   public void fazerAniversario()
   {
       this.idade += 1;
       System.out.println("Parabéns vôce tem " + this.idade + " anos.");
   }
   
   public void setCliente(Cliente cli){
       this.cliente = cli;
   }
   
   public String toString()
   {
       return "Nome: " + this.nome + ", Idade: " + this.idade + ", Endereço: " + this.endereco + "Salario: " 
       + this.salario + ", Cliente: " + this.cliente.toString();
   }
}
