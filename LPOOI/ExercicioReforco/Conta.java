
/**
 * 
 * @guiajalla (Guilherme Ajalla 
 */
public class Conta
{
    private String titular;
    private int numero;
    private double saldo = 0;
    
    void depositar (double valor) {
        this.saldo  = this.saldo + valor;
    }
    
    boolean sacar (double valor) {
        if (this.saldo>=valor){
            this.saldo-=valor;
            return(true);
        }
        else
            return false;       
    }
}
