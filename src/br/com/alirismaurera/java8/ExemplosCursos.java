package br.com.alirismaurera.java8;

import java.util.*;

public class ExemplosCursos {

    public static void main(String[] args) {
        //Instanceando Cusos
        List<Cursos> curso = new ArrayList<Cursos>();

        //Adicionando curso
        curso.add(new Cursos("Aliris",1));
        curso.add(new Cursos("Sebastian",6));
        curso.add(new Cursos("Franklin",4));
        curso.add(new Cursos("Franlis",5));
        curso.add(new Cursos("Iris",3));
        curso.add(new Cursos("Maria",2));

        //Oredenando por nome
        curso.sort((Comparator.comparing(c -> c.getNome())));
        curso.forEach(c -> System.out.println(c));

        System.out.println();

        //Fitrando po numero de aluno maior a 3
        curso.stream().filter(c -> c.getNumeroAlunos() >= 3).forEach(System.out::println);

        //
        curso.stream().filter(c -> c.getNumeroAlunos() >= 3)
                .map(Cursos::getNumeroAlunos).forEach(System.out::println);

        //

    }


}

class Cursos {

    private String nome;
    private int numeroAlunos;

    public Cursos(String nome, int numeroAlunos) {
        this.nome = nome;
        this.numeroAlunos = numeroAlunos;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    @Override
    public String toString() {
        return "Cursos {" +
                " Nome= " + nome +
                ", NumeroAlunos= " + numeroAlunos +
                '}';
    }
}
