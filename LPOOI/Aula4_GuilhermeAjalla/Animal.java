
public class Animal
{
   public String nome;
   public float comprimento;
   public int nPatas;
   public String cor;
   public String ambiente;
   public float vMedia;
   
   public Animal(String nome, float comprimento, int nPatas,String cor
   , String ambiente, float vMedia){
       this.nome = nome;
       this.comprimento = comprimento;
       this.nPatas = nPatas;
       this.cor = cor;
       this.ambiente = ambiente;
       this.vMedia = vMedia;
   }
   
   public Animal(){
       
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public void setComprimento(float comprimento){
       this.comprimento = comprimento;
   }
   
   public void setnPatas(int nPatas){
       this.nPatas = nPatas;
    }
    
   public void setCor(String cor){
       this.cor = cor;
   }
   
   public void setAmbiente(String ambiente){
       this.ambiente = ambiente;
   }
   
   public void setvMedia(float vMedia){
       this.vMedia = vMedia;
    }
    
   public String getNome(){
       System.out.println("Nome: " + this.nome);
       return this.nome;
    }
    
    public float getComprimento(){
       System.out.println("Comprimento: " + this.comprimento);
       return this.comprimento;
    }
    
    public int getnPatas(){
       System.out.println("Nº Patas: " + this.nPatas);
       return this.nPatas;
    }
    
    public String getCor(){
       System.out.println("Cor: " + this.cor);
       return this.nome;
    }
    
    public String getAmbiente(){
       System.out.println("Ambiente: " + this.ambiente);
       return this.ambiente;
    }
    
    public float getvMedia(){
       System.out.println("Velocidade Média: " + this.vMedia);
       return this.vMedia;
    }
    
    public String dados(){
        return "Animal\t\n{" + "\nNome= " + nome + "\nComprimento= " + comprimento +
            "\nNº de Patas= " + nPatas + "\nCor= " + cor +
            "\nAmbiente= " + ambiente + "\nV. Média= " + vMedia + "\n\t}";
    }
}
