package tentativa3;
public class Pessoa {
    private String nome;
    int idade;

    public String getNome(){
        return nome;
    }

    //Setter
    public void setNome(String nome){
        this.nome = nome; 
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
