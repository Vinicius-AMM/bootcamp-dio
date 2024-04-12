package model;

import java.util.*;

public class Dev {
    private String nome;
    Set<Conteudo> conteudosMatriculados = new LinkedHashSet<>();
    Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosMatriculados() {
        return conteudosMatriculados;
    }

    public void setConteudosMatriculados(Set<Conteudo> conteudosMatriculados) {
        this.conteudosMatriculados = conteudosMatriculados;
    }

    public Set<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosMatriculados.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Dev dev = (Dev) object;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosMatriculados, dev.conteudosMatriculados) && Objects.equals(conteudosFinalizados, dev.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosMatriculados, conteudosFinalizados);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosMatriculados.stream().findFirst();
        if(conteudo.isPresent()){
            conteudosFinalizados.add(conteudo.get());
            conteudosMatriculados.remove(conteudo.get());
        }else {
            System.out.println("Voce nao esta matriculado em nenhum conteudo!");
        }
    }

    public double calcularTotalXp(){
        Iterator<Conteudo> iterator = this.conteudosFinalizados.iterator();
        double sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next().calcularXP();
        }
        return sum;
    }

}
