import java.util.ArrayList;

public class Testar {
    public static ArrayList<Animal> alist = new ArrayList<Animal>();

    public static void main (String [] args){
        Gato addGato = new Gato();
        
        addGato.setNome();
        addGato.setRaca();
        addGato.setPeso();
        alist.add(addGato);
        
        Cachorro addCao = new Cachorro();
        addCao.setNome();
        addCao.setRaca();
        addCao.setPeso();
        alist.add(addCao);
        
        Passaro addPassaro = new Passaro();
        addPassaro.setNome();
        addPassaro.setRaca();
        addPassaro.setPeso();
        alist.add(addPassaro);
      
        
        for (int i=0; i<alist.size();i++){
                System.out.println(alist.get(i).toString());
        }
    }
    
}
