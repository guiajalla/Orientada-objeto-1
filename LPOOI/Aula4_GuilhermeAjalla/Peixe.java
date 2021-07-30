
public class Peixe extends Animal
{
    public String carac;
    private Animal aPeixe;
    
    public void setCarac(String carac){
        this.carac = carac;
    }
    
    public void setAnimal(Animal aPeixe){
       this.nome = nome;
       this.comprimento = comprimento;
       this.nPatas = nPatas;
       this.cor = cor;
       this.ambiente = ambiente;
       this.vMedia = vMedia;
    }
    
    public String getCarac(){ 
       System.out.println("Caracteristica: " + this.carac);
       return this.carac;
    }
    
    public void dadosPeixe(){
        System.out.println("\nPeixe\n\t{");
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Nº Patas: " + this.nPatas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Vel. Média: " + this.vMedia);
        System.out.println("Caracteristica: " + this.carac);
        System.out.println("\t}");
    }
}
