package br.com.alirismaurera.colettions;

import com.sun.source.doctree.SeeTree;

import java.util.Iterator;
import java.util.Set;

public class TestaCurso {

    public static void main(String[] args) {

        Cursos javacurso = new Cursos("Java", "Aliris Maurera");

        javacurso.adicionaAula(new Aula("Trabalhando com ArrayList", 21));
        javacurso.adicionaAula(new Aula("Criando uma Aula", 20));
        javacurso.adicionaAula(new Aula("Modelando com coleções", 22));

        Aluno aluno1 = new Aluno("Aliris", 2451);
        Aluno aluno2 = new Aluno("Sebastian", 2587);
        Aluno aluno3 = new Aluno("Franlis", 3698);

        javacurso.matricular(aluno1);
        javacurso.matricular(aluno2);
        javacurso.matricular(aluno3);

        System.out.println("Alunos matriculados");
        javacurso.getAlunos().forEach(alu -> System.out.println(alu));

        boolean matriculado = javacurso.estaMatriculado(aluno1);
        System.out.println("O aluno " + aluno1.getNome() + " esta matriculado? " + matriculado);

        Aluno aluno4 = new Aluno("Aliris",2451);
        System.out.println(aluno1.equals(aluno4));

        System.out.println("----------------------------------");
        Set<Aluno> alu = javacurso.getAlunos();
        Iterator<Aluno> iterator = alu.iterator();
        while (iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        System.out.println("----------------------------------");
        Aluno nomeAluno = javacurso.buscaMatricula(2222);
        System.out.println(nomeAluno);
    }
}
