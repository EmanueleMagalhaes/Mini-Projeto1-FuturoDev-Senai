class Voluntario {
    private String nome;
    private String email;

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Método para o voluntário participar de um projeto
    public void participarProjeto(ProjetoSustentavel projeto) {
        projeto.adicionarVoluntario(this);
    }
}