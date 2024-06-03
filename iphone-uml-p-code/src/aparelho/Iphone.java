package aparelho;
import javax.swing.plaf.synth.SynthStyleFactory;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando música...");
    }

  
    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarAba() {
        System.out.println("Atualizando a página...");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

}
