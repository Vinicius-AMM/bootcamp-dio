package model;

public class Curso extends Conteudo{
    private Conteudo conteudo;
    private int cargaHoraria;

    public Curso() {
    }
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n----Curso----" +
                "\ntitulo = " + getTitulo() +
                "\ndescricao = " + getDescricao() +
                "\ncargaHoraria = " + cargaHoraria +
                "\n-------------";
    }
}
