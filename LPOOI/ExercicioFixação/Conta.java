
/**
 * @guiajalla (seu nome) 
 * @version (número de versão ou data)
 */
public class Conta
{
    private int numero;
    private int digito;
    private float saldo;
    private String titular;
    
    public void getTitular(String titular)
    {
      this.titular = titular;  
    }
    
    public String setTitular(){
        return titular;
    }
    
    public void getNumero(int numero){
        this.numero = numero;
    }
    
    public int setNumero(){
        return numero;
    }
    
    public void getDigito(int digito){
        this.digito = digito;
    }
    
    public int setDigito(){
        return digito;
    }
    
    public void getSaldo(float digito){
        this.saldo = saldo;
    }
    
    public float setSaldo (){
        return saldo;
    }

}
