package model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private Conteudo conteudo;
    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(Conteudo conteudo, LocalDate data) {
        this.conteudo = conteudo;
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\n----Mentoria----" +
                "\ntitulo = " + getTitulo() +
                "\ndescricao = " + getDescricao() +
                "\ndata = " + data +
                "\n----------------";
    }
}
