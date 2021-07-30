public class funcionarioTeste {
    
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        
        f.getFuncionario();
        f.demite();
        f.bonifica();
        f.mostra();
        
        Funcionario f1 = new Funcionario();
        f1.getFuncionario();
        
        Funcionario f2 = new Funcionario();
        f2.getFuncionario();
        
        f.funcIguais(f1, f2);
      
    }
    
   
    
}