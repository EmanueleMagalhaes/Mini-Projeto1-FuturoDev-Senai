class ProjetoReflorestamento extends ProjetoSustentavel implements ImpactoAmbiental {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas) {
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public double calcularImpacto() {
        return arvoresPlantadas * 0.05; // Exemplo de cálculo do impacto ambiental
    }


}
