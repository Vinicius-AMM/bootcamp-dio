package model;

public class Devs {
    private String nome;
    private Mentorias mentorias;
    private Cursos cursos;

    public Devs(String nome, Mentorias mentorias, Cursos cursos) {
        this.nome = nome;
        this.mentorias = mentorias;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mentorias getMentorias() {
        return mentorias;
    }

    public void setMentorias(Mentorias mentorias) {
        this.mentorias = mentorias;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

}
