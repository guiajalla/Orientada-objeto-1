import java.util.Scanner;

public class alunoposGraduacao extends Aluno
{
    String graduacao;
    String instituicao;
    String inicioGrad;
    String fimGrad;
    
    public void lerDados()
    {
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Digite a sua graduação: ");
        this.graduacao = s.nextLine ();
        
        System.out.println ("Digite o nome da instutição que se graduou: ");
        this.instituicao = s.nextLine ();
        
        System.out.println ("Digite o ano de inicio da sua graduação: ");
        this.inicioGrad = s.nextLine ();
        
        System.out.println ("Digite o ano de conclusão da sua graduação: ");
        this.fimGrad = s.nextLine ();
        
        
    }
    public void mostrarDados(){
        System.out.println("Graduado: " + this.graduacao);
        System.out.println("Instituição: " + this.instituicao); 
        System.out.println("Ano de inicio: " + this.inicioGrad);
        System.out.println("Ano de término: " + this.fimGrad);
    }
}
