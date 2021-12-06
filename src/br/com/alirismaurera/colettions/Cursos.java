package br.com.alirismaurera.colettions;

import com.sun.source.tree.IfTree;

import java.util.*;

public class Cursos {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private int tempoTotal=0;
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matriculaAluno = new HashMap<>();


    public Cursos(String nome, String instrutor) {
        if (nome == null){
           throw new NullPointerException("Nome não pode ser null");
        }
        this.nome = nome;
        this.instrutor = instrutor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void matricular(Aluno aluno1) {
        this.alunos.add(aluno1);
        this.matriculaAluno.put(aluno1.getMatricula(), aluno1);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno1) {
        return this.alunos.contains(aluno1);
    }

    public int getTempoTotal() {
        for (Aula aula: aulas) {
            tempoTotal+=aula.getTempo();
        }
        return tempoTotal;
    }

    public void adicionaAula(Aula aula){
        aulas.add(aula);
    }

    public Aluno buscaMatricula(int numero) {
        return matriculaAluno.get(numero);
    }

    @Override
    public String toString() {
        return "Cursos{" +
                " Nome='" + nome + '\'' +
                ", Instrutor='" + instrutor + '\'' +
                ", Aulas= " + aulas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Aluno outro = (Aluno) o;
        return this.nome.equals(outro.getNome());
    }



}
