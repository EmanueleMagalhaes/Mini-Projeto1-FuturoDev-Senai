import java.util.ArrayList;
import java.util.List;

abstract class ProjetoSustentavel implements ImpactoAmbiental {
    private String nome;
    private String descricao;
    private List<Voluntario> voluntarios;
    private RelatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método para adicionar voluntário ao projeto
    public void adicionarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    // Método para gerar relatório de impacto
    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
    }

    // Método para exibir o relatório de impacto
    public void exibirRelatorio() {
        if (relatorioImpacto != null) {
            relatorioImpacto.exibirRelatorio();
        } else {
            System.out.println("Nenhum relatório gerado para este projeto.");
        }
    }
}