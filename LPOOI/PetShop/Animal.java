import java.util.Scanner;

public class Animal {
    private double peso;
    private String nome;
    private String raca;
    
    public void setNome() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o nome: ");
       this.nome = s.nextLine();               
    }
    
    public void setRaca() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o raça: ");
       this.raca = s.nextLine();
    }
    
    public void setPeso() {
       Scanner s = new Scanner(System.in);
        
       System.out.println("Digite o peso: ");
       this.peso = s.nextDouble();
    }
    
    public String getNome(){
        System.out.println("Nome: " + this.nome);
        
        return this.nome;
    }
    
    public double getPeso(){ 
        System.out.println("Peso: " + this.peso); 
        
        return this.peso;
    }
    
    public String getRaca(){
        System.out.println("Raca: " + this.raca);
        
        return this.raca;
    }
    
   
}