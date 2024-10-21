public class Main {
    public static void main(String[] args) {
        CarroFachada carro = new CarroFachada();
        carro.iniciarViagem("FM 89.1");
        System.out.println( "dirigindo");
        carro.finalizarViagem();
    }
}

