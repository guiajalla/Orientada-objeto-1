import java.util.Scanner;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void setTitulo() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o titulo: ");
       this.titulo = s.nextLine();
    }
    
    public void setAutor() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o autor: ");
       this.autor = s.nextLine();
    }
    
    public void settotPaginas() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o total de páginas: ");
       this.totPaginas = s.nextInt();
    }
    
    public void setLeitor(Pessoa leitor) {
       this.leitor = leitor;      
    }
    
    public void abrir(){
        this.aberto = true;
    }
    
    public void fechar(){
        this.aberto = false;
    }
    
    public void folhear(int p) {
        if (p> this.totPaginas) {
            this.pagAtual=0;
        }
        else
        this.pagAtual=p;
    }
    
    public void avancarPag(){
        this.pagAtual++;
    }
    
    public void voltarPag(){
        this.pagAtual--;
    }
    
    public String getTitulo(){
        System.out.println("Titulo: " + this.titulo);
        
        return this.titulo;
    }
    
    public String getAutor(){
        System.out.println("Autor: " + this.autor);
        
        return this.autor;
    }
    
    public int gettotPaginas(){
        System.out.println("Total de páginas: " + this.totPaginas);
        
        return this.totPaginas;
    }
    
    public boolean getAberto(){
        System.out.println("Livro foi aberto: " + this.aberto);
        
        return this.aberto;
    }
    
    public Livro(){
        
    }
    
    public String detalhes(){
        return "Livro\t{" + "\ntitulo= " + titulo + "\nautor= " + autor +
            "\ntotPaginas= " + totPaginas + "\npagAtual= " + pagAtual +
            "\naberto= " + aberto + "\nleitor= " + leitor.getNome() +
            "\nidade= " + leitor.getIdade() + "\nsexo= " + leitor.getSexo()+"\n\t}";
    }
}