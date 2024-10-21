public class CarroFachada {
    private Motor motor;
    private CintoDeSeguranca cintoDeSeguranca;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada() {
        this.motor = new Motor();
        this.cintoDeSeguranca = new CintoDeSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void iniciarViagem(String estacaoPreferida) {
        motor.ligar();
        porta.trancar();
        cintoDeSeguranca.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacao(estacaoPreferida);
        System.out.println("Pronto para dirigir!");
    }

    public void finalizarViagem() {
        motor.desligar();
        porta.destrancar();
        cintoDeSeguranca.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Viagem finalizada.");
    }
}

