package br.com.alirismaurera.java8;

import java.time.LocalDate;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        LocalDate rio = LocalDate.of(2022, 06,13);
        int anos = rio.getYear() - hoje.getYear();
        System.out.println(anos);

    }
}
