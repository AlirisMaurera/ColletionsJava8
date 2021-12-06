package br.com.alirismaurera.leitura.testesescrita;


import java.io.*;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {


//        FileOutputStream file = new FileOutputStream("Prova-arquivo2.txt");
//        OutputStreamWriter sr =new OutputStreamWriter(file);
//        BufferedWriter br = new BufferedWriter(sr);


        BufferedWriter file = new BufferedWriter(new FileWriter("Prova-arquivo2.txt"));
        file.write("Hola aliris");
        file.write(System.lineSeparator());
        file.write("--------------------");
        file.write(System.lineSeparator());
        file.write("Hola sebastian");


        file.close();

    }
}
