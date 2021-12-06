package br.com.alirismaurera.leitura.testesescrita;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

        PrintStream file = new PrintStream("Prova-arquivo2.txt");

        file.printf("Hola aliris");
        file.println();
        file.println("--------------------");

        file.println("Hola sebastian");



        file.close();

    }
}
