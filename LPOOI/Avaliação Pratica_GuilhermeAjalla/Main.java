public class Main
{
   public static void main(String[] args){
       Aluno a = new Aluno();
       Professor p = new Professor();
       
       System.out.println("--- Bem vindo a Escola Sgobbi ---");
       System.out.println("Informações do Aluno:            ");
       a.setNome();
       a.setIdade();
       a.setEndereco();
       a.setNota();
       System.out.println("---------------------------------\n");
       
       System.out.println("Informações do Professor:        ");
       p.setNome();
       p.setIdade();
       p.setEndereco();
       System.out.println("R$ "); p.setSalario();
       System.out.println("\n---------------------------------\n");
       
       System.out.println(a.toString());
       System.out.println("\n---------------------------------\n");
       System.out.println(p.toString());
       
    }
}
