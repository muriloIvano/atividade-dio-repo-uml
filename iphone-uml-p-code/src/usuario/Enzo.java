package usuario;

import aparelho.Iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Enzo {
    public static void main(String[] args) {
        
  
    Iphone iphoneDoEnzo = new Iphone();

    iphoneDoEnzo.atender();
    iphoneDoEnzo.ligar();
    iphoneDoEnzo.iniciarCorreioVoz();

    System.out.println("============================");
    iphoneDoEnzo.tocar();
    iphoneDoEnzo.pausar();
    iphoneDoEnzo.selecionarMusica();
    System.out.println("============================");
    iphoneDoEnzo.atualizarAba();
    iphoneDoEnzo.adicionarNovaAba();
    iphoneDoEnzo.exibirPagina();
}
}