public class Main{
    public static void main(String[] args){
        Pessoa []p = new Pessoa[3];
        Livro []l = new Livro[4];
        
        /*p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa ("Maria", 24, "F");
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("Java Plus", "Maria Silva", 500, p[1]);
        l[2] = new Livro("Biblia do Java", "Josildo da Silva", 400, p[0]);
        l[0].abrir();
        l[0].folhear(100);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[2].detalhes());*/ //Parte do Exemplo.
        
        p[2] = new Pessoa();
        p[2].setNome();
        p[2].setIdade();
        p[2].setSexo();
    
        l[3] = new Livro();
        l[3].setTitulo();
        l[3].setAutor();
        l[3].settotPaginas();
        l[3].setLeitor(p[2]);
        l[3].abrir();
        
        System.out.println(l[3].detalhes());
        
        
        
        
        
        
    }

}