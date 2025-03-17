// Subclasse de Projeto Sustentável para Reciclagem
class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas) {
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    // Implementação do método calcularImpacto
    @Override
    public double calcularImpacto() {
        return toneladasRecicladas * 0.1; // Exemplo de cálculo
    }
}

