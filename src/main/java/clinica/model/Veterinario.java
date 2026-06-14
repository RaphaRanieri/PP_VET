package clinica.model;

public class Veterinario {

    private final String nome;
    private final String crmv;

    public Veterinario(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }

    public String getNome() { return nome; }
    public String getCrmv() { return crmv; }

    @Override
    public String toString() { return nome + " (CRMV: " + crmv + ")"; }
}
