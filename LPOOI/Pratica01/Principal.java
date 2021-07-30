public class Principal {
    public static void main(String args[]){
        Aluno a = new Aluno();
        a.lerDados();
        a.mostrarDados();
        
        Disciplina d = new Disciplina();
        d.lerDados();
        d.mostrarDados();
        
        Professor p = new Professor();
        p.lerDados();
        p.mostrarDados();
        
        Funcionario f = new Funcionario();
        f.lerDados();
        f.mostrarDados();
    }
}