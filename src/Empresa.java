// Subclasse Empresa, que herda de Organizacao

class Empresa extends Organizacao {
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
}
