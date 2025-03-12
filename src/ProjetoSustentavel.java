import java.util.List;

public class ProjetoSustentavel {
    //Atributos
    private String nome; // nome do projeto
    private String descricao; // Descricao do projeto
    private List<Voluntario> voluntarios; // Lista de voluntários
    private RelatorioImpacto relatorioImpacto; // Relatorio de impacto ambiental do projeto

    //Metodos

    // exibe relatorio INDIVIDUAL do projeto
    public String exibirDetalhes(){
        return String.format("Nome do Projeto: %s\n Descrição do projeto: %s", nome, descricao);

    }

    public void adicionarVoluntario(Voluntario voluntario) {

    }

    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {

    }

}
