public class Cachorro extends Animal{
    public String toString(){
        String cachorro1;
        
        cachorro1= "\nCachorro:";
        cachorro1 += "\nNome: " + this.getNome();
        cachorro1 += "\nPeso: " + this.getPeso();
        cachorro1 += "\nRaça: " + this.getRaca() + "\n";
        
        return cachorro1;
    }
}