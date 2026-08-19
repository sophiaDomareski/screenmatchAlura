package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public int getClassificacao(){
        return (int) mediaDasAvaliacoes()/2;
    }
}
