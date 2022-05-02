package gradlegs;

public  class App {
    public static void main(String[] args) {
        Genero g = new Genero();
        g.setId(10);
        g.setNome("Aventura");
        
        PessoaFisica p = new PessoaFisica();
        p.setNome("José da Silva");
        p.setCpf("65498712354");

        System.out.println("Olá Gradle");
        System.out.println(g.getNome());
    
    }
}

// o atributo protegido ele só é acessivel pelas classe herdeiras e a propria classe
//atributo funciona como uma variavel da classe 
//no metodo privado somente quem está na mesma classe pode acessá-lo 