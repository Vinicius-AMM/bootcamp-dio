package application;

import model.Bootcamp;
import model.Curso;
import model.Dev;
import model.Mentoria;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java basico");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Python Intermediario");
        curso2.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria java basico");
        mentoria1.setData(LocalDate.now());

        Set<Curso> cursos = new HashSet<>();
        cursos.add(curso1);
        cursos.add(curso2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java");
        bootcamp1.setDescricao("Bootcamp java projeto");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devVini = new Dev();
        devVini.setNome("Vinicius");
        devVini.inscreverBootcamp(bootcamp1);
        System.out.println("\n----Seus Conteudos----\n" + "Aluno: " + devVini.getNome().toUpperCase() + "\n" + devVini.getConteudosMatriculados());
        devVini.progredir();
        devVini.progredir();
        System.out.println();
        System.out.println("-----Conteudos Matriculados:-----" + devVini.getConteudosMatriculados());
        System.out.println("\n-----Conteudos Finalizados:-----" + devVini.getConteudosFinalizados());
        System.out.println("XP: " + devVini.calcularTotalXp());
        System.out.println("===============================");

        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("\n----Seus Conteudos----\n" + "Aluno: " + dev2.getNome().toUpperCase() + "\n" + dev2.getConteudosMatriculados());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println();
        System.out.println("-----Conteudos Matriculados:-----" + dev2.getConteudosMatriculados());
        System.out.println("\n-----Conteudos Finalizados:-----" + dev2.getConteudosFinalizados());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("===============================");
    }
}
