public class Produto extends Pedido
{
    public float preco;
    public int quantidade;
    
    public Produto(){
        
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public float getPreco(){
        System.out.println("Preço: " + this.preco);
        
        return this.preco;
    }
    
    public float getQuantidade(){
        System.out.println("Quantidade: " + this.preco);
        
        return this.preco;
    }
}
