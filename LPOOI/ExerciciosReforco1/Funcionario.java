public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;
    double aumento;
    boolean funcIguais;
    
    public void getFuncionario(){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        estaNaEmpresa = true;
    }
    
    public void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("dataEntrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);        
    }
    
    public void bonifica() {
        this.aumento = aumento;
        salario = salario + aumento;
    }
    
    public void demite (){
        estaNaEmpresa = false;
        
    }
    
    public boolean funcIguais (Funcionario f1, Funcionario f2) {
        
        if (f1.nome == f2.nome){
        return true;   
        }
        else{
        return false;
        }
    }
}