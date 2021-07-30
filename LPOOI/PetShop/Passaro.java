public class Passaro extends Animal{
    public String toString(){
        String passaro1;
        
        passaro1= "\nPassaro:";
        passaro1 += "\nNome: " + this.getNome();
        passaro1 += "\nPeso: " + this.getPeso();
        passaro1 += "\nRaça: " + this.getRaca() + "\n";
        
        return passaro1;
    }
}