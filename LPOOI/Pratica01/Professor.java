import java.util.Scanner;

public class Professor extends Funcionario
{
    String titulacao;
    String areaPesquisa;
    
    public void lerDados(){
        super.lerDados();
        
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Digite a titulação do professor: ");
        this.titulacao = s.nextLine ();
        
        System.out.println ("Digite a área de pesquisa: ");
        this.areaPesquisa = s.nextLine();
        
    }
    
    public void mostrarDados(){
        System.out.println("Titulação do professor: " + this.titulacao);
        System.out.println("Área de pesquisa: " + this.areaPesquisa);  
    }
}
