
public class Pedido
{
    public String nomeProd;
    
    public Pedido(){
        
    }
    public void setnomeProd(String nomeProd){
        this.nomeProd = nomeProd;
    }
    
    public String getnomeProd(){
        System.out.println("Nome do produto: " + this.nomeProd);
        
        return this.nomeProd;
    }
}
