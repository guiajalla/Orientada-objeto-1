
public class TestarAnimais
{
    public static void main(String[] args){
        Peixe p = new Peixe();
        Mamifero []m = new Mamifero[2];
        
        //A:
        m[0] = new Mamifero();
        m[0].setNome("Camelo");
        m[0].setComprimento(150f);
        m[0].setnPatas(4);
        m[0].setCor("Amarelo");
        m[0].setAmbiente("Terra");
        m[0].setvMedia(2.0f);
        
        //B:
        p.setNome("Tubarão");
        p.setComprimento(300f);
        p.setnPatas(0);
        p.setCor("Cinzento");
        p.setAmbiente("Mar");
        p.setvMedia(1.5f);
        p.setCarac("Barbatana e cauda");
        
        //C:
        m[1] = new Mamifero();
        m[1].setNome("Urso-do-canadá");
        m[1].setComprimento(180f);
        m[1].setnPatas(4);
        m[1].setCor("Vermelho");
        m[1].setAmbiente("Terra");
        m[1].setvMedia(0.5f);
        m[1].setAlimento("Mel");
        
        //D:
        p.dadosPeixe();
        
        m[0].dadosMamifero();
        
        m[1].dadosMamifero();
        
        
        
    }
}
