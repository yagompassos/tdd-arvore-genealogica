package familia;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private List<Pessoa> filhos;
    
    private Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.filhos = new ArrayList<>();

    }
    
    public static Pessoa criar(String nome, String sobrenome) {
        return new Pessoa(nome, sobrenome);
    }
    
    public void addFilho(Pessoa p) {
    	this.filhos.add(p);
    }
    
    // Getters
    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public List<Pessoa> getFilhos() {return filhos; }
}