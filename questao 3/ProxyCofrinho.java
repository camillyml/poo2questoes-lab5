public class ProxyCofrinho {
    private Cofrinho cofrinho;
    private Pessoa pessoa;

    public ProxyCofrinho(Cofrinho cofrinho, Pessoa pessoa) {
        this.cofrinho = cofrinho;
        this.pessoa = pessoa;
    }

    public void acessarCofrinho() {
        if (pessoa.getIdade() >= 18) {
            cofrinho.abrir();
        } else {
            System.out.println("Acesso negado. Somente adultos podem abrir o cofrinho.");
        }
    }
}

