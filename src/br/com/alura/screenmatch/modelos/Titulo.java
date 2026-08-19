package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private boolean incluidoNoPlano;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
        System.out.println("Incluidio no plano: " + incluidoNoPlano);
    }

    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes += 1;
    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

}
