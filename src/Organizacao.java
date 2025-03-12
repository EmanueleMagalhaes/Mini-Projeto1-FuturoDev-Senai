import java.util.ArrayList;
import java.util.List;

public class Organizacao {

    //Atributos
    private String nome;
    private ArrayList<ProjetoSustentavel> projetos;

    //Construtor vazio
    public Organizacao() {
    }

    //Construtor parametrizado
    public Organizacao(String nome, ArrayList<ProjetoSustentavel> listaProjetos) {
        this.nome = nome;
        this.projetos = listaProjetos;
    }

    // get e Set (para realizar o encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ProjetoSustentavel> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<ProjetoSustentavel> projetos) {
        this.projetos = projetos;
    }

    //Metodos
    public void adicionarProjeto(ProjetoSustentavel projeto) {
        this.projetos = new ArrayList<>();
    }


    //Lista todos os projetos cadastrados na organização

    public String listaProjetos() {
        String resultado = "";
        for(ProjetoSustentavel projeto : projetos){
            resultado += projeto.exibirDetalhes() + "\n";

        }
        return resultado;
    }

}
