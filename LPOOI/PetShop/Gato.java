public class Gato extends Animal{
    public String toString(){
        String gato1;
        
        gato1= "\n Gato:";
        gato1 += "\n Nome: " + this.getNome();
        gato1 += "\n Peso: " + this.getPeso();
        gato1 += "\n Raça: " + this.getRaca() + "\n";
        
        return gato1;
    }
}