// Subclasse de Projeto Sustentável para Energia Renovável
class ProjetoEnergiaRenovavel extends  ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    // Implementação do método calcularImpacto
    @Override
    public double calcularImpacto() {
        System.out.println("Impacto: " + energiaGerada + " MW de energia renovável gerada.");
        return energiaGerada; // Retornando o valor conforme exigido pela interface
    }
}

