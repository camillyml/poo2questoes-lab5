public class Main {
    public static void main(String[] args) {
        
        Cofrinho cofrinho = new Cofrinho();

        
        Pessoa pessoaMenor = new Pessoa("João", 10);
        Pessoa pessoaMaior = new Pessoa("Maria", 25);

       
        ProxyCofrinho proxy1 = new ProxyCofrinho(cofrinho, pessoaMaior);
        ProxyCofrinho proxy2 = new ProxyCofrinho(cofrinho, pessoaMenor);

       
        proxy1.acessarCofrinho();  
        proxy2.acessarCofrinho();  
    }
}

