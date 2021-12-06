package br.com.alirismaurera.colettions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestandoListas {

    public static void main(String[] args) {

       Aula aula1 = new Aula("Revistando as arrayList", 21);
       Aula aula2 = new Aula("Lista de Objetos", 30);
       Aula aula3 = new Aula("Relacionamento de listas e Objetos", 15);

       ArrayList<Aula> aulas = new ArrayList<>();
       aulas.add(aula1);
       aulas.add(aula2);
       aulas.add(aula3);

        System.out.println(aulas);
        System.out.println("---------------------------------");

        Collections.sort(aulas);

        System.out.println(aulas);
        System.out.println("----------------------------------");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
        System.out.println("----------------------------------");
        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
