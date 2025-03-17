import java.util.ArrayList;
import java.util.List;

class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos;

    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    // Método para adicionar um projeto à organização
    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }

    // Método para listar os projetos da organização
    public void listarProjetos() {
        System.out.println("Projetos da organização " + nome + ":");
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("- " + projeto.getNome());
        }
    }

    public List<ProjetoSustentavel> getListaProjetos() {
        return listaProjetos;
    }
}
