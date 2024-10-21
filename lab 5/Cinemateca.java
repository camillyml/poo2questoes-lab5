public class Cinemateca {
    
    Pipoqueira pipoca = new Pipoqueira();
    Luzes luzes = new Luzes();
    Telão telao = new Telão();
    Projetor projetor = new Projetor();
    Amplificador amp = new Amplificador();
    Player player = new Player();

    public void ritualDomingo(){

        pipoca.liga();
        pipoca.fazPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amp.liga();
        amp.ajustaVolume(10);
        player.liga();
        player.daPlay();

    }

    public void fimFilme(){
        pipoca.desliga();
        luzes.liga();
        telao.sobe();
        projetor.desliga();
        amp.desliga();
        player.desliga();
    }
}
