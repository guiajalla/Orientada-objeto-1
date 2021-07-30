public class Mamifero extends Animal
{
    public String alimento;
    private Animal aMamifero;
    
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }
    
    public void setAnimal(Animal aMamifero){
       this.nome = nome;
       this.comprimento = comprimento;
       this.nPatas = nPatas;
       this.cor = cor;
       this.ambiente = ambiente;
       this.vMedia = vMedia;
    }
    
    public String getAlimento(){
       System.out.println("Caracteristica: " + this.alimento);
       return this.alimento;
    } 
    
    public void dadosMamifero(){
        System.out.println("\nMamifero\n\t{");
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Nº Patas: " + this.nPatas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Vel. Média: " + this.vMedia);
        System.out.println("Alimento: " + this.alimento);
        System.out.println("\t}");
    }
}
