
/**
 * @guiajalla (Guilherme Ajalla Ferreira) 
 * @version (número de versão ou data)
 */
public class Pessoa extends Conta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String endereco;
    private String cidade;
    private String bairro;
    private String estado;
    private int fone;
    private String email;
    private String cpf;
    private String rg;
    
public void setNome (String nome){
    this.nome=nome;
}

public String getNome(){
    return nome;
}

public void setEndereco (String endereco){
    this.endereco = endereco;
}

public String getEndereco(){
    return endereco;
}

public void setCidade(String cidade){
    this.cidade = cidade;
}

public String getCidade(){
    return cidade;
}

public void setBairro(String bairro){
    this.bairro = bairro;
}

public String getBairro(){
    return bairro;
}

public void setEstado(String estado){
    this.estado = estado;
}

public String getEstado(){
    return estado;
}

public void setFone(int fone){
    this.fone = fone;
    }

public int getFone(){
    return fone;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getCpf(){
    return cpf;
}

public void setRg(String rg){
    this.rg = rg;
}

public String getRg(){
    return rg;
}

public void getEmail(String email){
    this.email = email;
}

public String setEmail(){
    return email;
}
}
