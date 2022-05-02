package gradlegs;

public abstract class Pessoa {
    private String nome;
    protected String numRf;

    public abstract void setNumRf(String numRf);
    public abstract String getNumRf();


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
