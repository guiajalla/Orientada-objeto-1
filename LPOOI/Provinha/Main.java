public class Main{
     
   public static void main(String[] args){
       
       Cliente cliente = new Cliente();
       Vendedor vendedor = new Vendedor();
       
       cliente.lerDados();
       cliente.lerDadosClinte();
      
       
       vendedor.lerDados();
       vendedor.lerDadosVendedor();
       vendedor.setCliente(cliente);
       vendedor.fazerAniversario();
       vendedor.toString(); 
       
    }
}